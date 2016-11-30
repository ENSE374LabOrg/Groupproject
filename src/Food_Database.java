import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Food_Database {
private List<Food> items;
	
	public Food_Database(){ // Default constructor
		this.items = new ArrayList<Food>();
	}
	public Food_Database(ArrayList<Food> items){//Constructor
		this.items = items;
	}
	
	public void addItem(Food item){//Adds a item to the items list
		this.items.add(new Food(item));
	}
	public boolean removeItem(String removename){ //Removes Item with given name
		if(this.items.isEmpty()){
			System.out.println("No Items in list");
		}
		else{
			for(int i =0; i < items.size(); i++){
				if(items.get(i).getName().equals(removename)){
					if(items.remove(i) != null){
						System.out.println("Item found, being removed now");
						return true;
					}	
				}	
			}
		}
		return false;
	}
	public ArrayList<Food> matchNutrient(String nutrient){//returns list of items that match the search criteria
		ArrayList<Food> matches = new ArrayList<Food>();
		for(int i = 0; i < this.items.size(); i++){
			
			for(int j = 0; j < this.items.get(i).nutrientSize(); j++){
				if(items.get(i).getnutrient(j).equals(nutrient)){
					matches.add(this.items.get(i));
				}
			}
		}
		if(matches.isEmpty()){
			System.out.println("No item with specified Nutrient was found");
		}
		return matches;
		
	}
	public ArrayList<Food> matchallergy(String allergy){//returns list of items that match the search criteria
		ArrayList<Food> matches = new ArrayList<Food>();
		for(int i = 0; i < this.items.size(); i++){
			for(int j = 0; j < this.items.get(i).allergiesSize(); j++){
				if(items.get(i).getallergy(j).equals(allergy)){
					matches.add(this.items.get(i));
				}
			}
		}
		if(matches.isEmpty()){
			System.out.println("No item with specified Allergy was found");
		}
		return matches;
		
	}
	public void printlist(){//Prints List of items
		for(int i =0; i < items.size(); i++){
			System.out.println(items.get(i).getName());
		}
	}
	public void printlistwithnutrients(){//Prints List of items with nutrients
		for(int i =0; i < items.size(); i++){
			System.out.println(items.get(i).getName() + ": \nNutrients:");
			for(int j = 0; j < this.items.get(i).nutrientSize(); j++){
				System.out.println("-" + items.get(i).getnutrient(j));
			}
		}
	
	}
	public void printlistwithallergies(){//Prints List of items with allergies
		for(int i =0; i < items.size(); i++){
			System.out.println(items.get(i).getName() + ": \nAllergies:");
			for(int j = 0; j < this.items.get(i).allergiesSize(); j++){
				System.out.println("-" + items.get(i).getallergy(j));
			}
		}
	
	}
	public void printlistfullinfo(){//Prints List of items
		for(int i =0; i < items.size(); i++){
			System.out.println(items.get(i).getName() + ": \nNutrients:");
			for(int j = 0; j < this.items.get(i).nutrientSize(); j++){
				System.out.println("-" + items.get(i).getnutrient(j));
			}
			System.out.println("Allergies:");
			for(int j = 0; j < this.items.get(i).allergiesSize(); j++){
				System.out.println("-" + items.get(i).getallergy(j));
			}
		}
	
	}
}

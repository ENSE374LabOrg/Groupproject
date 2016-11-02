import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Data {
	private List<Item> items;
	
	public Data(){
		this.items = new ArrayList<Item>();
	}
	public Data(ArrayList<Item> items){
		this.items = items;
	}
	
	public void addItem(Item item){
		this.items.add(new Item(item));
	}
	public boolean removeItem(String removename){
		if(this.items.isEmpty()){
			System.out.println("No Items in list");
		}
		else{
			for(int i =0; i < items.size(); i++){
				if(items.get(i).getName() == removename){
					this.items.remove(removename);
					System.out.println("Item found, being removed now");
					return true;
				}
				
			}
			
		}
		return false;
	}
	public ArrayList<Item> matchNutrient(String nutrient){
		ArrayList<Item> matches = new ArrayList<Item>();
		for(int i = 0; i < items.size(); i++){
			for(int j = 0; j < items.get(i).nutrientSize(); i++){
				if(items.get(i).getnutrient(j)== nutrient){
					matches.add(items.get(i));
				}
			}
		}
		if(matches.isEmpty()){
			System.out.println("No item with specified Nutrient was found \n");
		}
		return matches;
		
	}
	public ArrayList<Item> matchallergy(String allergy){
		ArrayList<Item> matches = new ArrayList<Item>();
		for(int i = 0; i < items.size(); i++){
			for(int j = 0; j < items.get(i).allergiesSize(); i++){
				if(items.get(i).getallergy(j)== allergy){
					matches.add(items.get(i));
				}
			}
		}
		if(matches.isEmpty()){
			System.out.println("No item with specified Nutrient was found \n");
		}
		return matches;
		
	}
	public void printlist(){
		for(int i =0; i < items.size(); i++){
			System.out.println(items.get(i).getName() + "\n");
		}
	}
}

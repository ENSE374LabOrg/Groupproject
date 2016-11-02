import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
	public Item matchNutrient(String nutrient){
		for(int i = 0; i < items.size(); i++){
			for(int j = 0; j < items.get(i).nutrientSize(); i++){
				if(items.get(i).getnutrient(j)== nutrient){
					return items.get(i);
				}
			}
		}
		System.out.println("No item with specified Nutrient was found \n");
		return null;
		
	}
	public void printlist(){
		for(int i =0; i < items.size(); i++){
			System.out.println(items.get(i).getName() + "\n");
		}
	}
}

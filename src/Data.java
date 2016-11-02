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
	
	public void addItem(String name, ArrayList<Nutrients> nutrients, ArrayList<Allergies> allergies){
		this.items.add(new Item(name, nutrients, allergies));
	}
	public boolean removeItem(String removename){
		if(this.items.isEmpty()){
			System.out.println("No Items in list");
		}
		else{
			List<Item> result = items.stream().filter(a -> Objects.equals(a.getName(), removename)).collect(Collectors.toList());
			if(this.items.remove(result)){
				return true;
			}
			
		}
		return false;
	}
	public void printlist(){
		for(int i =0; i < items.size(); i++){
			System.out.println(items.get(i).getName() + "\n");
		}
	}
}

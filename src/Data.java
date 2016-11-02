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
	
	public void addItem(String name, ArrayList<Nutrients> nutrients, ArrayList<Allergies> allergies){
		this.items.add(new Item(name, nutrients, allergies));
	}
	public boolean removeItem(String name){
		
		return false;
	}
}

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class Item {
	private String name;
	private List<Nutrients> nutrients;
	private List<Allergies> allergies;
	
	public Item(){
		this.name = "";
		this.nutrients = new ArrayList<Nutrients>();
		this.allergies = new ArrayList<Allergies>();
	}
	public void setItem(String name, ArrayList<Nutrients> nutrients, ArrayList<Allergies> allergies){
		this.name = name;
		this.nutrients = nutrients;
		this.allergies = allergies;
	}
	public Item(Item item){
		this.name = item.name;
		this.allergies = item.allergies;
		this.nutrients = item.nutrients;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public boolean equals(String obj){
		if(obj == null){
			return false;
		}
		if(obj == this.name){
			return true;
		}
		return false;
	
		
	}
	public int nutrientSize(){
		return this.nutrients.size();
	}
	public int allergiesSize(){
		return this.allergies.size();
	}
	public String getnutrient(int index){
		return this.nutrients.get(index).getNutrients();
	}
	public String getallergy(int index){
		return this.allergies.get(index).getallergies();
	}
}

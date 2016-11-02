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
	public Item(String name, ArrayList<Nutrients> nutrients, ArrayList<Allergies> allergies){
		this.name = name;
		this.nutrients = nutrients;
		this.allergies = allergies;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
}

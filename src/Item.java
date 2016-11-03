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
	
	public Item(){// default Constructor
		this.name = "";
		this.nutrients = new ArrayList<Nutrients>();
		this.allergies = new ArrayList<Allergies>();
	}
	public void setItem(String name, ArrayList<Nutrients> nutrients, ArrayList<Allergies> allergies){// Adds item based on input
		this.name = name;
		this.nutrients = nutrients;
		this.allergies = allergies;
	}
	public Item(Item item){//Copy Constructor
		this.name = item.name;
		this.allergies = item.allergies;
		this.nutrients = item.nutrients;
	}
	public String getName(){//Gets name of item
		return this.name;
	}
	public void setName(String name){//Sets name of item
		this.name = name;
	}
	public boolean equals(String obj){//Used by remove function
		if(obj == null){
			return false;
		}
		if(obj == this.name){
			return true;
		}
		return false;
	
		
	}
	public int nutrientSize(){//returns size of nutrients list
		return nutrients.size();
	}
	public int allergiesSize(){//returns size of allergies list
		return allergies.size();
	}
	public String getnutrient(int index){//returns name of nutrient in the list
		return this.nutrients.get(index).getNutrients();
	}
	public String getallergy(int index){//returns name of allergy in the list
		return this.allergies.get(index).getallergies();
	}
}

/**
 * 
 */

/**
 * @author burns26c
 *
 */
public class Nutrients {

	private String Nutrients;
	
	public Nutrients() {//Default Constructor
		this.Nutrients= "default";
		
	}
	
	public Nutrients(String Nutrients){//Constructor
		
		this.Nutrients= Nutrients;
	}
public String getNutrients(){// returns name of nutrient
	return Nutrients;
}
public void setNutrients(String Nutrients){// sets value of nutrient
	this.Nutrients=Nutrients;
}

}



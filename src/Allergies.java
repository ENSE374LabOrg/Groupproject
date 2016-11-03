
public class Allergies {
private String Allergies;
	
	public Allergies() {//Default constructor
		this.Allergies= "default";
		
	}
	
	public Allergies(String Allergies){//Constructor
		
		this.Allergies= Allergies;
	}
public String getallergies(){//allergies getter
	return Allergies;
}
public void setNutrients(String Allergies){//allergies setter
	this.Allergies=Allergies;
}

}


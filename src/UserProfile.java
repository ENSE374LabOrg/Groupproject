import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author: Callum Burns
 * 
 */
public class UserProfile {
	
	private String Username;
	private String Password;
	private List<String> Preferences;
	private  List<String> Allergies;

	public UserProfile(){
		this.Username="default";
		this.setPassword("default");
		this.Preferences=new ArrayList<String>(); 
	}
	public UserProfile(String Username, String Password,List<String> Preferences, List<String> Allergy) {
		this.Username=Username;
		this.Password=Password;
		this.Preferences= Preferences;
		this.Allergies = Allergy;
	}
	public String getUsername(){
		return Username;
			 
	}
	public void setUsername(String Username, String Password){
		this.Username=Username;
		this.setPassword(Password);
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	public void setPreferences(List<String> Preferences){
		this.Preferences=Preferences;
	}
	public List<String> getPreferences(){
		return Preferences;
	}

	public void setAllergies(List<String> Allergies){
		this.Allergies=Allergies;
	}
	public List<String> getAllergies(){
		return Allergies;
	}

	public boolean Match(String Password){	
		if (this.Password.equals(Password)){
			return true;
		}
		else{
			return false;
		}
	}
	
}
 


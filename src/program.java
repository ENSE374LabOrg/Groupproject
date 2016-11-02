import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author shamissa
 *
 */
public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data info = new Data();
		ArrayList<Nutrients> nutrient = new ArrayList<Nutrients>();
		ArrayList<Allergies> allergies = new ArrayList<Allergies>();
		String name = "apple";
		nutrient.add(new Nutrients("Vitamin B"));
		allergies.add(new Allergies("None"));
		info.addItem(name, nutrient, allergies);
		
		info.printlist();
	}

}

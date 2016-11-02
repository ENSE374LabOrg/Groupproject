import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author shamissa
 * This is just a test file. Use it to test changes.
 */
public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data info = new Data();
		Item item = new Item();
		String name = "Something";
		ArrayList<Nutrients> nutrients = new ArrayList<Nutrients>();
		ArrayList<Allergies> allergies = new ArrayList<Allergies>();
		nutrients.add(new Nutrients("Vitamin B"));
		nutrients.add(new Nutrients("Vitamin E"));
		nutrients.add(new Nutrients("Vitamin D"));
		nutrients.add(new Nutrients("Vitamin C"));
		nutrients.add(new Nutrients("Vitamin A"));
		allergies.add(new Allergies("Peanut"));
		allergies.add(new Allergies("chicken"));
		allergies.add(new Allergies("Chocolate"));
		item.setItem(name, nutrients, allergies);
		info.addItem(item);
		info.printlist();
		info.removeItem(name);
	}

}

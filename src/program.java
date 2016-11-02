import java.util.ArrayList;

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
		nutrients.add(new Nutrients("Vitamin C"));
		nutrients.add(new Nutrients("Vitamin A"));
		allergies.add(new Allergies("Peanut"));
		item.setItem(name, nutrients, allergies);
		info.addItem(item);
		Item item2 = new Item();
		String name2 = "Something";
		ArrayList<Nutrients> nutrients2 = new ArrayList<Nutrients>();
		ArrayList<Allergies> allergies2 = new ArrayList<Allergies>();
		nutrients2.add(new Nutrients("Vitamin B"));
		nutrients2.add(new Nutrients("Vitamin A"));
		allergies2.add(new Allergies("Chocolate"));
		item2.setItem(name2, nutrients2, allergies2);
		info.addItem(item2);
		Item item3 = new Item();
		String name3 = "Something";
		ArrayList<Nutrients> nutrients3 = new ArrayList<Nutrients>();
		ArrayList<Allergies> allergies3 = new ArrayList<Allergies>();
		nutrients3.add(new Nutrients("Vitamin B"));
		nutrients3.add(new Nutrients("Vitamin E"));
		allergies3.add(new Allergies("chicken"));
		item3.setItem(name3, nutrients3, allergies3);
		info.addItem(item3);
		info.printlist();
		
		info.removeItem(name);
	}

}

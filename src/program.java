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
		String name = "Something1";
		ArrayList<Nutrients> nutrients = new ArrayList<Nutrients>();
		ArrayList<Allergies> allergies = new ArrayList<Allergies>();
		nutrients.add(new Nutrients("Vitamin C"));
		nutrients.add(new Nutrients("Vitamin A"));
		allergies.add(new Allergies("Peanut"));
		item.setItem(name, nutrients, allergies);
		info.addItem(item);
		Item item2 = new Item();
		String name2 = "Something2";
		ArrayList<Nutrients> nutrients2 = new ArrayList<Nutrients>();
		ArrayList<Allergies> allergies2 = new ArrayList<Allergies>();
		nutrients2.add(new Nutrients("Vitamin B"));
		nutrients2.add(new Nutrients("Vitamin A"));
		allergies2.add(new Allergies("Chocolate"));
		item2.setItem(name2, nutrients2, allergies2);
		info.addItem(item2);
		Item item3 = new Item();
		String name3 = "Something3";
		ArrayList<Nutrients> nutrients3 = new ArrayList<Nutrients>();
		ArrayList<Allergies> allergies3 = new ArrayList<Allergies>();
		nutrients3.add(new Nutrients("Vitamin B"));
		nutrients3.add(new Nutrients("Vitamin E"));
		allergies3.add(new Allergies("chicken"));
		item3.setItem(name3, nutrients3, allergies3);
		info.addItem(item3);
		info.printlist();
		ArrayList<Item> match1 = new ArrayList<Item>();
		ArrayList<Item> match2 = new ArrayList<Item>();
		match1 = info.matchNutrient("Vitamin E");
		match2 = info.matchallergy("Chocolate");
		for(int i = 0; i < match1.size() ; i++){
			System.out.println("Matches found for nutrients:" + match1.get(i).getName());
		}
		for(int i = 0; i < match2.size() ; i++){
			System.out.println("Matches found for allergies:" + match2.get(i).getName());
		}
		info.removeItem(name);
		info.printlist();
	}

}

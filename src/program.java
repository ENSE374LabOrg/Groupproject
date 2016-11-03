import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

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
		try {

			//You can change paths or filenames to make the Exception hit.
			Scanner in = new Scanner(Paths.get("randomdata.csv"));

			while (in.hasNextLine()) {
				Item item = new Item();
				ArrayList<Nutrients> nutrients = new ArrayList<Nutrients>();
				ArrayList<Allergies> allergies = new ArrayList<Allergies>();
				String externalLine = in.nextLine();
				String [] parts = externalLine.split("\\|");
				String name = parts[0];
				String nutrient = parts[1];
				String allergy = parts[2];
				nutrients.add(new Nutrients(nutrient));
				allergies.add(new Allergies(allergy));
				item.setItem(name, nutrients, allergies);
				info.addItem(item);
			}
			in.close();
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
			info.removeItem("Apple");
			info.printlistfullinfo();
		}
		 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
		
		
		
	}



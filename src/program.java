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
		Food_Database info = new Food_Database();
		try {

			//You can change paths or filenames to make the Exception hit.
			Scanner in = new Scanner(Paths.get("randomdata.csv"));
			int input = 0;
			String username;
			String password;
			String userinput;
			ArrayList<Food> match = new ArrayList<Food>();
			boolean loggedin = false;
			while (in.hasNextLine()) {
				Food item = new Food();
				ArrayList<Nutrients> nutrients = new ArrayList<Nutrients>();
				ArrayList<String> allergies = new ArrayList<String>();
				String externalLine = in.nextLine();
				String [] parts = externalLine.split("\\|");
				String name = parts[0];
				String nutrient = parts[1];
				String allergy = parts[2];
				nutrients.add(new Nutrients(nutrient));
				allergies.add(allergy);
				item.setItem(name, nutrients, allergies);
				info.addItem(item);
			}
			do{
				if(loggedin = false){
					System.out.println("What Would you like to do?");
					System.out.println("1.Login:");
					System.out.println("2.Filter by nutrient:");
					System.out.println("3.Filter by allergy:");
					System.out.println("9.END");
					input = in.nextInt();
				}
				if(loggedin = true){
					System.out.println("What Would you like to do?");
					System.out.println("2.Filter by nutrient:");
					System.out.println("3.Filter by allergy:");
					System.out.println("9.END");
					input = in.nextInt();
				}
				switch(input){
				case 1:
					System.out.println("Enter Username:");
					username = in.next();
					System.out.println("Enter Password:");
					password = in.next();
					
					loggedin = true;
					break;
				case 2:
					System.out.println("Enter nutrient to filter by:");
					userinput = in.next();
					match = info.matchNutrient(userinput);
					for(int i = 0; i < match.size() ; i++){
						System.out.println("Matches found for nutrients: " + match.get(i).getName());
					}
					break;
				case 3:
					System.out.println("Enter allergy to filter by:");
					userinput = in.next();
					match = info.matchNutrient(userinput);
					for(int i = 0; i < match.size() ; i++){
						System.out.println("Matches found for allergies:" + match.get(i).getName());
					}
					break;
				case 9:
					break;
				default:
					break;
				}
				
				
			}while(input != 9);
			
		
			
			info.removeItem("Apple");
			info.printlistfullinfo();
		}
		 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
		
		
		
	}



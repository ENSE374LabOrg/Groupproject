import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ahmed Shamiss
 * This is just a test file. Use it to test changes.
 */
public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food_Database info = new Food_Database();
		ArrayList<UserProfile> profiles = new ArrayList<UserProfile>();
		try {

			//You can change paths or filenames to make the Exception hit.
			Scanner file = new Scanner(Paths.get("randomdata.csv"));
			Scanner profile = new Scanner(Paths.get("Users.csv"));
			Scanner in = new Scanner(System.in);
			int input = 0;
			String username;
			String password;
			String userinput;
			int index = 0;
			boolean login = false;
			ArrayList<Food> match = new ArrayList<Food>();
			boolean loggedin = false;
			while (profile.hasNextLine()) {
				
				ArrayList<String> preference = new ArrayList<String>();
				ArrayList<String> userallergy = new ArrayList<String>();
				String externalLine = profile.nextLine();
				String [] parts = externalLine.split("\\|");
				String inputuser = parts[0];
				String inputpass = parts[1];
				preference.add(parts[2]);
				userallergy.add(parts[3]);
				UserProfile temp = new UserProfile(inputuser, inputpass, preference, userallergy);
				profiles.add(temp);
			}
			while (file.hasNextLine()) {
				Food item = new Food();
				ArrayList<Nutrients> nutrients = new ArrayList<Nutrients>();
				ArrayList<String> allergies = new ArrayList<String>();
				String externalLine = file.nextLine();
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
				if(loggedin == false){
					System.out.println("What Would you like to do?");
					System.out.println("1.Login:");
					System.out.println("2.Filter by nutrient:");
					System.out.println("3.Filter by allergy:");
					System.out.println("4.Print Full list");
					System.out.println("5.Register");
					System.out.println("9.END");
					input = in.nextInt();
				}
				if(loggedin == true){
					System.out.println("What Would you like to do?");
					System.out.println("2.Filter by nutrient:");
					System.out.println("3.Filter by allergy:");
					System.out.println("4.Print Full list");
					System.out.println("6.Print based on preference:");
					System.out.println("7.Print based on allergy:");
					System.out.println("9.END");
					input = in.nextInt();
				}
				switch(input){
				case 1:
					in.nextLine();
					System.out.println("Enter Username:");
					username = in.nextLine();
					
					System.out.println("Enter Password:");
					password = in.nextLine();
			
					for(int i =0; i < profiles.size(); i++){
						if(username.equals(profiles.get(i).getUsername() )){
							login = profiles.get(i).Match(password);
							index = i;
							break;
						}
					}
					if(login){
						loggedin = true;
					}
					else{
						System.out.println("Wrong Password or UserName");
					}
					break;
				case 2:
					in.nextLine();
					System.out.println("Enter nutrient to filter by:");
					userinput = in.nextLine();
					match = info.matchNutrient(userinput);
					System.out.println("Matches found for nutrients: ");
					for(int i = 0; i < match.size() ; i++){
						System.out.println(match.get(i).getName());
					}
					break;
				case 3:
					in.nextLine();
					System.out.println("Enter allergy to filter by:");
					userinput = in.nextLine();
					match = info.matchallergy(userinput);
					System.out.println("Matches found for allergies:");
					for(int i = 0; i < match.size() ; i++){
						System.out.println(match.get(i).getName());
					}
					break;
				case 4:
					info.printlistfullinfo();
					break;
				case 5:
					break;
				case 6:
					
					
						String preference = profiles.get(index).getPreferences().get(0);
						System.out.println(preference);
						match = info.matchNutrient(preference);
						System.out.println("Matches found for preference:");
						for(int j = 0; j < match.size() ; j++){
							System.out.println( match.get(j).getName());
						}
					
					
					break;
				case 7:
					String allergy = profiles.get(index).getAllergies().get(0);
					System.out.println(allergy);
					match = info.matchallergy(allergy);
					System.out.println("Matches found for user allergy:");
					for(int j = 0; j < match.size() ; j++){
						System.out.println(match.get(j).getName());
					}
					break;
				case 9:
					break;
				default:
					break;
				}
				
			}while(input != 9);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	}



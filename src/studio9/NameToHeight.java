package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		

		// FIXME
		Map<String, Integer> nameToHeight = new HashMap<>();
		
		nameToHeight.put("James", 174);
		
		nameToHeight.put("Lawrence", 183);
		
		nameToHeight.put("Jack", 181);
		
		boolean quit = false;
		
		while (true)
		{
			Scanner in = new Scanner(System.in);
			
			System.out.println("Input a name");
			
			String name = in.next();
			
			if (name.equals("quit"))
			{
				
				break; 
			}
			
			else 
			{
				
				if (nameToHeight.get(name) != null)
						
					{
						System.out.println(name + nameToHeight.get(name));
					}
				
				else 
				{
					System.out.println("the person does not exist.");
				}
				
			}
				
			
	
		}
		
	}
		
}

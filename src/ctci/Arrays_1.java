package ctci;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/*Implementation of CTCI 1.1*/
/**
 * Implementation of Arrays_1 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Arrays_1 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String inputString=scanner.nextLine();
		scanner.close();
		System.out.println("Has Unique Characters Short : "+hasUniqueShort(inputString));
		System.out.println("Has Unique Characters Long : "+hasUniqueLong(inputString));

	}
	/**
	 * Checks if unique short.
	 *
	 * @param inputString the inputString parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean hasUniqueShort(String inputString){
		HashMap<Character, Character> uniqueHashMap=new HashMap<Character, Character>();
		inputString= inputString.toLowerCase();
		// Iterate through all elements
		for (int i = 0; i < inputString.length(); i++) {
			// Check for null/base case
			if(uniqueHashMap.put(inputString.charAt(i), inputString.charAt(i))!=null){
				return false;
			}
		}
		return true;
	}
	/**
	 * Checks if unique long.
	 *
	 * @param inputString the inputString parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean hasUniqueLong(String inputString){
		inputString= inputString.toLowerCase();
		// Iterate through all elements
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i+1; j < inputString.length(); j++) {
				if(inputString.charAt(i)==inputString.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
}

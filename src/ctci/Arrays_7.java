package ctci;

import java.io.InputStreamReader;
import java.util.Scanner;

/*Implementation of CTCI 1.8*/
/**
 * Implementation of Arrays_7 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Arrays_7 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String inputString1=scanner.nextLine();
		String inputString2=scanner.nextLine();
		System.out.println("Is "+inputString1 +" substring of "+inputString2+" ? "+isSubstring(inputString1,inputString1+inputString2));
		scanner.close();
		
	}

	/**
	 * Checks if substring.
	 *
	 * @param inputString1 the inputString1 parameter
	 * @param inputString2 the inputString2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isSubstring(String inputString1, String inputString2) {
		// Iterate through all elements
		for (int i = 0; i < inputString1.length(); i++) {
			String partialInputString1=inputString1.substring(i);
			if(inputString2.indexOf(partialInputString1)>0)
				return true;
		}
		return false;
	}

	

}

package TopCoder;

/*
 * SRM 148 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1740&rd=4545
 */



/**
 * Implementation of SRM148 Cey Kaps algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM148CeyKaps {
	
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs decipher operation.
	 *
	 * @param typed the typed parameter
	 * @param switches the array to process
	 * @return the resulting string
	 */
	public static String decipher(String typed, String[] switches){
		// Iterate through all elements
		for (int i = 0; i < switches.length; i++) {
			String splitString[]=switches[i].split(":");
			typed=typed.replace(splitString[0], "-");
			typed=typed.replace(splitString[1],splitString[0]);
			typed=typed.replace("-",splitString[1]);
		}
		return typed;
	}
}

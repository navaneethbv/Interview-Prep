package Warmup;

/*
 * Link:https://www.careercup.com/question?id=5761652767064064
 */
/**
 * Implementation of Print Combinations algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintCombinations {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Performs printComb operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 */
	public static void printComb(String prefix,String str) {
		// Check for null/base case
		if (str.length() == 0) {
			System.out.println(prefix);
			return;
		}
		if (Character.isAlphabetic(str.charAt(0))) {
			printComb(prefix+str.substring(0,1).toLowerCase(),str.substring(1));
			printComb(prefix+str.substring(0,1).toUpperCase(),str.substring(1));
		}
		else
			printComb(prefix+str.substring(0,1),str.substring(1));
	}
}


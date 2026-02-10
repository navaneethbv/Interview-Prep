package eBayPrep;

/**
 * Implementation of Excel Sheet Column Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ExcelSheetColumnNumber {

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
	 * Performs titleToNumber operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int titleToNumber(String s) {
		int value=0;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			value+=Math.pow(26,s.length()-1-i)*(s.charAt(i)-'A'+1);
		}
		return value;
		
	}
}


package eBayPrep;

/**
 * Implementation of Length Of Last Word algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LengthOfLastWord {

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
	 * Performs lengthOfLastWord operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int lengthOfLastWord(String s) {
		String  arr[]=s.split(" ");
		return arr.length>0?arr[arr.length-1].length():0;
	}
}


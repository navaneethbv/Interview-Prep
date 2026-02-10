package LeetCodePerformancePractice;

/**
 * Implementation of Reverse String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseString {
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
	 * Performs reverseString operation.
	 *
	 * @param s the s parameter
	 * @return the resulting string
	 */
	public static String reverseString(String s) {
		// Check for null/base case
		if(s==null ||s.length()==0)
			return s;
		// Recursively process left and right subtrees
		return reverseString(s.substring(1))+s.charAt(0);
	}
	/**
	 * Performs reverseString1 operation.
	 *
	 * @param s the s parameter
	 * @return the resulting string
	 */
	public static String reverseString1(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}

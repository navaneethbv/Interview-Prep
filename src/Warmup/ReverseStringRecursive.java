package Warmup;

/**
 * Implementation of Reverse String Recursive algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseStringRecursive {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs reverse operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	private static String reverse(String str) {
		// Check for null/base case
		if(str.length()==0)
			return str;
		// Recursively process left and right subtrees
		return reverse(str.substring(1))+str.charAt(0);
	}

}


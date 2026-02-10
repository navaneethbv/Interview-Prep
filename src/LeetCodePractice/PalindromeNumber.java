package LeetCodePractice;

/**
 * Implementation of Palindrome Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PalindromeNumber {

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
	 * Checks if palindrome.
	 *
	 * @param x the x parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPalindrome(int x) {
		if(x<0)return false;
		String str=x+"";
		// Recursively process left and right subtrees
		return isPalindromeNum(str,0);
	}
	/**
	 * Checks if palindrome num.
	 *
	 * @param str the str parameter
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPalindromeNum(String str, int i) {
		// Check for null/base case
		if(str.length()==0||str.length()==1)
			return true;
		// Recursively process left and right subtrees
		return str.charAt(i)==str.charAt(str.length()-1-i) && isPalindromeNum(str.substring(1, str.length()-1), i);
	}
}

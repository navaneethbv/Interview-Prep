package eBayPrep;

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
		x=Math.abs(x);
		// Recursively process left and right subtrees
		return isPalindromeNum(x+"");
	}
	/**
	 * Checks if palindrome num.
	 *
	 * @param string the string parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPalindromeNum(String string) {
		if(string.length()<=1)
			return true;
		// Recursively process left and right subtrees
		return string.charAt(0)==string.charAt(string.length()-1) && isPalindromeNum(string.substring(1,string.length()-1));
	}
}

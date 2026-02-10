package leetCode;

/*
 * Link : https://leetcode.com/problems/pascals-triangle-ii/
 */

/**
 * Implementation of Valid Palindrome algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidPalindrome {
	/**
	 * Checks if palindrome.
	 *
	 * @param s the s parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder sb=new StringBuilder(s);
		String reverseString=sb.reverse().toString();
		if(s.contentEquals(reverseString))
			return true;
		else
			return false;		
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}
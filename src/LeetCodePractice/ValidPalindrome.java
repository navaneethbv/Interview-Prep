package LeetCodePractice;

/**
 * Implementation of Valid Palindrome algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidPalindrome {
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
	 * @param s the s parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPalindrome(String s) {
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		return new StringBuilder(s.toLowerCase()).reverse().toString().contentEquals(s.toLowerCase());
	}
	/**
	 * Checks if palindrome recursive.
	 *
	 * @param s the s parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPalindromeRecursive(String s) {
		s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		if(s.length()<=1)
			return true;
		return checkPalindrome(s,0,s.length()-1);
	}
	/**
	 * Performs checkPalindrome operation.
	 *
	 * @param s the s parameter
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkPalindrome(String s, int i, int j) {
		if(i<=j)
			// Recursively process left and right subtrees
			return s.charAt(i)==s.charAt(j) && checkPalindrome(s, i+1, j-1);
		else 
			return s.charAt(i)==s.charAt(j);
	}
}


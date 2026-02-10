package eBayPrep;

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

	}

	/**
	 * Checks if palindrome.
	 *
	 * @param str the str parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPalindrome(String str) {
		str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		StringBuilder sb=new StringBuilder(str);
		return sb.reverse().toString().contentEquals(str);
	}

}


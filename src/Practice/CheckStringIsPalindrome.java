package Practice;

import java.util.*;

/**
 * Implementation of Check String Is Palindrome algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckStringIsPalindrome {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String word = scan.nextLine();
		
		if(stringIsPalindrome(word))
			System.out.println("The given string is a palindrome");
		else
			System.out.println("The given string is not a palindrome");
	}
	
	/**
	 * Performs stringIsPalindrome operation.
	 *
	 * @param word the word parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean stringIsPalindrome(String word) {
		StringBuilder sb = new StringBuilder();
		for(int i = word.length() - 1; i >= 0; i--) {
			sb.append(word.charAt(i));
		}
		if(sb.toString().equals(word)) {
			return true;
		}
		return false;
	}
}

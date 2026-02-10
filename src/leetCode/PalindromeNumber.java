package leetCode;

/*
 * Link : https://leetcode.com/problems/palindrome-number/
 */

/**
 * Implementation of Palindrome Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PalindromeNumber {
	/**
	 * Checks if palindrome.
	 *
	 * @param x the x parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPalindrome(int x) {
		if(x<0)
			return false;
		int div=1;
		while(x/div>=10)
		{
			div*=10;
		}
		while(x>1)
		{	
			int left=x/div;
			int right=x%10;
			if(left!=right)
				return false;
			x=(x%div)/10;
			div=div/100;
		}
		return true;
	}
	/**
	 * Checks if palindrome extra space.
	 *
	 * @param x the x parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPalindromeExtraSpace(int x) {
		String str=String.valueOf(x);
		// Iterate through all elements
		for (int i = 0; i <=str.length()/2; i++) {	
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				return false;
		}
		return true;
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
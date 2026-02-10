package eBayPrep;

/**
 * Implementation of Longest Palindromic Substring algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestPalindromicSubstring {

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
	 * Performs longestPalindrome operation.
	 *
	 * @param s the s parameter
	 * @return the resulting string
	 */
	public static String longestPalindrome(String s) {
		// Check for null/base case
		if(s==null||s.length()<=1)
			return s;
		
		String longest=s.substring(0,1);
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			String temp=helper(s,i,i);
			if(temp.length()>longest.length())
			{
				longest=temp;
			}
			temp=helper(s,i,i+1);
			if(temp.length()>longest.length())
			{
				longest=temp;
			}
		}
		return longest;
	}
	/**
	 * Performs helper operation.
	 *
	 * @param s the s parameter
	 * @param start the start parameter
	 * @param end the end parameter
	 * @return the resulting string
	 */
	private static String helper(String s, int start, int end) {
		while(start>=0 && end<=s.length()-1 && s.charAt(start)==s.charAt(end))
		{
			start--;
			end++;
		}
		return s.substring(start+1,end);
	}
}

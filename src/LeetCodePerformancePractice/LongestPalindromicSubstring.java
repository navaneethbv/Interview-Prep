package LeetCodePerformancePractice;

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

	}

	/**
	 * Performs longestPalindrome operation.
	 *
	 * @param string the string parameter
	 * @return the resulting string
	 */
	private static String longestPalindrome(String string) {
		// Check for null/base case
		if(string==null||string.length()<=1)
			return string;
		String longestString="";
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			String str=helper(string,i,i);
			if(str.length()>longestString.length())
				longestString=str;
			str=helper(string,i,i+1);
			if(str.length()>longestString.length())
				longestString=str;
		}
		return longestString;
	}

	/**
	 * Performs helper operation.
	 *
	 * @param string the string parameter
	 * @param start the start parameter
	 * @param end the end parameter
	 * @return the resulting string
	 */
	private static String helper(String string, int start,int end) {
		while(start>=0 && end<=string.length()-1 && string.charAt(start)==string.charAt(end))
		{
			start--;
			end++;
		}
		return string.substring(start+1,end);
	}

}

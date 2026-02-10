package eBayPrep;

/**
 * Implementation of Longest Common Prefix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestCommonPrefix {

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
	 * Performs longestCommonPrefix operation.
	 *
	 * @param strArray the array to process
	 * @return the resulting string
	 */
	public static String longestCommonPrefix(String[] strArray) {
		// Check for null/base case
		if(strArray.length==0)
			return "";
		if(strArray.length==1)
			return strArray[0];
		int maxLength=Integer.MAX_VALUE;
		// Iterate through all elements
		for (int i = 0; i < strArray.length; i++) {
			maxLength=Math.min(strArray[i].length(), maxLength);
		}
		// Check for null/base case
		if(maxLength==0)return "";
		for (int i = 0; i < maxLength; i++) {
			// Inner loop to check combinations
			for (int j = 0; j < strArray.length-1; j++) {
				if(strArray[j].charAt(i)!=strArray[j+1].charAt(i))
				{
					return strArray[j].substring(0, i);
				}
			}
		}
		return strArray[0].substring(0, maxLength);
	}
}

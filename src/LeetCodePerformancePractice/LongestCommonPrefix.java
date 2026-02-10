package LeetCodePerformancePractice;

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

	}

	/**
	 * Performs longestCommonPrefix operation.
	 *
	 * @param strings the array to process
	 * @return the resulting string
	 */
	private static String longestCommonPrefix(String[] strings) {
		// Check for null/base case
		if(strings==null ||strings.length==0)
			return "";
		int minLength=Integer.MAX_VALUE;
		// Iterate through all elements
		for (int i = 0; i < strings.length; i++) {
			minLength=Math.min(strings[i].length(), minLength);
		}
		for (int i = 0; i < minLength; i++) {
			char c=strings[0].charAt(i);
			for (int j = 1; j < strings.length; j++) {
				if(strings[j].charAt(i)!=c)
				{
					return strings[j].substring(0, i);
				}
			}
		}
		return strings[0].substring(0, minLength);
	}




}

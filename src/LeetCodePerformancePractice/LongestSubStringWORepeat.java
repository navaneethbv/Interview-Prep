package LeetCodePerformancePractice;

/**
 * Implementation of Longest Sub String WO Repeat algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestSubStringWORepeat {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs lengthOfLongestSubstring operation.
	 *
	 * @param string the string parameter
	 * @return the computed integer result
	 */
	private static int lengthOfLongestSubstring(String string) {
		// Check for null/base case
		if(string==null||string.length()==0)
			return 0;

		StringBuilder sb=new StringBuilder();
		int maxLength=Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if(sb.toString().contains(c+""))
			{
				sb=new StringBuilder(sb.substring(sb.indexOf(c+"")+1)+c);
			}
			else
				sb.append(c);
			maxLength=Math.max(sb.length(), maxLength);	
		}
		return maxLength;
	}

}

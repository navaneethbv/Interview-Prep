package LeetCodePractice;

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
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs lengthOfLongestSubstring operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int lengthOfLongestSubstring(String s) {
		StringBuilder sb=new StringBuilder("");
		int maxLen=Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			if(sb.length()>0 && sb.toString().indexOf(s.charAt(i))!=-1){
				sb=new StringBuilder(sb.toString().substring(sb.toString().indexOf(s.charAt(i))+1));
				sb.append(s.charAt(i));
			}
			else{
				sb.append(s.charAt(i));
				maxLen=Math.max(sb.length(), maxLen);
			}
		}
		return sb.length()>maxLen?sb.length():maxLen;
	}
}

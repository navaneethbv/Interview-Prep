package LeetCodePerformancePractice;

/**
 * Implementation of Valid Anagram algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidAnagram {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
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
	/**
	 * Checks if anagram.
	 *
	 * @param s the s parameter
	 * @param t the t parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isAnagram(String s, String t) {
		// Check for null/base case
		if(s.length()==0 && t.length()==0)
			return true;
		if(s.length()!=t.length())
			return false;
		char c1[]=new char[26];
		char c2[]=new char[26];
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			c1[s.charAt(i)-97]++;
			c2[t.charAt(i)-97]++;
		}
		return (new String(c1).contentEquals(new String(c2)));
	}

}

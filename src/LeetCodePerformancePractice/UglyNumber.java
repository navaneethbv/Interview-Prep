package LeetCodePerformancePractice;

/**
 * Implementation of Ugly Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UglyNumber {
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
	 * Checks if ugly.
	 *
	 * @param num the num parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isUgly(int num) {
		// Check for null/base case
		if(num==0)
			return false;
		if(num==1)
			return true;
		// Check for null/base case
		if(num%2==0)
			// Recursively process left and right subtrees
			return isUgly(num/2);
		// Check for null/base case
		if(num%3==0)
			// Recursively process left and right subtrees
			return isUgly(num/3);
		// Check for null/base case
		if(num%5==0)
			// Recursively process left and right subtrees
			return isUgly(num/5);
		return false;
	}
}

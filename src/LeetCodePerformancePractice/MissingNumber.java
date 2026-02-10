package LeetCodePerformancePractice;

/**
 * Implementation of Missing Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MissingNumber {
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
	 * Performs missingNumber operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int missingNumber(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length==0)
			return -1;
		int sum=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		int n=nums.length;
		return n*(n+1)/2 -sum;
	}

}

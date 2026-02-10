package LeetCodePerformancePractice;

/**
 * Implementation of Single Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SingleNumber {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
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
     * Performs singleNumber operation.
     *
     * @param nums the array to process
     * @return the computed integer result
     */
    public int singleNumber(int[] nums) {
        int value=nums[0];
        for (int i = 1; i < nums.length; i++) {
			value=value^nums[i];
		}
        return value;
    }
}

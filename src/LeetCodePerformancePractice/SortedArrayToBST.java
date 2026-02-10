package LeetCodePerformancePractice;

/**
 * Implementation of Sorted Array To BST algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortedArrayToBST {
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
	 * Performs sortedArrayToBST operation.
	 *
	 * @param nums the array to process
	 * @return the TreeNode result
	 */
	public TreeNode sortedArrayToBST(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length==0)
			return null;
		return convertTree(0,nums.length-1,nums);
	}
	/**
	 * Performs convertTree operation.
	 *
	 * @param left the left parameter
	 * @param right the right parameter
	 * @param nums the array to process
	 * @return the TreeNode result
	 */
	private TreeNode convertTree(int left, int right, int[] nums) {
		if(left>right)
			return null;
		int mid=(left+right)/2;
		TreeNode tn=new TreeNode(nums[mid]);
		tn.left=convertTree(left, mid-1, nums);
		tn.right=convertTree(mid+1, right, nums);
		return tn;
	}

}

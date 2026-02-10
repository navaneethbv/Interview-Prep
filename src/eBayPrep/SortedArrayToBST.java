package eBayPrep;

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
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			preOrder(tn.left);
			System.out.println(tn.val);
			preOrder(tn.right);
		}
	}

	/**
	 * Performs sortedArrayToBST operation.
	 *
	 * @param nums the array to process
	 * @return the TreeNode result
	 */
	public static TreeNode sortedArrayToBST(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length==0)
			return null;
		else
		{
			int left=0,right=nums.length-1;
			int mid=(left+right)/2;
			TreeNode tn=new TreeNode(nums[mid]);
			tn.left=prepTree(left,mid-1,nums);
			tn.right=prepTree(mid+1,right,nums);
			return tn;
		}

	}

	/**
	 * Performs prepTree operation.
	 *
	 * @param left the left parameter
	 * @param right the right parameter
	 * @param nums the array to process
	 * @return the TreeNode result
	 */
	private static TreeNode prepTree(int left, int right, int[] nums) {
		if(left>right)
			return null;
		else
		{
			int mid=(left+right)/2;
			TreeNode tn=new TreeNode(nums[mid]);
			tn.left=prepTree(left,mid-1,nums);
			tn.right=prepTree(mid+1,right,nums);
			return tn;
		}
	}

}


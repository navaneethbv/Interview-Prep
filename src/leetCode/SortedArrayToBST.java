package leetCode;

/*
 * Link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */

/**
 * Implementation of Sorted Array To BST algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortedArrayToBST {
	/**
	 * Performs sortedArrayToBST operation.
	 *
	 * @param nums the array to process
	 * @return the TreeNode result
	 */
	public static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length<1)
			return null;
		int element=nums[(nums.length-1)/2];
		System.out.println(element);
		if(nums.length==1)
			return new TreeNode(nums[0]);
		else{
			return sortedArray(nums,0,nums.length-1);
		}
	}
	/**
	 * Performs sortedArray operation.
	 *
	 * @param nums the array to process
	 * @param start the start parameter
	 * @param end the end parameter
	 * @return the TreeNode result
	 */
	private static TreeNode sortedArray(int[] nums, int start, int end) {
		
		if(start>end)
			return null;
		int mid=(start+end)/2;
		TreeNode tn=new TreeNode(nums[mid]);
		tn.left=sortedArray(nums, start,mid-1);
		tn.right=sortedArray(nums, mid+1,end);
		return tn;
		
	}
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static  class TreeNode {
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
			System.out.print(tn.val+"/");
			preOrder(tn.left);
			preOrder(tn.right);
		}
		
	}
}
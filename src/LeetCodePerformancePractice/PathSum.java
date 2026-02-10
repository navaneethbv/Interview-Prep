package LeetCodePerformancePractice;

/**
 * Implementation of Path Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PathSum {
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
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println("Tree with 2 leaf nodes: " + hasPathSum(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + hasPathSum(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + hasPathSum(root3));
	}
	/**
	 * Checks if path sum.
	 *
	 * @param root the tree node to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
        // Check for null/base case
        if(root==null)
	        return false;
		return checkPathSum(root,0,sum);
	}
	/**
	 * Performs checkPathSum operation.
	 *
	 * @param root the tree node to process
	 * @param currSum the currSum parameter
	 * @param target the target value
	 * @return true if condition is met, false otherwise
	 */
	private boolean checkPathSum(TreeNode root, int currSum, int target) {
		// Check for null/base case
		if(root==null)
			return false;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null && currSum+root.val==target)
			return true;
		// Recursively process left and right subtrees
		return checkPathSum(root.left, currSum+root.val, target)||checkPathSum(root.right, currSum+root.val, target);
	}
}

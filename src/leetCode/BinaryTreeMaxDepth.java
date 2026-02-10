package leetCode;

/*
 * Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

/**
 * Implementation of Binary Tree Max Depth algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreeMaxDepth {
	/**
	 * Performs maxDepth operation.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	public int maxDepth(TreeNode root) {
		// Recursively process left and right subtrees
		return maxDepth(root,1);
	}
	/**
	 * Performs maxDepth operation.
	 *
	 * @param root the tree node to process
	 * @param val the val parameter
	 * @return the computed integer result
	 */
	private int maxDepth(TreeNode root,int val){
		
		// Check for null/base case
		if(root!=null)
		{	
			int left=0,right=0;
			// Check for null/base case
			if(root.left!=null)
				left=maxDepth(root.left,1);
			// Check for null/base case
			if(root.right!=null)
				right=maxDepth(root.right,1);
			return 1+((left>right)?left:right);
		}
		return 0;
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println("Tree with 2 leaf nodes: " + maxDepth(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + maxDepth(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + maxDepth(root3));
	}

}
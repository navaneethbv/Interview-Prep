package eBayPrep;

/**
 * Implementation of Balanced Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BalancedBinaryTree {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	/**
	 * Checks if balanced.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	public boolean isBalanced(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return true;
		// Recursively process left and right subtrees
		return Math.abs(getHeight(tn.left)-getHeight(tn.right))<=1 && isBalanced(tn.left) && isBalanced(tn.right);
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private int getHeight(TreeNode tn) {
		// Recursively process left and right subtrees
		return tn==null?0:1+Math.max(getHeight(tn.left), getHeight(tn.right));
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
		System.out.println("Tree with 2 leaf nodes: " + isBalanced(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + isBalanced(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + isBalanced(root3));
	}

}


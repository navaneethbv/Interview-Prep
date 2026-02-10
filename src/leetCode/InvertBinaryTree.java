package leetCode;

/*
 * Link : https://leetcode.com/problems/invert-binary-tree/
 */

/**
 * Implementation of Invert Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InvertBinaryTree {
	/**
	 * Performs invertTree operation.
	 *
	 * @param root the tree node to process
	 * @return the TreeNode result
	 */
	public TreeNode invertTree(TreeNode root) {
		// Check for null/base case
		if(root.left!=null)
			invertTree(root.left);
		// Check for null/base case
		if(root.right!=null)
			invertTree(root.right);
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		return root;
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
		System.out.println("Tree with 2 leaf nodes: " + invertTree(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + invertTree(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + invertTree(root3));
	}

}
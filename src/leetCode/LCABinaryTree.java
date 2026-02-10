package leetCode;

/*
 * Link : https://leetcode.com/problems/move-zeroes/
 */

/**
 * Implementation of LCA Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LCABinaryTree {
	/**
	 * Performs lowestCommonAncestor operation.
	 *
	 * @param root the tree node to process
	 * @param p the p parameter
	 * @param q the q parameter
	 * @return the TreeNode result
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// Check for null/base case
		if(root==null)
			return null;
		if(root.val==p.val||root.val==q.val)
			return root;
		TreeNode leftNode=lowestCommonAncestor(root.left, p, q);
		TreeNode rightNode=lowestCommonAncestor(root.right, p, q);
		// Check if node is a leaf (no children)
		if(leftNode!=null && rightNode!=null)
			return root;
		return leftNode!=null?leftNode:rightNode;
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
		System.out.println("Tree with 2 leaf nodes: " + lowestCommonAncestor(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + lowestCommonAncestor(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + lowestCommonAncestor(root3));
	}

}
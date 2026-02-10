package leetCode;

/*
 * Link : https://leetcode.com/problems/balanced-binary-tree/
 */

/**
 * Implementation of Balanced Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BalancedBinaryTree {
	/**
	 * Checks if balanced.
	 *
	 * @param root the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	public boolean isBalanced(TreeNode root) {
		// Check for null/base case
		if(root!=null){
			int leftHeight=getHeight(root.left);
			int rightHeight=getHeight(root.right);
			// Recursively process left and right subtrees
			return (Math.abs(leftHeight-rightHeight)<=1) && isBalanced(root.left) && isBalanced(root.right);
		}
		return true;
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param node the tree node to process
	 * @return the computed integer result
	 */
	public int getHeight(TreeNode node)
	{
		if(node!=null)
		{
			int leftHeight=getHeight(node.left);
			int rightHeight=getHeight(node.right);			
			return 1+((leftHeight>rightHeight)?leftHeight:rightHeight);
		}
		return 0;
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
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

}
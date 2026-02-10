package eBayPrep;

/**
 * Implementation of Valid Binary Search Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidBinarySearchTree {

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
		System.out.println("Tree with 2 leaf nodes: " + isValidBST(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + isValidBST(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + isValidBST(root3));
	}
//-2147483649l,2147483648l

	/**
	 * Checks if valid bst.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isValidBST(TreeNode tn){
		// Check for null/base case
		if(tn==null)
			return true;
		else 
			// Recursively process left and right subtrees
			return isValidBSTree(tn.left,-2147483649l,tn.val) && isValidBSTree(tn.right,tn.val,2147483648l);
	}

	/**
	 * Checks if valid bs tree.
	 *
	 * @param tn the tree node to process
	 * @param minValue the minValue parameter
	 * @param maxValue the maxValue parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isValidBSTree(TreeNode tn, long minValue, long maxValue) {
		// Check for null/base case
		if(tn==null)
			return true;
		// Recursively process left and right subtrees
		return tn.val>minValue && tn.val<maxValue && isValidBSTree(tn.left, minValue, tn.val) && isValidBSTree(tn.right, tn.val, maxValue);
	}

}


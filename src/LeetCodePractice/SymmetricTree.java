package LeetCodePractice;

/**
 * Implementation of Symmetric Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SymmetricTree {

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
	 * Checks if symmetric.
	 *
	 * @param root the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	public boolean isSymmetric(TreeNode root) {
		// Check for null/base case
		if(root!=null)
		{
			return checkSymmetry(root.left,root.right);
		}
		return true;
	}

	/**
	 * Performs checkSymmetry operation.
	 *
	 * @param left the left parameter
	 * @param right the right parameter
	 * @return true if condition is met, false otherwise
	 */
	private boolean checkSymmetry(TreeNode left, TreeNode right) {
		// Check if node is a leaf (no children)
		if(left!=null && right!=null)
		{
			// Recursively process left and right subtrees
			return left.val==right.val && checkSymmetry(left.right, right.left) && checkSymmetry(left.left, right.right);
		}
		// Check if node is a leaf (no children)
		else if(left!=null || right!=null)
			return false;
		return true;
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
		System.out.println("Tree with 2 leaf nodes: " + isSymmetric(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + isSymmetric(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + isSymmetric(root3));
	}

}


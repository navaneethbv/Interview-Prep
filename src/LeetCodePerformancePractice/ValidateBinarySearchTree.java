package LeetCodePerformancePractice;

/**
 * Implementation of Validate Binary Search Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidateBinarySearchTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	/**
	 * Checks if valid bst.
	 *
	 * @param root the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	public boolean isValidBST(TreeNode root) {
		// Check for null/base case
		if(root==null)
			return true;
		// Recursively process left and right subtrees
		return isValidBSTChecker(root.left,Long.MIN_VALUE,root.val) && isValidBSTChecker(root.right,root.val,Long.MAX_VALUE);

	}
	/**
	 * Checks if valid bst checker.
	 *
	 * @param root the tree node to process
	 * @param minValue the minValue parameter
	 * @param maxValue the maxValue parameter
	 * @return true if condition is met, false otherwise
	 */
	private boolean isValidBSTChecker(TreeNode root, long minValue, long maxValue) {
		// Check for null/base case
		if(root!=null)
		{
			return root.val>minValue && root.val<maxValue && 
					isValidBSTChecker(root.left,minValue,root.val) 
					&& isValidBSTChecker(root.right,root.val,maxValue);
		}
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

}

package LeetCodePractice;

/**
 * Implementation of Same Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SameTree {

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
	 * Checks if same tree.
	 *
	 * @param p the p parameter
	 * @param q the q parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
		// Check for null/base case
		if(p!=null && q!=null)
		{
			// Recursively process left and right subtrees
			return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		// Check for null/base case
		else if(p!=null || q!=null)
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
		System.out.println("Tree with 2 leaf nodes: " + isSameTree(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + isSameTree(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + isSameTree(root3));
	}

}


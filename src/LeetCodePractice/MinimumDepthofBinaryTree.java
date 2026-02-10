package LeetCodePractice;

/**
 * Implementation of Minimum Depthof Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinimumDepthofBinaryTree {

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
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(2);
		tn.right.left=new TreeNode(2);
		
		System.out.println(minDepth(tn));
	}
	
	/**
	 * Performs minDepth operation.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	public static int minDepth(TreeNode root) {
		// Check for null/base case
		if(root==null)
			return 0;
		return getMinDepth(root);
		
	}

	/**
	 * Retrieves min depth from the data structure.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private static int getMinDepth(TreeNode root) {
		// Check if node is a leaf (no children)
		if(root.left!=null && root.right!=null)
			// Recursively process left and right subtrees
			return 1+Math.min(getMinDepth(root.left), getMinDepth(root.right));
		// Check for null/base case
		else if(root.left!=null)
			// Recursively process left and right subtrees
			return 1+getMinDepth(root.left);
		// Check for null/base case
		else if(root.right!=null)
			// Recursively process left and right subtrees
			return 1+getMinDepth(root.right);
		else 
			return 1;
	}

}


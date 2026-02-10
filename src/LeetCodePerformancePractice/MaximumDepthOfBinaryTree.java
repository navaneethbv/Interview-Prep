package LeetCodePerformancePractice;

/**
 * Implementation of Maximum Depth Of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumDepthOfBinaryTree {
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

	}
	/**
	 * Performs maxDepth operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	static int maxDepth(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return 0;
		// Recursively process left and right subtrees
		return 1+Math.max(maxDepth(tn.left), maxDepth(tn.right));
	}

}

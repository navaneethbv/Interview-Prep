package LeetCodePerformancePractice;

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
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		tn.right.right=new TreeNode(3);
		tn.right.left=new TreeNode(4);
		tn.left.right=new TreeNode(4);
		System.out.println(isSymmetric(tn));
		tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(2);
		tn.right.right=new TreeNode(3);
		tn.left.right=new TreeNode(3);
		System.out.println(isSymmetric(tn));
	}
	/**
	 * Checks if symmetric.
	 *
	 * @param root the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isSymmetric(TreeNode root) {
		// Check for null/base case
		if(root==null)
			return true;
		// Recursively process left and right subtrees
		return isSymmetricUtil(root.left,root.right);
	}
	/**
	 * Checks if symmetric util.
	 *
	 * @param tn the tree node to process
	 * @param tn1 the tn1 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isSymmetricUtil(TreeNode tn,TreeNode tn1) {
		// Check for null/base case
		if(tn!=null && tn1!=null)
		{
			// Recursively process left and right subtrees
			return tn.val==tn1.val && isSymmetricUtil(tn.left, tn1.right) && isSymmetricUtil(tn.right, tn1.left);
		}
		// Check for null/base case
		if(tn1!=null ||tn!=null)
			return false;
		return true;
	}

}

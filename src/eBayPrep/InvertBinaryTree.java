package eBayPrep;

/**
 * Implementation of Invert Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InvertBinaryTree{
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
		TreeNode tn=new TreeNode(4);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(7);
		tn.left.left=new TreeNode(1);
		tn.left.right=new TreeNode(3);
		tn.right.left=new TreeNode(6);
		tn.right.right=new TreeNode(9);
		preOrder(tn);System.out.println();
		tn=invertTree(tn);
		preOrder(tn);
	}
	/**
	 * Performs invertTree operation.
	 *
	 * @param tn the tree node to process
	 * @return the TreeNode result
	 */
	private static TreeNode invertTree(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return tn;
		invertTree(tn.left);
		invertTree(tn.right);
		TreeNode tn1=tn.left;
		tn.left=tn.right;
		tn.right=tn1;
		return tn;
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			preOrder(tn.left);System.out.print(tn.val+"/");preOrder(tn.right);
		}
	}

}


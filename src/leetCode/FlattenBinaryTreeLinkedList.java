package leetCode;

/*
 * Link : https://leetcode.com/problems/path-sum/
 */

/**
 * Implementation of Flatten Binary Tree Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FlattenBinaryTreeLinkedList {
	static TreeNode tn;
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
	 * Performs flatten operation.
	 *
	 * @param root the tree node to process
	 */
	public static void flatten(TreeNode root) {
		TreeNode tn=new TreeNode(0);
		TreeNode temp=tn;
		preOrderChange(root);
		root=tn.right;
	}
	/**
	 * Performs preOrderChange operation.
	 *
	 * @param root the tree node to process
	 */
	private static void preOrderChange(TreeNode root) {
		// Check for null/base case
		if(root!=null)
		{
			tn=root;
			//System.out.println(root.val);
			tn=tn.right;
			preOrderChange(root.left);
			preOrderChange(root.right);
		}
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param root the tree node to process
	 */
	private static void preOrder(TreeNode root) {
		// Check for null/base case
		if(root!=null)
		{
			System.out.println(root.val);
			//preOrder(root.left);
			preOrder(root.right);
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tNode=new TreeNode(1);
		tNode.left=new TreeNode(2);
		tNode.right=new TreeNode(5);
		tNode.left.left=new TreeNode(3);
		tNode.left.right=new TreeNode(4);
		tNode.right.right=new TreeNode(6);
		flatten(tNode);
		preOrder(tNode);
	}
}
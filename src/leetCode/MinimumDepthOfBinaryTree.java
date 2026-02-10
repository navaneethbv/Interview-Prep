package leetCode;

/*
 * Link : https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */

/**
 * Implementation of Minimum Depth Of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinimumDepthOfBinaryTree {
	static int[] path=new int[10000];
	static int min=Integer.MAX_VALUE;
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
		min=Integer.MAX_VALUE;
		getMinimumDepthOfBinaryTree(root,path,0);
		return min;
	}
	/**
	 * Retrieves minimum depth of binary tree from the data structure.
	 *
	 * @param root the tree node to process
	 * @param path1 the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void getMinimumDepthOfBinaryTree(TreeNode root, int[] path1, int pathLen) {
		// Check for null/base case
		if(root==null)
			return;
		path1[pathLen]=root.val;
		pathLen++;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null)
		{
			if(pathLen<min)
				min=pathLen;
		}
		else{
			getMinimumDepthOfBinaryTree(root.left, path1, pathLen);
			getMinimumDepthOfBinaryTree(root.right, path1, pathLen);
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode rootnode=new TreeNode(3);
		rootnode.left=new TreeNode(9);
		rootnode.right=new TreeNode(20);
		rootnode.right.left=new TreeNode(15);
		rootnode.right.right=new TreeNode(7);
		System.out.println(minDepth(rootnode));
	}
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
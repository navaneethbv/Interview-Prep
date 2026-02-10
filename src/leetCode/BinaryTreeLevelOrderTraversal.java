package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/binary-tree-level-order-traversal/
 */

/**
 * Implementation of Binary Tree Level Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreeLevelOrderTraversal {
	static List<List<Integer>> list=new ArrayList<List<Integer>>();
	static List<Integer> innerList=new ArrayList<Integer>();
	/**
	 * Performs levelOrder operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public static List<List<Integer>> levelOrder(TreeNode root) {
		list=new ArrayList<List<Integer>>();
		levelOrderTraversal(root);
		return list;
	}
	/**
	 * Performs levelOrderTraversal operation.
	 *
	 * @param root the tree node to process
	 */
	public static void levelOrderTraversal(TreeNode root)
	public static void levelOrderTraversal(TreeNode root)
	{
		for (int i = 1; i <=height(root); i++) {
			innerList=new ArrayList<Integer>();
			printNodes(root,i);
			list.add(innerList);
		}
	}
	/**
	 * Performs printNodes operation.
	 *
	 * @param root the tree node to process
	 * @param level the level parameter
	 */
	private static void printNodes(TreeNode root, int level) {
		// Check for null/base case
		if(root==null)
			return;
		if(level==1){
			innerList.add(root.val);
			System.out.println(root.val);
		}
		else if(level>1)
		{
			printNodes(root.left, level-1);
			printNodes(root.right, level-1);
		}

	}
	/**
	 * Performs height operation.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private static  int height(TreeNode root) {

		// Check for null/base case
		if(root!=null)
		{
			int leftHeight=height(root.left);
			int rightHeight=height(root.right);
			return 1+Math.max(leftHeight, rightHeight);
		}
		return 0;
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
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		/*tn.right=new TreeNode(20);
		tn.left.left=new TreeNode(15);
		tn.left.right=new TreeNode(7);*/
		System.out.println(levelOrder(tn).size());


	}
}
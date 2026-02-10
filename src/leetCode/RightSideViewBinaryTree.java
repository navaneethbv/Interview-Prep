package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/binary-tree-right-side-view/
 */

/**
 * Implementation of Right Side View Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RightSideViewBinaryTree {
	static int maxLevel=0;
	static List<Integer> list;
	/**
	 * Performs rightSideView operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public static List<Integer> rightSideView(TreeNode root) {
		maxLevel=0;
		list=new ArrayList<>();
		rightView(root,1);
		return list;
	}
	/**
	 * Performs rightView operation.
	 *
	 * @param root the tree node to process
	 * @param level the level parameter
	 */
	private static void rightView(TreeNode root, int level) {
		
		// Check for null/base case
		if(root==null)
			return;
		if(maxLevel<level){
			list.add(root.val);
			maxLevel=level;
		}
		rightView(root.right, level+1);//interchange for left side view
		rightView(root.left, level+1);
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
		tn.right=new TreeNode(3);
		tn.left.right=new TreeNode(4);
		tn.left.right.left=new TreeNode(5);
		tn.left.left=new TreeNode(6);
		rightSideView(tn);
	}
}
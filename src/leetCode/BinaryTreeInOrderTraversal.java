package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/merge-sorted-array/
 */

/**
 * Implementation of Binary Tree In Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreeInOrderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	static List<Integer> list;
	/**
	 * Performs inorderTraversal operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
		list=new ArrayList<>();
		inOrder(root);
		return list;
	}
	/**
	 * Performs inOrder operation.
	 *
	 * @param root the tree node to process
	 */
	public void inOrder(TreeNode root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			list.add(root.val);
			inOrder(root.right);
		}
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
		System.out.println("Tree with 2 leaf nodes: " + inorderTraversal(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + inorderTraversal(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + inorderTraversal(root3));
	}

}
package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Binary Tree Right Side View algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreeRightSideView {
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
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println("Tree with 2 leaf nodes: " + rightSideView(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + rightSideView(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + rightSideView(root3));
	}
	static boolean added=false;
	static List<Integer> outputList;
	/**
	 * Performs rightSideView operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public static List<Integer> rightSideView(TreeNode root) {
		outputList=new ArrayList<>();
		// Check for null/base case
		if(root==null)
			return outputList;
		int length=getLength(root);
		// Iterate through all elements
		for (int i = 0; i < length; i++) {
			added=false;
			getNode(root,i);
		}
		return outputList;
	}
	/**
	 * Retrieves node from the data structure.
	 *
	 * @param root the tree node to process
	 * @param level the level parameter
	 */
	private static void getNode(TreeNode root,int level) {
		// Check for null/base case
		if(added||root==null)
			return;
		// Check for null/base case
		if(level==0)
		{
			outputList.add(root.val);
			added=true;
			return;
		}
		getNode(root.right, level-1);
		getNode(root.left, level-1);
	}
	/**
	 * Retrieves length from the data structure.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private static int getLength(TreeNode root) {
		// Recursively process left and right subtrees
		return root==null?0:1+Math.max(getLength(root.left), getLength(root.right));
	}

}
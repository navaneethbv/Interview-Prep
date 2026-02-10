package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Pre Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PreOrderTraversal {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left,right;
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
		System.out.println("Tree with 2 leaf nodes: " + preorderTraversal(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + preorderTraversal(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + preorderTraversal(root3));
	}
	static List<Integer> outputList;
	/**
	 * Performs preorderTraversal operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
		outputList=new ArrayList<>();
		preOrder(root);
		return outputList;
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param root the tree node to process
	 */
	private void preOrder(TreeNode root) {
		// Check for null/base case
		if(root!=null)
		{
			outputList.add(root.val);
			preOrder(root.left);
			preOrder(root.right);			
		}
	}
}

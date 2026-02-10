package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Flatten Binary Treeto Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FlattenBinaryTreetoLinkedList {

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
		tn.right=new TreeNode(5);
		tn.left.left=new TreeNode(3);
		tn.left.right=new TreeNode(4);
		tn.right.right=new TreeNode(6);
		preOrder(tn);
		flatten(tn);
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
			System.out.println(tn.val);
			preOrder(tn.left);
			preOrder(tn.right);
		}

	}
	/**
	 * Performs flatten operation.
	 *
	 * @param root the tree node to process
	 */
	public static void flatten(TreeNode root) {
		// Check for null/base case
		if(root==null)
			return;
		Stack<TreeNode> stack=new Stack<>();
		while(root!=null)
		{
			// Check for null/base case
			if(root.right!=null)
				stack.push(root.right);
			// Check for null/base case
			if(root.left!=null)
			{
				root.right=root.left;
				root.left=null;
			}else if(!stack.isEmpty()){
				root.right=stack.pop();
			}
			root=root.right;
		}
	}
	
}


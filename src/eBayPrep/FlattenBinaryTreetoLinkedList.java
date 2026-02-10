package eBayPrep;

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
		System.out.println();
		flatten(tn);
	}
	/**
	 * Performs flatten operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void flatten(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return;
		Stack<TreeNode> stack=new Stack<>();
		TreeNode pointer=tn;
		while(tn!=null)
		{
			// Check for null/base case
			if(tn.right!=null)
				stack.push(tn.right);
			// Check for null/base case
			if(tn.left!=null){
				tn.right=tn.left;
				tn.left=null;
			}
			else if(!stack.isEmpty()){
				tn.right=stack.pop();
			}
			tn=tn.right;
		}
		preOrder(pointer);
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
			preOrder(tn.left);
			System.out.print(tn.val+"/");
			preOrder(tn.right);
		}

	}

}


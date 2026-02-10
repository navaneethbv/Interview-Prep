package GeeksforGeeksPractice;

import java.util.Stack;

/*
 * Link : http://www.geeksforgeeks.org/reverse-alternate-levels-binary-tree/
 */
/**
 * Implementation of Reverse Alternate Levels algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseAlternateLevels {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(6);
		tn.right.right=new TreeNode(7);
		
		tn.left.left.left=new TreeNode(8);
		tn.left.left.right=new TreeNode(9);
		
		tn.left.right.left=new TreeNode(10);
		tn.left.right.right=new TreeNode(11);
		
		tn.right.left.left=new TreeNode(12);
		tn.right.left.right=new TreeNode(13);
		
		tn.right.right.left=new TreeNode(14);
		tn.right.right.right=new TreeNode(15);
		
		levelOrderTraversal(tn);
		alterNateLevels(tn);
		levelOrderTraversal(tn);
		
	}
	static Stack<Integer> stack=new Stack<Integer>();
	/**
	 * Performs alterNateLevels operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void alterNateLevels(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = 0; i <=height; i++) {
			if(i%2!=0)
				changeLeaves(tn,i);
		}
	}

	/**
	 * Performs changeLeaves operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 */
	private static void changeLeaves(TreeNode tn, int i) {
		printNodesArray(tn,i);
		replaceNodesArray(tn,i);
	}

	/**
	 * Performs replaceNodesArray operation.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 */
	private static void replaceNodesArray(TreeNode tn, int level) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check for null/base case
			if(level==0)
			{
				(tn.value)=stack.pop();
			}
			replaceNodesArray(tn.left, level-1);
			replaceNodesArray(tn.right, level-1);
		}
		
	}

	/**
	 * Performs printNodesArray operation.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 */
	private static void printNodesArray(TreeNode tn, int level) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check for null/base case
			if(level==0)
			{
				stack.push(tn.value);
			}
			printNodesArray(tn.left, level-1);
			printNodesArray(tn.right, level-1);
		}
	}

	/**
	 * Performs levelOrderTraversal operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void levelOrderTraversal(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = 0; i <=height; i++) {
			printNodes(tn,i);
			System.out.println(i+"->");
		}
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Recursively process left and right subtrees
		return tn!=null?1+Math.max(getHeight(tn.left), getHeight(tn.right)):0;
	}

	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 */
	private static void printNodes(TreeNode tn, int level) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check for null/base case
			if(level==0)
				System.out.print(tn.value+"//");
			printNodes(tn.left, level-1);
			printNodes(tn.right, level-1);
		}
	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		TreeNode left,right;
		int value;
		public TreeNode(int value) {
			this.value=value;
		}		
	}

}

package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Binary Tree Level Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreeLevelOrderTraversal {

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
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(6);
		levelOrder(tn);
	}
	static List<Integer> list;
	/**
	 * Performs levelOrder operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public static List<List<Integer>> levelOrder(TreeNode root) {
		 List<List<Integer>> outputList=new ArrayList<>();
		// Check for null/base case
		if(root!=null)
		{
			int height=getHeight(root);
			for (int i = 0; i < height; i++) {
				list=new ArrayList<>();
				printNodes(root,i,list);
				outputList.add(list);
			}
		}
		return outputList;
	}

	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 * @param list the list parameter
	 */
	private static void printNodes(TreeNode tn, int level, List<Integer> list) {
		// Check for null/base case
		if(tn==null)
			return;
		// Check for null/base case
		if(level==0)
		{
			list.add(tn.val);
		}
		printNodes(tn.left, level-1,list);
		printNodes(tn.right, level-1,list);
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
		}
		return 0;
	}


}


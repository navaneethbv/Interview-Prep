package LeetCodePractice;

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
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.right=new TreeNode(5);
		tn.right.right=new TreeNode(4);
		rightSideView(tn);
	}
	static List<Integer> list;
	/**
	 * Performs rightSideView operation.
	 *
	 * @param tn the tree node to process
	 * @return the list of results
	 */
	public static List<Integer> rightSideView(TreeNode tn) {
		list=new ArrayList<>();
		int height=getHeight(tn);
		for (int i = 0; i < height; i++) {
			b=false;
			printNodes(tn,i);
		}
		return list;
	}
	static boolean b=false;
	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 */
	private static void printNodes(TreeNode tn, int i) {
		// Check for null/base case
		if(tn==null||b)return;
		if(i==0 && !b){
			list.add(tn.val);
			b=true;
		}
		printNodes(tn.right, i-1);
		printNodes(tn.left, i-1);
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
}


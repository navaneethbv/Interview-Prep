package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */

/**
 * Implementation of Binary Level Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryLevelOrderTraversal {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	static List<List<Integer>> ArrayList;
	static List<Integer> arrayArrayList;
	/**
	 * Performs levelOrderBottom operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		int height=getHeight(root);
		ArrayList=new ArrayList<List<Integer>>();
		for (int i = 1; i <=height; i++) {
			arrayArrayList=new ArrayList<>();
			printNodes(root,i);
			ArrayList.add(arrayArrayList);
		}
		List<List<Integer>> ArrayListNew=new ArrayList<List<Integer>>();

		for (int i = ArrayList.size()-1;i>=0; i--) {
			ArrayListNew.add(ArrayList.get(i));	
		}
		return ArrayListNew;
	}





	/**
	 * Performs printNodes operation.
	 *
	 * @param root the tree node to process
	 * @param height the height parameter
	 */
	private static void printNodes(TreeNode root, int height) {
		// Check for null/base case
		if(root==null)
			return;
		if(height==1){
			arrayArrayList.add(root.val);
		}
		else if(height>1){
			printNodes(root.left, height-1);
			printNodes(root.right, height-1);
		}
	}





	/**
	 * Retrieves height from the data structure.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode root) {
		int leftHeight=0,rightHeight=0;
		// Check for null/base case
		if(root==null)
			return 0;
		// Check for null/base case
		if(root.left!=null)
			leftHeight=getHeight(root.left);
		// Check for null/base case
		if(root.right!=null)
			rightHeight=getHeight(root.right);
		if(leftHeight>rightHeight)
			return 1+leftHeight;
		else
			return 1+rightHeight;
	}





	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode rootnode=new TreeNode(3);
		rootnode.left=new TreeNode(9);
		rootnode.right=new TreeNode(20);
		rootnode.right.left=new TreeNode(15);
		rootnode.right.right=new TreeNode(7);
		List<List<Integer>> ArrayList=levelOrderBottom(rootnode);
		for (int i = 0; i < ArrayList.size(); i++) {
			System.out.println(Arrays.toString(ArrayList.get(i).toArray()));
		}
	}
}
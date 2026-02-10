package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Binary Tree Paths algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreePaths{
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
		tn.right.right=new TreeNode(7);
		binaryTreePaths(tn);
	}
	static int[] path;
	static List<String> list;
	/**
	 * Performs binaryTreePaths operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public static List<String> binaryTreePaths(TreeNode root) {
		path=new int[100];
		list=new ArrayList<String>();
		// Check for null/base case
		if(root==null)
		{
			return list;
		}
		printNodes(root,0);
		return list;
	}
	/**
	 * Performs printNodes operation.
	 *
	 * @param root the tree node to process
	 * @param i the i parameter
	 */
	private static void printNodes(TreeNode root, int i) {
		// Check for null/base case
		if(root==null)
			return;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null){
			path[i]=root.val;
			String str=(Arrays.toString(Arrays.copyOf(path, i+1)));
			str=str.replace(", ", "->").replace("[", "").replace("]", "");
			list.add(str);
			return;
		}
		path[i]=root.val;
		printNodes(root.left, i+1);
		printNodes(root.right, i+1);
	}
	

}


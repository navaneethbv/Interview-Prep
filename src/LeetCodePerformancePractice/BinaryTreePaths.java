package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Binary Tree Paths algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreePaths {
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
		System.out.println(binaryTreePaths(tn));
	}
	static  List<String> outputList;
	/**
	 * Performs binaryTreePaths operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public static List<String> binaryTreePaths(TreeNode root) {
		outputList=new ArrayList<>();
		// Check for null/base case
		if(root==null)
			return outputList;
		getPaths(root,"");
		return outputList;
	}
	/**
	 * Retrieves paths from the data structure.
	 *
	 * @param root the tree node to process
	 * @param string the string parameter
	 */
	private static void getPaths(TreeNode root, String string) {
		// Check for null/base case
		if(root==null)
			return;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null)
		{
			// Check for null/base case
			if(string.length()==0)
				string+=root.val;
			else
				string+="->"+root.val;
			outputList.add(string);
			return;
		}
		// Check for null/base case
		if(string.length()==0)
			string+=root.val;
		else
			string+="->"+root.val;
		getPaths(root.left, string);
		getPaths(root.right, string);
	}

}

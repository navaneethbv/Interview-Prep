package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/binary-tree-paths/
 */

/**
 * Implementation of Binary Tree Paths algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreePaths {
	static int paths[]=new int[100000];
	static List<String> stringList;
	/**
	 * Performs binaryTreePaths operation.
	 *
	 * @param root the tree node to process
	 * @return the list of results
	 */
	public static List<String> binaryTreePaths(TreeNode root) {
		stringList=new ArrayList<>();
		paths=new int[100000];
		findPaths(root,paths,0);
		return stringList;
	}
	/**
	 * Finds paths in the data structure.
	 *
	 * @param root the tree node to process
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void findPaths(TreeNode root, int[] path, int pathLen) {
		// Check for null/base case
		if(root==null)
			return;
		path[pathLen]=root.val;
		pathLen++;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null)
		{
			printPaths(path,pathLen);
		}
		else
		{
			findPaths(root.left, path, pathLen);
			findPaths(root.right, path, pathLen);
		}
	}
	/**
	 * Performs printPaths operation.
	 *
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void printPaths(int[] path, int pathLen) {

		if(pathLen==1){
			stringList.add(path[0]+"");
			return;
		}
		StringBuilder sb=new StringBuilder();
		int i = 0;
		for (i = 0; i <pathLen-1; i++) {
			sb=sb.append(path[i]+"->");
		}
		sb=sb.append(path[i]);
		stringList.add(sb.toString());
	}
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
		System.out.println("Tree with 2 leaf nodes: " + binaryTreePaths(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + binaryTreePaths(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + binaryTreePaths(root3));
	}
}
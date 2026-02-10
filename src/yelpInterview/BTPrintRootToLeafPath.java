package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of BT Print Root To Leaf Path algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTPrintRootToLeafPath {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node left,right;
		int value;
		public Node(int value) {
			this.value=value;
		}
	}
	static int[]path=new int[100];
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7);
		printPaths(n,path,0);System.out.println();
	}
	/**
	 * Performs printPaths operation.
	 *
	 * @param n the size or count parameter
	 * @param path the array to process
	 * @param level the level parameter
	 */
	private static void printPaths(Node n, int[] path, int level) {
		// Check for null/base case
		if(n!=null)
		{
			path[level]=n.value;
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
			{
				System.out.println(Arrays.toString(path));
			}
			printPaths(n.left, path, level+1);
			printPaths(n.right, path, level+1);
		}
	}
}


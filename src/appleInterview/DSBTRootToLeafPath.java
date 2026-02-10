package appleInterview;

import java.util.Arrays;

/**
 * Implementation of DSBT Root To Leaf Path algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTRootToLeafPath {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node left,right;
		int value;
		public Node(int value){
			this.value=value;
		}
	}
	static int path[]=new int[1000];
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		printRootPath(n,path,0);
	}
	/**
	 * Performs printRootPath operation.
	 *
	 * @param n the size or count parameter
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void printRootPath(Node n, int[] path, int pathLen) {
		// Check for null/base case
		if(n!=null)
		{
			path[pathLen]=n.value;
			pathLen++;
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
			{
				System.out.println(Arrays.toString(Arrays.copyOfRange(path, 0, pathLen)));
			}
			printRootPath(n.left, path, pathLen);
			printRootPath(n.right, path, pathLen);
		}
	}
}


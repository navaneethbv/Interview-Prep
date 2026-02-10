package yelpInterview;

/**
 * Implementation of BST Find Largest Sub Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTFindLargestSubTree {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value=value;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		Node n=new Node(5);
		n.left=new Node(2);
		n.right=new Node(4);
		n.left.left=new Node(1);
		n.left.right=new Node(3);
		System.out.println(findLargestBSTUtil(n));
		Node root = new Node(50);
		root.left        = new Node(30);
		root.right       = new Node(60);
		root.left.left  = new Node(5);
		root.left.right = new Node(20);
		root.right.left  = new Node(45);
		root.right.right = new Node(70);
		root.right.right.left = new Node(65);
		root.right.right.right = new Node(80);
		System.out.println(findLargestBSTUtil(root));
	}
	/**
	 * Finds largest bst util in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findLargestBSTUtil(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			if(isBST(n)){
				return getSize(n);
			}
			else{
				// Recursively process left and right subtrees
				return Math.max(findLargestBSTUtil(n.left), findLargestBSTUtil(n.right));
			}
		}
		return 0;
	}
	/**
	 * Retrieves size from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getSize(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return 1+getSize(n.left)+getSize(n.right);
		}
		return 0;
	}
	/**
	 * Checks if bst.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isBST(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return isBSTUtil(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
		}
		return true;
	}
	/**
	 * Checks if bst util.
	 *
	 * @param n the size or count parameter
	 * @param minValue the minValue parameter
	 * @param maxValue the maxValue parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isBSTUtil(Node n, int minValue, int maxValue) {
		// Check for null/base case
		if(n!=null)
		{
			if(n.value>=minValue && n.value<=maxValue)
				// Recursively process left and right subtrees
				return isBSTUtil(n.left, minValue, n.value-1) && isBSTUtil(n.right, n.value+1, maxValue);
			else
				return false;
		}
		return true;
	}



}
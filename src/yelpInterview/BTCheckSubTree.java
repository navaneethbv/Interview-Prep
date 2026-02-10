package yelpInterview;

/**
 * Implementation of BT Check Sub Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTCheckSubTree {
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
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		Node n1=new Node(26);
		n1.left=new Node(10);
		n1.right=new Node(3);
		n1.right.right=new Node(3);
		n1.left.left=new Node(4);
		n1.left.right=new Node(6);
		n1.left.left.right=new Node(30);

		Node n2=new Node(10);
		n2.left=new Node(4);
		n2.right=new Node(6);
		n2.left.right=new Node(30);
		System.out.println(checkSubTree(n1,n2));
	}
	/**
	 * Performs checkSubTree operation.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkSubTree(Node n1, Node n2) {
		// Check for null/base case
		if(n1==null)
			return false;
		// Check for null/base case
		if(n2==null)
			return false;
		if(isIdentical(n1,n2))
		{
			return true;
		}
		// Recursively process left and right subtrees
		return checkSubTree(n1.left, n2)||checkSubTree(n1.right, n2);
	}
	/**
	 * Checks if identical.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isIdentical(Node n1, Node n2) {
		// Check for null/base case
		if(n1==null && n2==null)
			return true;
		// Check for null/base case
		if(n1==null || n2==null)
			return false;
		// Recursively process left and right subtrees
		return n1.value==n2.value && isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right);
	}
}


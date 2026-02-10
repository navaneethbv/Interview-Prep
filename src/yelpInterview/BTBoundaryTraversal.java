package yelpInterview;

/**
 * Implementation of BT Boundary Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTBoundaryTraversal {
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
		Node n=new Node(20);
		n.left=new Node(8);
		n.right=new Node(22);
		n.left.left=new Node(4);
		n.left.right=new Node(12);
		n.right.right=new Node(25);
		n.left.right.left=new Node(10);
		n.left.right.right=new Node(14);
		boundaryTraverse(n);
	}
	/**
	 * Performs boundaryTraverse operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void boundaryTraverse(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			printLeftNodes(n);
			printLeafNodes(n);
			printRightNodes(n);
		}
	}
	/**
	 * Performs printRightNodes operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void printRightNodes(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			printRightNodes(n.right);
			System.out.println(n.value);
		}

	}
	/**
	 * Performs printLeafNodes operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void printLeafNodes(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
				System.out.println(n.value);
			printLeafNodes(n.left);
			printLeafNodes(n.right);

		}
	}
	/**
	 * Performs printLeftNodes operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void printLeftNodes(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			System.out.println(n.value);
			printLeftNodes(n.left);
		}
	}

}


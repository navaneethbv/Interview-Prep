package yelpInterview;

/**
 * Implementation of BT Double Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTDoubleTree {
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
		Node n=new Node(2);
		n.left=new Node(1);
		n.right=new Node(3);
		doubleTree(n);
		preOrder(n);
	}
	/**
	 * Performs doubleTree operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void doubleTree(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			doubleTree(n.left);
			doubleTree(n.right);
			Node oldLeft = n.left;
			n.left=new Node(n.value);
			n.left.left=oldLeft;
		}

	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void preOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			System.out.println(n.value);
			preOrder(n.left);
			preOrder(n.right);
		}

	}

}


package yelpInterview;

/**
 * Implementation of BT Tree Traversals algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTTreeTraversals {

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
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7);
		preOrder(n);System.out.println();
		postOrder(n);System.out.println();
		inOrder(n);System.out.println();
	}
	/**
	 * Performs inOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			inOrder(n.left);
			System.out.print(n.value+"/");
			inOrder(n.right);
		}
	}
	/**
	 * Performs postOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void postOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			System.out.print(n.value+"/");
			postOrder(n.left);
			postOrder(n.right);
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
			preOrder(n.left);
			preOrder(n.right);
			System.out.print(n.value+"/");
		}
	}

}


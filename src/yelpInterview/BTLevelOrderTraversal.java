package yelpInterview;

/**
 * Implementation of BT Level Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTLevelOrderTraversal {

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
		levelOrder(n);System.out.println();
	}
	/**
	 * Performs levelOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void levelOrder(Node n) {
		for (int i = 0; i < getHeight(n); i++) {
			printNode(n,i);
		}

	}
	/**
	 * Performs printNode operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 */
	private static void printNode(Node n, int i) {
		// Check for null/base case
		if(n!=null)
		{
			// Check for null/base case
			if(i==0)
				System.out.println(n.value);
			else if(i>0){
				printNode(n.left, i-1);
				printNode(n.right, i-1);
			}
		}

	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getHeight(Node n) {
		// Check for null/base case
		if(n!=null)
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(n.left), getHeight(n.right));
		return 0;
	}

}


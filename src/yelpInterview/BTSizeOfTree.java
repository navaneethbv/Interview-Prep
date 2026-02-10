package yelpInterview;

/**
 * Implementation of BT Size Of Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTSizeOfTree {
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
		System.out.println(sizeOf(n));System.out.println();
	}
	/**
	 * Performs sizeOf operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int sizeOf(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return 1+sizeOf(n.left)+sizeOf(n.right);
		}
		return 0;
	}

}


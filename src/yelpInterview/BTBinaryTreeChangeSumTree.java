package yelpInterview;

/**
 * Implementation of BT Binary Tree Change Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTBinaryTreeChangeSumTree {
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
		n.right.right=new Node(6);
		changeTree(n);
		inOrder(n);
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
			System.out.println(n.value);
			inOrder(n.right);
		}
	}
	/**
	 * Performs changeTree operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int changeTree(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
				return n.value;
			int leftSum=changeTree(n.left);
			int rightSum=changeTree(n.right);
			n.value+=leftSum;
			return n.value+rightSum;
		}
		return 0;
	}

}


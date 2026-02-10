package yelpInterview;

/**
 * Implementation of BT Max Width Of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTMaxWidthOfBinaryTree {
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
		n.right.left=new Node(5);
		n.right.right=new Node(6);
		n.right.left.right=new Node(7);
		n.right.left.right.left=new Node(9);
		n.right.right.right=new Node(8);
		n.right.right.right.right=new Node(10);
		System.out.println(findmaxWidth(n));
	}
	/**
	 * Finds width in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findmaxWidth(Node n) {
		int width=0;
		for (int i = 0; i < getHeight(n); i++) {
			width=Math.max(width,getWidth(n,i));
		}
		return width;
	}
	/**
	 * Retrieves width from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int getWidth(Node n, int i) {
		// Check for null/base case
		if(n!=null)
		{
			// Check for null/base case
			if(i==0)
				return 1;
			else if(i>0)
			{
				// Recursively process left and right subtrees
				return getWidth(n.left, i-1)+getWidth(n.right, i-1);
			}
		}
		return 0;
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getHeight(Node n) {
		// Recursively process left and right subtrees
		return n!=null?1+Math.max(getHeight(n.left), getHeight(n.right)):0;
	}

}


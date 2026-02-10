package yelpInterview;

/**
 * Implementation of BT Diameter Of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTDiameterOfBinaryTree {
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
		Node n=new Node(50);
		n.left=new Node(7);
		n.right=new Node(2);
		n.left.left=new Node(3);
		n.left.right=new Node(5);
		n.right.left=new Node(1);
		n.right.right=new Node(30);
		System.out.println(diameter(n));System.out.println();
	}
	/**
	 * Performs diameter operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int diameter(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			int leftDiameter=diameter(n.left);
			int rightDiameter=diameter(n.right);
			int height=getHeight(n.left)+1+getHeight(n.right);
			return Math.max(height, Math.max(leftDiameter, rightDiameter));

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
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(n.left), getHeight(n.right));
		}
		return 0;
	}



}


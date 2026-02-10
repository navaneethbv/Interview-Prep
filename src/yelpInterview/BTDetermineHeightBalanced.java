package yelpInterview;

/**
 * Implementation of BT Determine Height Balanced algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTDetermineHeightBalanced {
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
		//n.left.right=new Node(5);
		//n.right.left=new Node(1);
		//n.right.right=new Node(30);
		n.left.left.left=new Node(123);
		System.out.println(checkHeightBalance(n));
		System.out.println();
	}
	/**
	 * Performs checkHeightBalance operation.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkHeightBalance(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return Math.abs(getHeight(n.left)-getHeight(n.right))<=1 && checkHeightBalance(n.left) && checkHeightBalance(n.right);
		}
		return true;
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


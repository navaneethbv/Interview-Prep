package yelpInterview;

/**
 * Implementation of BT Root To Leaf Path Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTRootToLeafPathSum {
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
		System.out.println(hasRootToLeafSumPath(n,60));
		System.out.println();
	}
	/**
	 * Checks if root to leaf sum path.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean hasRootToLeafSumPath(Node n, int i) {
		// Check for null/base case
		if(n!=null){
			if(n.value-i==0)
				return true;
			// Recursively process left and right subtrees
			return hasRootToLeafSumPath(n.left, i-n.value)|| hasRootToLeafSumPath(n.right, i-n.value);
		}
		return false;
	}

}


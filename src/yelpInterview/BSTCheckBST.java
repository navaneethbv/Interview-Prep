package yelpInterview;

/**
 * Implementation of BST Check BST algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTCheckBST {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node left,right;
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
		Node n=new Node(4);
		n.left=new Node(2);
		n.right=new Node(5);
		n.left.left=new Node(1);
		n.left.right=new Node(3);
		System.out.println(isBST(n));
	}
	/**
	 * Checks if bst.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isBST(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return isBSTUtil(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
		}
		return true;
	}
	/**
	 * Checks if bst util.
	 *
	 * @param n the size or count parameter
	 * @param minValue the minValue parameter
	 * @param maxValue the maxValue parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isBSTUtil(Node n, int minValue, int maxValue) {
		// Check for null/base case
		if(n!=null)
		{
			if(n.value>maxValue || n.value<minValue)
				return false;
			// Recursively process left and right subtrees
			return isBSTUtil(n.left, minValue, n.value-1) && isBSTUtil(n.right, n.value+1,maxValue);
		}
		return true;
	}

}
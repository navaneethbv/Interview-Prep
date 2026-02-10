package yelpInterview;

/**
 * Implementation of BT Check Full Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTCheckFullBinaryTree {
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
		Node n1=new Node(1);
		n1.left=new Node(2);
		n1.right=new Node(3);
		n1.left.left=new Node(4);
		//n1.left.right=new Node(5);
		System.out.println(checkBinTree(n1));
	}
	/**
	 * Performs checkBinTree operation.
	 *
	 * @param n1 the n1 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkBinTree(Node n1) {
		// Check for null/base case
		if(n1!=null)
		{
			// Check if node is a leaf (no children)
			if(n1.left==null && n1.right==null)
				return true;
			// Check if node is a leaf (no children)
			if(n1.left!=null && n1.right!=null)
				// Recursively process left and right subtrees
				return checkBinTree(n1.left) && checkBinTree(n1.right);
			return false;
		}
		return true;
	}


}


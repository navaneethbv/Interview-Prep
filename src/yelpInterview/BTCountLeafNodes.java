package yelpInterview;

/**
 * Implementation of BT Count Leaf Nodes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTCountLeafNodes {
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
		System.out.println(countLeafNodes(n));System.out.println();
	}
	/**
	 * Counts the number of leaf nodes.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int countLeafNodes(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
				return 1;
			// Recursively process left and right subtrees
			return countLeafNodes(n.left)+countLeafNodes(n.right);
		}
		return 0;
	}
}


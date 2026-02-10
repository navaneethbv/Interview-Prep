package yelpInterview;

/**
 * Implementation of BT Sum Of Left Leaf Nodes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTSumOfLeftLeafNodes {
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
		Node n=new Node(20);
		n.left=new Node(9);
		n.right=new Node(49);
		n.left.left=new Node(5);
		n.left.right=new Node(12);
		n.left.right.right=new Node(15);
		n.right.left=new Node(23);
		n.right.right=new Node(52);
		n.right.right.left=new Node(50);
		System.out.println(findLeftLeafSum(n));
	}
	/**
	 * Finds left leaf sum in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findLeftLeafSum(Node n) {
		// Recursively process left and right subtrees
		return findLeftLeafSumUtil(n,true);
	}
	/**
	 * Finds left leaf sum util in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param b the b parameter
	 * @return the computed integer result
	 */
	private static int findLeftLeafSumUtil(Node n, boolean b) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(b && n.left==null && n.right==null)
				return n.value;
			else
			{
				// Recursively process left and right subtrees
				return findLeftLeafSumUtil(n.left, true)+findLeftLeafSumUtil(n.right, false);
			}
		}
		return 0;
	}

}


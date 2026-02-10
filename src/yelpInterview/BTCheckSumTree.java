package yelpInterview;

/**
 * Implementation of BT Check Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTCheckSumTree {
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
		Node n1=new Node(26);
		n1.left=new Node(10);
		n1.right=new Node(3);
		n1.left.left=new Node(4);
		n1.left.right=new Node(6);
		n1.right.right=new Node(3);
		System.out.println(checkSum(n1));
	}
	/**
	 * Performs checkSum operation.
	 *
	 * @param n1 the n1 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkSum(Node n1) {
		// Check if node is a leaf (no children)
		if(n1==null || (n1.left==null && n1.right==null))
			return true;
		// Recursively process left and right subtrees
		return (n1.value==checkSumUtil(n1.left)+checkSumUtil(n1.right)) && checkSum(n1.left) && checkSum(n1.right);
	}
	/**
	 * Performs checkSumUtil operation.
	 *
	 * @param n1 the n1 parameter
	 * @return the computed integer result
	 */
	private static int checkSumUtil(Node n1) {
		// Check for null/base case
		if(n1!=null)
		{
			// Recursively process left and right subtrees
			return n1.value+checkSumUtil(n1.left)+checkSumUtil(n1.right);
		}
		return 0;
	}

}


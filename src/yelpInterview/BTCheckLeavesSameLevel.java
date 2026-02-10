package yelpInterview;

/**
 * Implementation of BT Check Leaves Same Level algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTCheckLeavesSameLevel {
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
		Node n=new Node(12);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.right.left=new Node(5);
		System.out.println(checkSameLevelLeaf(n));
	}
	/**
	 * Performs checkSameLevelLeaf operation.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkSameLevelLeaf(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			return checkLeafUtil(n,0);
		}
		return true;
	}
	static int currLevel=-1;
	/**
	 * Performs checkLeafUtil operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkLeafUtil(Node n, int i) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
			{
				if(currLevel!=-1 && currLevel!=i)
					return false;
				else{
					currLevel=i;
				}
			}
			// Recursively process left and right subtrees
			return checkLeafUtil(n.left, i+1) && checkLeafUtil(n.right, i+1);
		}
		return true;
	}

}


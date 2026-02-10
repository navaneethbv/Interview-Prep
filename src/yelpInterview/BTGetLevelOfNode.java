package yelpInterview;

/**
 * Implementation of BT Get Level Of Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTGetLevelOfNode {
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
		getLevel(n,9);
		System.out.println(level);
	}
	/**
	 * Retrieves level from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param nodeVal the nodeVal parameter
	 */
	private static void getLevel(Node n, int nodeVal) {
		// Check for null/base case
		if(n!=null)
		{
			getLevelUtil(n,nodeVal,1);
		}
	}
	/**
	 * Retrieves level util from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param nodeVal the nodeVal parameter
	 * @param i the i parameter
	 */
	private static void getLevelUtil(Node n, int nodeVal, int i) {
		// Check for null/base case
		if(n!=null)
		{
			if(n.value==nodeVal)
				level=i;
			else{
				getLevelUtil(n.left, nodeVal, i+1);
				getLevelUtil(n.right, nodeVal, i+1);
			}
		}
	}
	static int level=0;

}


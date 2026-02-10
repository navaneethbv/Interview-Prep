package yelpInterview;

/**
 * Implementation of B Tnext Right Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTnextRightNode {
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
		n.right.left.right=new Node(8);
		nextRightNode(n,2);
	}
	/**
	 * Performs nextRightNode operation.
	 *
	 * @param n the size or count parameter
	 * @param nodeVal the nodeVal parameter
	 */
	private static void nextRightNode(Node n, int nodeVal) {
		for (int i = 0; i < getHeight(n); i++) {
			levelOrder(n,i,nodeVal);
			if(sb.toString().contains("/"+nodeVal+"/"))//find next from string manipulation
				break;
		}
		System.out.println(sb.toString());
	}
	static StringBuilder sb=new StringBuilder();
	/**
	 * Performs levelOrder operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param nodeVal the nodeVal parameter
	 */
	private static void levelOrder(Node n, int i,int nodeVal) {
		// Check for null/base case
		if(n!=null)
		{
			// Check for null/base case
			if(i==0)
			{
				sb.append("/"+n.value+"/");
			}
			else if(i>0)
			{
				levelOrder(n.left, i-1, nodeVal);
				levelOrder(n.right, i-1, nodeVal);
			}
		}
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getHeight(Node n) {
		// Recursively process left and right subtrees
		return n!=null?1+Math.max(getHeight(n.left), getHeight(n.right)):0;
	}

}


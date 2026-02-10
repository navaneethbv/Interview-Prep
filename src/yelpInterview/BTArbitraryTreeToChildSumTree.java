package yelpInterview;

/**
 * Implementation of BT Arbitrary Tree To Child Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTArbitraryTreeToChildSumTree {
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
		convertSumTree(n);
		preOrder(n);
		System.out.println();
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void preOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			preOrder(n.left);System.out.print(n.value+"/");preOrder(n.right);
		}
	}
	/**
	 * Performs convertSumTree operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void convertSumTree(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			convertSumTree(n.left);
			convertSumTree(n.right);
			int leftVal=n.left!=null?n.left.value:0;
			int rightVal=n.right!=null?n.right.value:0;
			int diff=-n.value+leftVal+rightVal;
			if(diff>0)
			{
				n.value+=diff;
			}
			if(diff<0)
			{
				increment(n,-diff);
			}
		}

	}
	/**
	 * Performs increment operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 */
	private static void increment(Node n, int i) {
		// Check for null/base case
		if(n.left!=null){
			n.left.value+=i;
			increment(n.left,i);
		}
		// Check for null/base case
		else if(n.right!=null){
			n.right.value+=i;
			increment(n.right,i);
		}
	}

}


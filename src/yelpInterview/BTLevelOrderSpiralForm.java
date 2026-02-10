package yelpInterview;

/**
 * Implementation of BT Level Order Spiral Form algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTLevelOrderSpiralForm {
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
		levelOrderSpiral(n);System.out.println();
	}
	/**
	 * Performs levelOrderSpiral operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void levelOrderSpiral(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			boolean flag=true;
			for (int i = 0; i < getHeight(n); i++) {
				printNodes(n,i,flag);
				flag=!flag;
			}
		}
	}
	/**
	 * Performs printNodes operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param flag the flag parameter
	 */
	private static void printNodes(Node n, int i, boolean flag) {
		// Check for null/base case
		if(n!=null)
		{
			// Check for null/base case
			if(i==0)
				System.out.println(n.value);
			else if(i>0)
			{
				if(flag)
				{
					printNodes(n.left, i-1, flag);
					printNodes(n.right, i-1, flag);
				}else{
					printNodes(n.right, i-1, flag);
					printNodes(n.left, i-1, flag);
				}
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
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(n.left), getHeight(n.right));
		}
		return 0;
	}

}


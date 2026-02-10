package yelpInterview;

/**
 * Implementation of BT Levels In Line algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTLevelsInLine {

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
		levelsInLineOrder(n);System.out.println();
	}
	/**
	 * Performs levelsInLineOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void levelsInLineOrder(Node n) {
		for (int i = 0; i < getHeight(n); i++) {
			printNode(n,i);
			System.out.println();
		}

	}
	/**
	 * Performs printNode operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 */
	private static void printNode(Node n, int i) {
		// Check for null/base case
		if(n!=null)
		{
			// Check for null/base case
			if(i==0)
				System.out.print(n.value+" ");
			else if(i>0){
				printNode(n.left, i-1);
				printNode(n.right, i-1);
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
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(n.left), getHeight(n.right));
		return 0;
	}

}


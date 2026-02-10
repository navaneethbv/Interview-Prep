package yelpInterview;

/**
 * Implementation of BT Cousin Nodes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTCousinNodes {
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
		Node n=new Node(6);
		n.left=new Node(3);
		n.right=new Node(5);
		n.left.left=new Node(7);
		n.left.right=new Node(8);
		n.right.left=new Node(1);
		n.right.right=new Node(3);
		System.out.println(checkCousins(n,3,5));
	}
	/**
	 * Performs checkCousins operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkCousins(Node n, int i, int j) {
		// Check for null/base case
		if(n!=null)
		{
			return level(n,i,0)==level(n,j,0) && !isSiblings(n,i,j);
		}
		return false;
	}
	/**
	 * Checks if siblings.
	 *
	 * @param n the size or count parameter
	 * @param a the a parameter
	 * @param b the b parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isSiblings(Node n, int a, int b) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left!=null && n.right!=null)
			{
				return (n.left.value==a && n.right.value==b)||( n.right.value==a && n.left.value==b) 
						|| isSiblings(n.left, a, b)|| isSiblings(n.right, a, b);
			}
			// Check for null/base case
			else if(n.left!=null)
			{
				// Recursively process left and right subtrees
				return isSiblings(n.left, a, b);
			// Check for null/base case
			}else if(n.right!=null)
			{
				// Recursively process left and right subtrees
				return isSiblings(n.right, a, b);
			}
		}
		return false;
	}
	/**
	 * Performs level operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param level the level parameter
	 * @return the computed integer result
	 */
	private static int level(Node n, int i, int level) {
		// Check for null/base case
		if(n!=null)
		{
			if(n.value==i)
				return level;
			// Check for null/base case
			if(n.left!=null)
			{
				int val=level(n.left,i,level+1);
				if(val!=-1)
					return val;
			}
			// Recursively process left and right subtrees
			return level(n.right,i,level+1);
		}
		return -1;
	}

}


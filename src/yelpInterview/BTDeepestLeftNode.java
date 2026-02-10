package yelpInterview;

/**
 * Implementation of BT Deepest Left Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTDeepestLeftNode {
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
		//n.right.left.right.left=new Node(9);
		n.right.right.right=new Node(8);
		n.right.right.right.right=new Node(10);
		System.out.println(findDeepestLeftNode(n,0,false));
	}
	/**
	 * Finds deepest left node in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param level the level parameter
	 * @param leftFlag the leftFlag parameter
	 * @return the computed integer result
	 */
	private static int findDeepestLeftNode(Node n,int level,boolean leftFlag) {
		// Check for null/base case
		if(n!=null){
			// Recursively process left and right subtrees
			return 1+findDeepestLeftNodeUtil(n, level, leftFlag);
		}		
		return 0;
	}
	/**
	 * Finds deepest left node util in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param b the b parameter
	 * @return the computed integer result
	 */
	private static int findDeepestLeftNodeUtil(Node n, int i, boolean b) {
		// Check for null/base case
		if(n==null)
			return Integer.MIN_VALUE;
		// Check if node is a leaf (no children)
		if(b && n.left==null && n.right==null)
			return i;
		else {
			// Recursively process left and right subtrees
			return Math.max(findDeepestLeftNodeUtil(n.left, i+1, true),findDeepestLeftNodeUtil(n.right, i+1, false));
		}
	}


}


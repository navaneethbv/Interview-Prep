package yelpInterview;

/**
 * Implementation of BT Deepest Odd Level Leaf Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTDeepestOddLevelLeafNode {
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
		n.right.right.right=new Node(8);
		n.right.right.right.right=new Node(10);
		n.right.right.right.right.left=new Node(11);
		n.right.left.right=new Node(7);
		n.right.left.right.left=new Node(9);
		findDeepestLevelNode(n);
	}
	static Node node;
	/**
	 * Finds deepest level node in the data structure.
	 *
	 * @param n the size or count parameter
	 */
	private static void findDeepestLevelNode(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			findDeepestLevelNodeUtil(n,0,true);
		}
		System.out.println(node.value);
	}
	/**
	 * Finds deepest level node util in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param b the b parameter
	 */
	private static void findDeepestLevelNodeUtil(Node n, int i, boolean b) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null && b && i%2==0)
				node=n;
			findDeepestLevelNodeUtil(n.left, i+1, true);
			findDeepestLevelNodeUtil(n.right, i+1, true);	
		}
	}
}


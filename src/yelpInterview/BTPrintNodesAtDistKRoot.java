package yelpInterview;

/**
 * Implementation of BT Print Nodes At Dist K Root algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTPrintNodesAtDistKRoot {
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
		printNodesK(n,2);
	}
	/**
	 * Performs printNodesK operation.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 */
	private static void printNodesK(Node n,int k) {
		// Check for null/base case
		if(n!=null)
		{
			printNodesKUtil(n,k,0);
		}
	}
	/**
	 * Performs printNodesKUtil operation.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 * @param distance the distance parameter
	 */
	private static void printNodesKUtil(Node n, int k, int distance) {
		// Check for null/base case
		if(n!=null)
		{
			if(distance==k)
				System.out.println(n.value);
			printNodesKUtil(n.left, k,distance+1);
			printNodesKUtil(n.right, k,distance+1);
		}
	}

}


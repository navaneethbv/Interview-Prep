package yelpInterview;

/**
 * Implementation of BST Sorted Order Printing algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTSortedOrderPrinting {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node left,right;
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
		Node root=insert(null, 20);
		insert(root, 8);
		insert(root, 22);
		insert(root, 4);
		insert(root, 12);
		insert(root, 10);
		insert(root, 14);
		inOrder(root);

	}

	/**
	 * Performs insert operation.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the Node result
	 */
	private static Node insert(Node n, int value) {
		// Check for null/base case
		if(n==null)
			return new Node(value);
		if(n.value>value)
		{//move left
			n.left=insert(n.left,value);
		}
		else{//move right
			n.right=insert(n.right,value);			
		}
		return n;
	}
	/**
	 * Performs inOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{	
			inOrder(n.left);
			System.out.print(n.value+" ");
			inOrder(n.right);			
		}
	}

}
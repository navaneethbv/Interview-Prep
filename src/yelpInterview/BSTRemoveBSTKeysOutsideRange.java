package yelpInterview;

/**
 * Implementation of BST Remove BST Keys Outside Range algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTRemoveBSTKeysOutsideRange {
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
		Node n=insert(null,6);
		insert(n,-13);
		insert(n,-8);
		insert(n,14);
		insert(n,13);
		insert(n,15);
		insert(n,7);
		inOrderTraversal(n);
		System.out.println();
		removeNodes(n,n,-10,13);
		inOrderTraversal(n);
	}
	/**
	 * Removes nodes from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param n1 the n1 parameter
	 * @param i the i parameter
	 * @param j the j parameter
	 */
	private static void removeNodes(Node n,Node n1, int i, int j) {
		// Check for null/base case
		if(n1!=null)
		{
			removeNodes(n,n1.left, i, j);
			removeNodes(n,n1.right, i, j);
			if(n1.value<i||n1.value>j)
				deleteNode(n,n1.value);
		}
	}
	/**
	 * Performs inOrderTraversal operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrderTraversal(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			inOrderTraversal(n.left);
			System.out.print(n.value+" ");
			inOrderTraversal(n.right);
		}
	}

	/**
	 * Performs deleteNode operation.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the Node result
	 */
	private static Node  deleteNode(Node n, int value) {
		// Check for null/base case
		if(n==null)
			return n;
		if(n.value>value)
			n.left=deleteNode(n.left, value);
		else if(n.value<value)
			n.right=deleteNode(n.right, value);
		else{
			// Check for null/base case
			if(n.left==null)
			{
				return n.right;
			}
			// Check for null/base case
			else if(n.right==null)
			{
				return n.left;
			}
			Node n1=getMinValueNode(n.right);
			n.value=n1.value;
			n.right=deleteNode(n.right, n.value);
		}
		return n;
	}

	/**
	 * Retrieves min value node from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node getMinValueNode(Node n) {
		// Check for null/base case
		if(n==null)
			return n;
		while(n.left!=null)
			n=n.left;
		return n;
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

}
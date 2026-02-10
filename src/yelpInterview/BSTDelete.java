package yelpInterview;

/**
 * Implementation of BST Delete algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTDelete {
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
		Node root=insert(null,10);
		insert(root,20);
		insert(root,30);
		insert(root,40);
		insert(root,50);
		insert(root,5);
		insert(root,7);
		inOrder(root);
		deleteNode(root,40);
		System.out.println();
		inOrder(root);

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
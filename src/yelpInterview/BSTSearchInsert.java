package yelpInterview;

/**
 * Implementation of BST Search Insert algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTSearchInsert {
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
		System.out.println(search(root,20));
		System.out.println(search(root,25));

	}
	/**
	 * Searches for .
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean search(Node n, int value) {
		// Check for null/base case
		if(n==null)
			return false;
		if(n.value==value)
			return true;
		if(n.value>value)
			// Recursively process left and right subtrees
			return search(n.left,value);
		else
			// Recursively process left and right subtrees
			return search(n.right,value);
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
			System.out.println(n.value);
			inOrder(n.right);			
		}
	}





}
package yelpInterview;

/**
 * Implementation of BST Floor And Ceil BST algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTFloorAndCeilBST {
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
		Node n=insert(null,8);
		insert(n,4);
		insert(n,12);
		insert(n,2);
		insert(n,6);
		insert(n,10);
		insert(n,14);
		inOrderTraversal(n);
		System.out.println();
		for (int i = 0; i < 16; i++) {
			System.out.println(i+"/"+findCeil(n,i)+"/"+findFloor(n,i));
		}
	}

	/**
	 * Finds floor in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the computed integer result
	 */
	private static int findFloor(Node n, int value) {
		// Check for null/base case
		if(n!=null)
		{
			if(n.value==value)
				return value;
			if(n.value>value)
				// Recursively process left and right subtrees
				return findFloor(n.left, value);
			int ceil=findFloor(n.right, value);
			return ceil>=n.value?ceil:n.value;
		}
		return -1;
	}

	/**
	 * Finds ceil in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the computed integer result
	 */
	private static int findCeil(Node n, int value) {
		// Check for null/base case
		if(n!=null)
		{
			if(n.value==value)
				return value;
			if(n.value<value)
				// Recursively process left and right subtrees
				return findCeil(n.right, value);
			int ceil=findCeil(n.left, value);
			return ceil>=value?ceil:n.value;
				
		}
		return -1;
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
package yelpInterview;

/**
 * Implementation of BST Add All Greater Elements algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTAddAllGreaterElements {
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
		Node n=insert(null,50);
		insert(n,30);
		insert(n,70);
		insert(n,20);
		insert(n,40);
		insert(n,60);
		insert(n,80);
		inOrderTraversal(n);
		System.out.println();
		sum=(inOrderSum(n));
		inOrderChange(n);
		inOrderTraversal(n);
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
	static int sum;
	/**
	 * Performs inOrderChange operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrderChange(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			inOrderChange(n.left);
			int temp=n.value;
			n.value=sum;
			sum-=temp;
			inOrderChange(n.right);
		}
	}

	/**
	 * Performs inOrderSum operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int inOrderSum(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return n.value+inOrderSum(n.left)+inOrderSum(n.right);
		}
		return 0;
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
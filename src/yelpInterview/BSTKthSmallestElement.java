package yelpInterview;

/**
 * Implementation of BST Kth Smallest Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTKthSmallestElement {
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
		inOrder(root,4);

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
	static int counter=0;
	/**
	 * Performs inOrder operation.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 */
	private static void inOrder(Node n,int k) {
		// Check for null/base case
		if(n!=null)
		{	
			inOrder(n.right,k);
			if(counter==k){
				System.out.print(n.value+" ");
				counter++;
				return;
			}
			counter++;
			inOrder(n.left,k);			
		}
	}







}
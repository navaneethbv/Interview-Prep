package yelpInterview;

/**
 * Implementation of BST Each Node One Leaved algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTEachNodeOneLeaved {
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
		/*Node n=insert(null,20);
		insert(n,10);
		insert(n,11);
		insert(n,13);
		insert(n,12);*/
		Node n=insert(null,8);
		insert(n,3);
		insert(n,5);
		insert(n,7);
		insert(n,6);
		inOrderTraversal(n);
		System.out.println();
		System.out.println(checkNodes(n));
	}

	/**
	 * Performs checkNodes operation.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkNodes(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
				return true;
			// Check if node is a leaf (no children)
			if(n.left==null||n.right==null)
			{
				Node temp=n.left!=null?n.left:n.right;
				// Recursively process left and right subtrees
				return checkNodes(temp);
			}
			else{
				return false;
			}
		}
		return true;
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
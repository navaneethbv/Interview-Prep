package yelpInterview;

/**
 * Implementation of BSTLCA algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTLCA {
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
		System.out.println();
		System.out.println(findLCA(root,10,14).value);
		System.out.println(findLCA(root,8,14).value);
		System.out.println(findLCA(root,10,22).value);
	}

	/**
	 * Finds lca in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param num1 the num1 parameter
	 * @param num2 the num2 parameter
	 * @return the Node result
	 */
	private static Node findLCA(Node n,int num1, int num2) {
		// Check for null/base case
		if(n==null)
			return n;
		if(n.value>num1 && n.value>num2)
		{
			// Recursively process left and right subtrees
			return findLCA(n.left, num1, num2);
		}
		else if(n.value<num1 && n.value<num2)
		{
			// Recursively process left and right subtrees
			return findLCA(n.right, num1, num2);
		}
		return n;
	}

	/**
	 * Finds min value node in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node findMinValueNode(Node n) {
		// Check for null/base case
		if(n==null)
			return null;
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
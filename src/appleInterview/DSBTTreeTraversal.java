package appleInterview;

/**
 * Implementation of DSBT Tree Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTTreeTraversal {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node left,right;
		int value;
		public Node(int value){
			this.value=value;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		preOrder(n);
		System.out.println();
		postOrder(n);
		System.out.println();
		inOrder(n);
		System.out.println();
	}
	/**
	 * Performs postOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void postOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.value+"->");
		}
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void preOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			System.out.print(n.value+"->");
			preOrder(n.left);
			preOrder(n.right);
		}
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
			System.out.print(n.value+"->");
			inOrder(n.right);
		}
	}

}

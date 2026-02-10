package appleInterview;

/**
 * Implementation of DSBT Double Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTDoubleTree {
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
	static Node oldLeft=null;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node root=new Node(2);
		root.left=new Node(1);
		root.right=new Node(3);
		doubleTree(root);
		inorder(root);
		System.out.println();
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		doubleTree(root);
		inorder(root);
	}

	/**
	 * Performs doubleTree operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void doubleTree(Node tn) {
		// Check for null/base case
		if(tn!=null)
		{
			doubleTree(tn.left);
			doubleTree(tn.right);
			oldLeft=tn.left;
			tn.left=new Node(tn.value);
			tn.left.left=oldLeft;
		}

	}
	/**
	 * Performs inorder operation.
	 *
	 * @param root the tree node to process
	 */
	private static void inorder(Node root) {
		// Check for null/base case
		if(root!=null)
		{
			System.out.print(root.value+"/");
			inorder(root.left);
			inorder(root.right);
		}
	}


}


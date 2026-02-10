package appleInterview;

/**
 * Implementation of DSBT Foldable Binary Trees algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTFoldableBinaryTrees {
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
		Node root = new Node(1);
		root.left        = new Node(2);
		root.right       = new Node(3);
		root.right.left  = new Node(4);
		root.left.right = new Node(5);
		System.out.println(checkFoldable(root));
	}
	/**
	 * Performs checkFoldable operation.
	 *
	 * @param root the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkFoldable(Node root) {
		// Check for null/base case
		if(root!=null){
			mirror(root.left);
			boolean res=isStructureSame(root.left,root.right);
			mirror(root.left);
			return res;
		}
		return true;
	}
	/**
	 * Checks if structure same.
	 *
	 * @param left the left parameter
	 * @param right the right parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isStructureSame(Node left, Node right) {
		// Check if node is a leaf (no children)
		if(left!=null && right!=null)
		{
			// Recursively process left and right subtrees
			return isStructureSame(left.left, right.left) && isStructureSame(left.right, right.right);
		}
		// Check if node is a leaf (no children)
		else if(left!=null || right!=null)
			return false;
		return true;
	}
	/**
	 * Performs mirror operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void mirror(Node tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			mirror(tn.left);
			mirror(tn.right);
			Node temp=tn.left;
			tn.left=tn.right;
			tn.right=temp;
		}

	}

}


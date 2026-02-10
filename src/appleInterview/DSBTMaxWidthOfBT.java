package appleInterview;

/**
 * Implementation of DSBT Max Width Of BT algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTMaxWidthOfBT {
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
		root.left.left  = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(8);    
		root.right.right.left  = new Node(6);    
		root.right.right.right  = new Node(7);
		System.out.println(maxWidth(root));
	}
	/**
	 * Performs maxWidth operation.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private static int maxWidth(Node root) {
		int height=getHeight(root);
		int width=0;
		for (int i = 0; i < height; i++) {
			width=Math.max(width, getWidth(root,i));
		}
		return width;
	}
	/**
	 * Retrieves width from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 * @return the computed integer result
	 */
	private static int getWidth(Node tn, int level) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check for null/base case
			if(level==0)
				return 1;
			// Recursively process left and right subtrees
			return getWidth(tn.left, level-1)+getWidth(tn.right, level-1);
		}
		return 0;
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(Node root) {
		// Recursively process left and right subtrees
		return root==null?0:1+Math.max(getHeight(root.left), getHeight(root.right));
	}



}


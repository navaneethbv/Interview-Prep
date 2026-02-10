package appleInterview;

/**
 * Implementation of DSBT Get Level Of Binary Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTGetLevelOfBinaryNode {
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
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		System.out.println(getLevel(root,1));
		System.out.println(getLevel(root,2));
		System.out.println(getLevel(root,3));
		System.out.println(getLevel(root,4));
		System.out.println(getLevel(root,5));
	}
	/**
	 * Retrieves level from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int getLevel(Node n,int i) {
		int height=getHeight(n);
		// Inner loop to check combinations
		for (int j = 0; j < height; j++) {
			if(printLevel(n,j,i))
				return j+1;
		}
		return -1;
	}
	/**
	 * Performs printLevel operation.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 * @param nodevalue the nodevalue parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean printLevel(Node tn, int level, int nodevalue) {
		// Check for null/base case
		if(tn!=null){
			if(level==0 && tn.value==nodevalue)
				return true;
			else
				// Recursively process left and right subtrees
				return printLevel(tn.left, level-1, nodevalue)||printLevel(tn.right, level-1, nodevalue);
		}
		return false;
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getHeight(Node n) {
		// Recursively process left and right subtrees
		return n==null?0:1+Math.max(getHeight(n.left), getHeight(n.right));
	}



}


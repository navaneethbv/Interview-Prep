package appleInterview;

/**
 * Implementation of DSBT Level Order Traversal Spiral algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTLevelOrderTraversalSpiral {
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
		levelSpiral(n);
	}
	/**
	 * Performs levelSpiral operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void levelSpiral(Node n) {
		int height=getHeight(n);
		for (int i = 0; i < height; i++) {
			printOrder(n,i,i%2==0);
		}
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getHeight(Node n) {
		// Check for null/base case
		if(n!=null)
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(n.left),getHeight(n.right));
		return 0;
	}
	/**
	 * Performs printOrder operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param b the b parameter
	 */
	private static void printOrder(Node n, int i, boolean b) {
		// Check for null/base case
		if(n!=null)
		{
			// Check for null/base case
			if(i==0)
				System.out.print(n.value+" ");
			else
				if(b)
				{
					printOrder(n.left, i-1, b);
					printOrder(n.right, i-1, b);
				}
				else{
					printOrder(n.right, i-1, b);
					printOrder(n.left, i-1, b);
				}
		}
	}
}


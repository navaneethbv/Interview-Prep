package appleInterview;

/**
 * Implementation of DSBT Nodes At K Dist algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTNodesAtKDist {
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
		root.right.left = new Node(8);  
		printNodesAt(root,2);
	}
	/**
	 * Performs printNodesAt operation.
	 *
	 * @param root the tree node to process
	 * @param i the i parameter
	 */
	private static void printNodesAt(Node root, int i) {
		// Check for null/base case
		if(root!=null)
		{
			// Check for null/base case
			if(i==0)
				System.out.println(root.value);
			else{
				printNodesAt(root.left, i-1);
				printNodesAt(root.right, i-1);
			}
		}

	}



}


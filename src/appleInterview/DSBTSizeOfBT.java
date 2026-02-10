package appleInterview;

/**
 * Implementation of DSBT Size Of BT algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTSizeOfBT {
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
		System.out.println(sizeOfTree(n));
	}
	/**
	 * Performs sizeOfTree operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int sizeOfTree(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return 1+sizeOfTree(n.left)+sizeOfTree(n.right);
		}
		else
			return 0;
	}
}


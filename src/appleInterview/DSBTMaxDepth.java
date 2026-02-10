package appleInterview;

/**
 * Implementation of DSBT Max Depth algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTMaxDepth {
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
		System.out.println(getMaxDepth(n));
	}
	/**
	 * Retrieves max depth from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getMaxDepth(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			int leftHeight=0,rightHeight=0;
			// Check for null/base case
			if(n.left!=null)
				leftHeight=getMaxDepth(n.left);
			// Check for null/base case
			if(n.right!=null)
				rightHeight=getMaxDepth(n.right);
			return Math.max(leftHeight, rightHeight)+1;
		}
		return 0;
	}

}


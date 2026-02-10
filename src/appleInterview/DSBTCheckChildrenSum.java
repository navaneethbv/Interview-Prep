package appleInterview;

/**
 * Implementation of DSBT Check Children Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTCheckChildrenSum {
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
		Node n=new Node(10);
		n.left=new Node(8);
		n.right=new Node(2);
		n.left.left=new Node(3);
		n.left.right=new Node(5);
		n.right.left=new Node(2);
		System.out.println(checkSumProperty(n));
	}
	/**
	 * Performs checkSumProperty operation.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkSumProperty(Node n) {
		// Check for null/base case
		if(n!=null)
		{	
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
				return true;
			int leftVal=0,rightVal=0;
			// Check for null/base case
			if(n.left!=null)
				leftVal=n.left.value;
			// Check for null/base case
			if(n.right!=null)
				rightVal=n.right.value;
			// Recursively process left and right subtrees
			return n.value==(leftVal+rightVal) && checkSumProperty(n.left) && checkSumProperty(n.right);
		}
		return true;
	}

}


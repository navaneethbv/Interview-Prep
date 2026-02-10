package appleInterview;

/**
 * Implementation of DSBT Height Balance Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTHeightBalanceCheck {
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
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		//root.left.left.left = new Node(8);
		System.out.println(checkBalance(root));
	}
	/**
	 * Performs checkBalance operation.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkBalance(Node tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return checkBalance(tn.left) && checkBalance(tn.right) && (Math.abs(getHeight(tn.left)-getHeight(tn.right))<=1);
		}
		return true;
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(Node tn) {
		// Check for null/base case
		if(tn!=null)
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
		return 0;
	}

}


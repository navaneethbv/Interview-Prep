package appleInterview;

/**
 * Implementation of DSBT Diameter Of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTDiameterOfBinaryTree {
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
		Node n=new Node(50);
		n.left=new Node(7);
		n.right=new Node(2);
		n.left.left=new Node(3);
		n.left.right=new Node(5);
		n.right.left=new Node(1);
		n.right.right=new Node(30);
		System.out.println(findDiameter(n));
	}
	/**
	 * Finds diameter in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findDiameter(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			int leftDiameter=findDiameter(n.left);
			int rightDiameter=findDiameter(n.right);
			int leftHeight=getHeight(n.left);
			int rightHeight=getHeight(n.left);
			return Math.max(leftHeight+rightHeight+1,Math.max(leftDiameter, rightDiameter));	
		}
		return 0;
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
		{
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
		}
		return 0;
	}

}


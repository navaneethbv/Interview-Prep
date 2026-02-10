package yelpInterview;

/**
 * Implementation of BT Foldable BT algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTFoldableBT {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node left,right;
		int value;
		public Node(int value) {
			this.value=value;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		Node n=new Node(10);
		n.left=new Node(7);
		n.right=new Node(15);
		n.left.right=new Node(9);
		//n.right.left=new Node(11);
		n.right.right=new Node(11);
		System.out.println(isFoldable(n));
	}
	/**
	 * Checks if foldable.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isFoldable(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			mirror(n.left);
			boolean res=isStructureSam(n.left,n.right);
			mirror(n.left);
			return res;
		}
		return true;
	}
	/**
	 * Checks if structure sam.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isStructureSam(Node n1, Node n2) {
		// Check for null/base case
		if(n1==null && n2==null)
			return true;
		// Check if node is a leaf (no children)
		if((n1!=null && n2!=null) && isStructureSam(n1.left, n2.left) && isStructureSam(n1.right, n2.right))
			return true;
		return false;
	}
	/**
	 * Performs mirror operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void mirror(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			mirror(n.left);
			mirror(n.right);
			Node temp=n.left;
			n.left=n.right;
			n.right=temp;
		}

	}
}


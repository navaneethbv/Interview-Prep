package yelpInterview;

/**
 * Implementation of BT Child Sum Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTChildSumCheck {
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
		n.left=new Node(8);
		n.right=new Node(2);
		n.left.left=new Node(3);
		n.left.right=new Node(5);
		n.right.left=new Node(2);
		System.out.println(checkChildSum(n));System.out.println();
	}
	/**
	 * Performs checkChildSum operation.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkChildSum(Node n) {
		// Check for null/base case
		if(n!=null){
			if(n.left==null && n.right==null)
				return true;
			int leftVal=n.left!=null?n.left.value:0;
			int rightVal=n.right!=null?n.right.value:0;
			// Recursively process left and right subtrees
			return n.value==leftVal+rightVal && checkChildSum(n.left) && checkChildSum(n.right);
		}
		return true;
	}

}


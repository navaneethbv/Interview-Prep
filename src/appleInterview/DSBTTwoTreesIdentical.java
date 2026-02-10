package appleInterview;

/**
 * Implementation of DSBT Two Trees Identical algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTTwoTreesIdentical {
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
		System.out.println(isIdentical(n,n));
		n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		Node n1=new Node(1);
		n1.left=new Node(2);
		n1.right=new Node(3);
		n1.left.left=new Node(4);
		n1.left.right=new Node(51);
		System.out.println(isIdentical(n, n1));
	}
	/**
	 * Checks if identical.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isIdentical(Node n1,Node n2){
		// Check for null/base case
		if(n1!=null && n2!=null)
		{
			// Recursively process left and right subtrees
			return isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right) && n1.value==n2.value;
		}
		// Check for null/base case
		else if(n1!=null || n2!=null){
			return false;
		}
		return true;
	}
}


package yelpInterview;

/**
 * Implementation of B Tfind LCA algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTfindLCA {
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
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7);
		n.right.left.right=new Node(8);
		System.out.println(findLCA(n,4,5).value);
	}
	/**
	 * Finds lca in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the Node result
	 */
	private static Node findLCA(Node n, int i, int j) {
		// Check for null/base case
		if(n!=null){
			if(n.value==i||n.value==j)
				return n;
			Node left=findLCA(n.left, i, j);
			Node right=findLCA(n.right, i, j);
			// Check if node is a leaf (no children)
			if(left!=null && right!=null)
				return n;
			return left != null? left: right;
		}
		return n;
	}

}


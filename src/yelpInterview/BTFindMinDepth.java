package yelpInterview;

/**
 * Implementation of BT Find Min Depth algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTFindMinDepth {
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
		System.out.println(findMinDepth(n,1));
	}
	/**
	 * Finds min depth in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param level the level parameter
	 * @return the computed integer result
	 */
	private static int findMinDepth(Node n,int level) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
				return level;
			// Recursively process left and right subtrees
			return Math.min(findMinDepth(n.left, level+1), findMinDepth(n.right, level+1));
		}
		return Integer.MAX_VALUE;
	}


}


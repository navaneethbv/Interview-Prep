package appleInterview;

/**
 * Implementation of DSBT Leaf Nodes Count Bin Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTLeafNodesCountBinTree {
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
		System.out.println(countLeafNodes(n));
	}
	/**
	 * Counts the number of leaf nodes.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int countLeafNodes(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
			{
				return 1;
			}
			else
				// Recursively process left and right subtrees
				return countLeafNodes(n.left)+countLeafNodes(n.right);
		}
		return 0;
	}

}


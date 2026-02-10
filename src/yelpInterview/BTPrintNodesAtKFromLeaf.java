package yelpInterview;

/**
 * Implementation of BT Print Nodes At K From Leaf algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTPrintNodesAtKFromLeaf {
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
		Node n=new Node(50);
		n.left=new Node(7);
		n.right=new Node(2);
		n.left.left=new Node(3);
		n.left.right=new Node(5);
		n.right.left=new Node(1);
		n.right.right=new Node(30);
		printNodesKDist(n,path,0,0);
		System.out.println();
	}
	/**
	 * Performs printNodesKDist operation.
	 *
	 * @param n the size or count parameter
	 * @param path the array to process
	 * @param i the i parameter
	 * @param k the k value
	 */
	private static  void printNodesKDist(Node n, int[] path, int i, int k) {
		// Check for null/base case
		if(n!=null)
		{
			path[i]=n.value;
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
			{
				if(i-k>=0)
					System.out.println(path[i-k]);
			}
			printNodesKDist(n.left, path, i+1, k);
			printNodesKDist(n.right, path, i+1, k);
		}
	}
	static int[] path=new int[100];


}


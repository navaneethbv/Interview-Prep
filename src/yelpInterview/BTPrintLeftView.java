package yelpInterview;

/**
 * Implementation of BT Print Left View algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTPrintLeftView {
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
		Node n=new Node(12);
		n.left=new Node(10);
		n.right=new Node(30);
		n.right.left=new Node(25);
		n.right.right=new Node(40);
		printLeftView(n);
	}
	static boolean printed=false;
	/**
	 * Performs printLeftView operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void printLeftView(Node n) {
		for (int i = 0; i < getHeight(n); i++) {
			printed=false;
			printNode(n,i);
		}
	}
	/**
	 * Performs printNode operation.
	 *
	 * @param n the size or count parameter
	 * @param level the level parameter
	 */
	private static void printNode(Node n, int level) {
		// Check for null/base case
		if(n!=null)
		{
			// Check for null/base case
			if(level==0 && !printed){
				System.out.println(n.value);
				printed=true;
			}
			printNode(n.left, level-1);
			printNode(n.right, level-1);
		}

	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getHeight(Node n) {
		// Recursively process left and right subtrees
		return n!=null?1+Math.max(getHeight(n.left), getHeight(n.right)):0;
	}

}


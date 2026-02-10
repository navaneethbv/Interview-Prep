package yelpInterview;

/**
 * Implementation of BT Print Nodes Between Levels algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTPrintNodesBetweenLevels {
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
		Node n=new Node(20);
		n.left=new Node(8);
		n.right=new Node(22);
		n.left.left=new Node(4);
		n.left.right=new Node(12);
		n.left.right.left=new Node(10);
		n.left.right.right=new Node(14);
		findNodes(n,2,4);
	}
	/**
	 * Finds nodes in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param lowLevel the lowLevel parameter
	 * @param highLevel the highLevel parameter
	 */
	private static void findNodes(Node n, int lowLevel, int highLevel) {
		for (int i = lowLevel; i <=highLevel; i++) {
			printNodes(n,i);
		}

	}
	/**
	 * Performs printNodes operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 */
	private static void printNodes(Node n, int i) {
		// Check for null/base case
		if(n!=null)
		{
			if(i==1)
				System.out.println(n.value);
			else if(i>1)
			{
				printNodes(n.left, i-1);
				printNodes(n.right, i-1);
			}
		}
	}

}


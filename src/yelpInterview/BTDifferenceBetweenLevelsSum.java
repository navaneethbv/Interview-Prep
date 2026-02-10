package yelpInterview;

/**
 * Implementation of BT Difference Between Levels Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTDifferenceBetweenLevelsSum {
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
		Node n=new Node(5);
		n.left=new Node(2);
		n.right=new Node(6);
		n.left.left=new Node(1);
		n.left.right=new Node(4);
		n.right.right=new Node(8);
		n.left.right.left=new Node(3);
		n.right.right.left=new Node(7);
		n.right.right.right=new Node(9);
		System.out.println(findDifference(n));
	}
	/**
	 * Finds difference in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findDifference(Node n) {
		int sum=0;
		for (int i = 0; i < getHeight(n); i++) {
			sum+=i%2==0?getSum(n,i):-1*getSum(n,i);
		}
		return sum;
	}
	/**
	 * Retrieves sum from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int getSum(Node n, int i) {
		// Check for null/base case
		if(n!=null)
		{
			// Check for null/base case
			if(i==0)
				return n.value;
			else
				// Recursively process left and right subtrees
				return getSum(n.left, i-1)+getSum(n.right, i-1);
		}
		return 0;
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


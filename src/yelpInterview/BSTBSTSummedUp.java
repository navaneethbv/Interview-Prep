package yelpInterview;

/**
 * Implementation of BSTBST Summed Up algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTBSTSummedUp {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node left,right;
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
		Node n=insert(null,5);
		insert(n,2);
		insert(n,13);
		inOrderTraversal(n);
		System.out.println();
		getSum(n);
		changeNodes(n);
		inOrderTraversal(n);
	}



	static int sum=0;
	/**
	 * Performs changeNodes operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void changeNodes(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			changeNodes(n.left);
			int temp=n.value;
			n.value=sum;
			sum-=temp;
			changeNodes(n.right);
		}
	}
	/**
	 * Retrieves sum from the data structure.
	 *
	 * @param n the size or count parameter
	 */
	private static void getSum(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			getSum(n.left);
			sum+=n.value;
			getSum(n.right);
		}
	}



	/**
	 * Performs inOrderTraversal operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrderTraversal(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			inOrderTraversal(n.left);
			System.out.print(n.value+" ");
			inOrderTraversal(n.right);
		}
	}

	/**
	 * Performs insert operation.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the Node result
	 */
	private static Node insert(Node n, int value) {
		// Check for null/base case
		if(n==null)
			return new Node(value);
		if(n.value>value)
		{//move left
			n.left=insert(n.left,value);
		}
		else{//move right
			n.right=insert(n.right,value);			
		}
		return n;
	}

}
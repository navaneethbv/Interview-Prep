package yelpInterview;

/**
 * Implementation of BST Second Largest Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTSecondLargestElement{
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
		Node n=insert(null,10);
		insert(n,5);
		insert(n,20);
		insert(n,30);
		inOrderTraversal(n);
		System.out.println();
		findSecondLargestElement(n);
	}









	static int c=0;
	/**
	 * Finds second largest element in the data structure.
	 *
	 * @param n the size or count parameter
	 */
	private static void findSecondLargestElement(Node n) {
		// Check for null/base case
		if(n!=null){
			findSecondLargestElement(n.left);
			if(c==2)
				System.out.println(n.value);
			c++;
			findSecondLargestElement(n.right);
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
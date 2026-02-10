package yelpInterview;

/**
 * Implementation of Search Elementin LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchElementinLL {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node next;
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
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		System.out.println(searchIterative(n,6));
		System.out.println(searchRecursive(n,6));
	}

	/**
	 * Searches for iterative.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean searchIterative(Node n,int value) {
		while(n!=null){
			if(n.value==value)
				return true;
			n=n.next;
		}
		return false;
	}

	/**
	 * Searches for recursive.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean searchRecursive(Node n,int value) {
		// Check for null/base case
		if(n==null)
			return false;
		if(n.value==value)
			return true;
		// Recursively process left and right subtrees
		return searchRecursive(n.next,value);
	}

}


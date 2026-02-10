package yelpInterview;

/**
 * Implementation of Length Of LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LengthOfLL {
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
		System.out.println(findIterativeLength(n));
		System.out.println(findRecursiveLength(n));
	}

	/**
	 * Finds iterative length in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findIterativeLength(Node n) {
		int count=0;
		while(n!=null){
			count++;
			n=n.next;
		}
		return count;
	}

	/**
	 * Finds recursive length in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findRecursiveLength(Node n) {
		// Check for null/base case
		if(n==null)
			return 0;
		// Recursively process left and right subtrees
		return 1+findRecursiveLength(n.next);
	}


}







package yelpInterview;

/**
 * Implementation of Print Reverse LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintReverseLL {
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
		Node n=new Node(0);
		n.next=new Node(1);
		n.next.next=new Node(0);
		n.next.next.next=new Node(2);
		n.next.next.next.next=new Node(1);
		n.next.next.next.next.next=new Node(1);
		n.next.next.next.next.next.next=new Node(2);
		n.next.next.next.next.next.next.next=new Node(1);
		n.next.next.next.next.next.next.next.next=new Node(2);
		recursivePrint(n);
		System.out.println();
		print(n);
	}

	/**
	 * Performs recursivePrint operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void recursivePrint(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			recursivePrint(n.next);
			System.out.print(n.value+"/");
		}

	}

	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null)
		{
			System.out.print(n.value+"/");
			n=n.next;
		}
	}

}


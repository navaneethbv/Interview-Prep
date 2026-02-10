package yelpInterview;

/**
 * Implementation of Find Middle Of LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindMiddleOfLL {
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
		n.next.next.next.next.next=new Node(6);
		System.out.println(getMiddle(n).value);
	}

	/**
	 * Retrieves middle from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node getMiddle(Node n) {
		Node fastPointer=n;
		Node slowPointer=n;
		while(fastPointer!=null){
			slowPointer=slowPointer.next;
			fastPointer=fastPointer.next;
			// Check for null/base case
			if(fastPointer!=null)
				fastPointer=fastPointer.next;
		}
		return slowPointer;
	}



}







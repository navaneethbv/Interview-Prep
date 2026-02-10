package yelpInterview;

/**
 * Implementation of Delete LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DeleteLL {
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
		deleteLL(n);
	}

	/**
	 * Performs deleteLL operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void deleteLL(Node n) {
		while(n!=null){
			Node temp=n.next;
			n=null;
			n=temp;
		}
	}

}


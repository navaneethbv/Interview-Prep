package yelpInterview;

/**
 * Implementation of Nth Node From End algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NthNodeFromEnd {
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
		System.out.println(getNthNodeFromEnd(n,4).value);
	}

	/**
	 * Retrieves nth node from end from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return the Node result
	 */
	private static Node getNthNodeFromEnd(Node n,int i) {
		Node fastPointer=n;
		int counter=0;
		while(counter!=i){
			fastPointer=fastPointer.next;
			counter++;
		}
		Node slowPointer=n;
		while(fastPointer!=null){
			slowPointer=slowPointer.next;
			fastPointer=fastPointer.next;
		}
		return slowPointer;
	}

}


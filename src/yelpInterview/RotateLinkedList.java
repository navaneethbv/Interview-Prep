package yelpInterview;

/**
 * Implementation of Rotate Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RotateLinkedList {
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
		Node n=new Node(10);
		n.next=new Node(20);
		n.next.next=new Node(30);
		n.next.next.next=new Node(40);
		n.next.next.next.next=new Node(50);
		n.next.next.next.next.next=new Node(60);
		print(n);
		n=rotate(n,4);
		print(n);
	}

	/**
	 * Rotates the .
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return the Node result
	 */
	private static Node rotate(Node n, int i) {
		// Inner loop to check combinations
		for (int j = 0; j <=i; j++) {
			n=rotateMethod(n);
		}
		return n;
	}

	/**
	 * Rotates the method.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node rotateMethod(Node n) {
		Node currentHead=n;
		while(n.next!=null && n.next.next!=null)
		{
			n=n.next;
		}
		Node futureHead=n.next;
		n.next=null;
		futureHead.next=currentHead;
		return futureHead;
	}

	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null){
			System.out.print(n.value+"/");n=n.next;
		}
		System.out.println();
	}

}


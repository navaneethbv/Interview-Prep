package appleInterview;

/**
 * Implementation of DSLL Rotate LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSLLRotateLL {
	static Node head;
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node next;
		int value;
		public Node(int value){
			this.value=value;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		print(head);
		head=rotateLL(head,2);
		print(head);
	}


	/**
	 * Rotates the ll.
	 *
	 * @param head2 the head2 parameter
	 * @param i the i parameter
	 * @return the Node result
	 */
	private static Node rotateLL(Node head2, int i) {
		Node mainHead=head2;
		int length=findLength(head2);
		// Inner loop to check combinations
		for (int j = 0; j < i; j++) {
			Node pointer=mainHead;
			Node tempPointer=pointer;
			for (int k = 0; k < length-2; k++) {
				pointer=pointer.next;
			}
			mainHead=pointer.next;
			mainHead.next=tempPointer;
			pointer.next=null;
		}
		return mainHead;
	}


	/**
	 * Finds length in the data structure.
	 *
	 * @param head2 the head2 parameter
	 * @return the computed integer result
	 */
	private static int findLength(Node head2) {
		int length=0;
		while(head2!=null){
			length++;
			head2=head2.next;
		}
		return length;
	}


	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null){
			System.out.print(n.value+"/");
			n=n.next;
		}
		System.out.println();
	}

}

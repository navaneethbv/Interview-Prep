package appleInterview;

/**
 * Implementation of DSLL Detect Loops LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSLLDetectLoopsLL {
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
		Node head = new Node(50);
		head.next = new Node(20);
		head.next.next = new Node(15);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = head.next.next;
		//System.out.println(startPointLoop(head));
		removeLoop(head);
		print(head);
	}

	/**
	 * Removes loop from the data structure.
	 *
	 * @param head2 the head2 parameter
	 * @return the Node result
	 */
	private static Node removeLoop(Node head2) {
		Node n=startPointLoop(head2);
		System.out.println(n.value);
		Node pointer=n;
		while(pointer.next!=n)
		{
			pointer=pointer.next;
		}
		pointer.next=null;
		return n;
	}

	/**
	 * Performs startPointLoop operation.
	 *
	 * @param head the head parameter
	 * @return the Node result
	 */
	public static Node startPointLoop(Node head){
		if(!detectLoop(head))
			return null;
		Node fastPointer=head;
		Node slowPointer=head;
		while(fastPointer!=null && slowPointer!=null){
			fastPointer=fastPointer.next;
			// Check for null/base case
			if(fastPointer!=null)
				fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
			if(fastPointer==slowPointer)
				break;
		}
		slowPointer=head;
		while(fastPointer!=slowPointer)
		{
			fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;

		}
		return slowPointer;
	}


	/**
	 * Performs detectLoop operation.
	 *
	 * @param head the head parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean detectLoop(Node head) {
		Node fastPointer=head;
		Node slowPointer=head;
		while(fastPointer!=null && slowPointer!=null){
			fastPointer=fastPointer.next;
			// Check for null/base case
			if(fastPointer!=null)
				fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
			if(fastPointer==slowPointer)
				return true;
		}
		return false;
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

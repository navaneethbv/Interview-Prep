package appleInterview;

/**
 * Implementation of Prep Doc Find Circular Loop LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocFindCircularLoopLL {
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
		//head.next.next.next.next.next = head.next.next;
		System.out.println(hasLoop(head));
	}
	/**
	 * Checks if loop.
	 *
	 * @param head the head parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean hasLoop(Node head) {
		Node fastPointer=head;
		Node slowPointer=head;
		while(fastPointer!=null){
			fastPointer=fastPointer.next;
			// Check for null/base case
			if(fastPointer==null)
				break;
			fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
			if(fastPointer==slowPointer)
				break;
		}
		return fastPointer!=null;
	}
}

package yelpInterview;

/**
 * Implementation of Detect Loop LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DetectLoopLL {
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
		n.next.next=new Node(1);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(1);
		n.next.next.next.next.next=new Node(6);
		n.next.next.next.next = n;
		System.out.println(detectLoop(n));
	}

	/**
	 * Performs detectLoop operation.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean detectLoop(Node n) {
		Node fastPointer=n;
		Node slowPointer=n;
		while(fastPointer!=null)
		{
			fastPointer=fastPointer.next;
			// Check for null/base case
			if(fastPointer==null)
				return false;
			fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
			if(fastPointer==slowPointer)
				return true;
		}
		return false;
	}

}


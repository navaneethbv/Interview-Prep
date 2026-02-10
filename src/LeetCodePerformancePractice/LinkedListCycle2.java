package LeetCodePerformancePractice;

/**
 * Implementation of Linked List Cycle2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LinkedListCycle2 {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode ln=new ListNode(3);
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(0);
		ln.next.next.next=new ListNode(-4);
		ln.next.next.next.next=ln.next;
		System.out.println(detectCycle(ln));

	}
	/**
	 * Performs detectCycle operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public static ListNode detectCycle(ListNode head) {
		ListNode fastPointer=head;
		ListNode slowPointer=head;
		while(fastPointer!=null && fastPointer.next!=null)
		{
			fastPointer=fastPointer.next.next;
			slowPointer=slowPointer.next;
			if(fastPointer==slowPointer)
			{
				break;
			}
		}

		// Check for null/base case
		if(fastPointer==null || fastPointer.next==null)
			return null;
		slowPointer=head;
		while(fastPointer!=slowPointer){
			slowPointer=slowPointer.next;
			fastPointer=fastPointer.next;
		}
		return fastPointer;
	}
}

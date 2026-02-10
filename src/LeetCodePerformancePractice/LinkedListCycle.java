package LeetCodePerformancePractice;

/**
 * Implementation of Linked List Cycle algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LinkedListCycle {
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
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Checks if cycle.
	 *
	 * @param head the head parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean hasCycle(ListNode head) {
		ListNode fastPointer=head;
		ListNode slowPointer=head;
		// Check for null/base case
		if(head!=null &&head.next!=null)
		{
			slowPointer=head;
			fastPointer=head.next.next;
			while(fastPointer!=null)
			{
				if(slowPointer==fastPointer)
					return true;
				fastPointer=fastPointer.next;
				// Check for null/base case
				if(fastPointer==null)
					return false;
				fastPointer=fastPointer.next;
				slowPointer=slowPointer.next;
			}
		}
		return false;
	}
}

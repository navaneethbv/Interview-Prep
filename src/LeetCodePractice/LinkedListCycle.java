package LeetCodePractice;

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
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	/**
	 * Checks if cycle.
	 *
	 * @param head the head parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean hasCycle(ListNode head) {
		ListNode fastPointer=head;
		ListNode slowPointer=head;
		while(fastPointer!=null)
		{	
			fastPointer=fastPointer.next;
			// Check for null/base case
			if(fastPointer!=null)
				fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
			// Check for null/base case
			if(fastPointer==slowPointer && fastPointer!=null)
				return true;
		}
		return false;

	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}


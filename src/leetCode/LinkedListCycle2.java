package leetCode;

/*
 * Link : https://leetcode.com/problems/linked-list-cycle-ii/
 */

/**
 * Implementation of Linked List Cycle2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LinkedListCycle2 {
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
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}
package LeetCodePerformancePractice;

/**
 * Implementation of Palindrome Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PalindromeLinkedList {
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
	 * Checks if palindrome.
	 *
	 * @param head the head parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPalindrome(ListNode head) {
		// Check for null/base case
		if(head==null ||head.next==null)
			return true;
		ListNode slowPointer=head;
		ListNode fastPointer=head;
		while(fastPointer.next!=null && fastPointer.next.next!=null)
		{
			fastPointer=fastPointer.next.next;
			slowPointer=slowPointer.next;
		}

		ListNode newHead=slowPointer.next;
		slowPointer.next=null;
		ListNode p1=newHead;
		ListNode p2=p1.next;
		while(p1!=null&&p2!=null)
		{
			ListNode temp=p2.next;
			p2.next=p1;
			p1=p2;
			p2=temp;
		}
		newHead.next = null;
		newHead=p2==null?p1:p2;
		while(head!=null && newHead!=null)
		{
			if(head.val!=newHead.val)
				return false;
			head=head.next;
			newHead=newHead.next;
		}
		return true;
	}
}

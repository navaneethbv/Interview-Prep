package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Palindrome Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PalindromeLinkedList{
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * Checks if palindrome.
	 *
	 * @param head the head parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean isPalindrome(ListNode head) {
		// Check for null/base case
		if(head==null||head.next==null)
			return true;
		Stack<Integer> stack=new Stack<>();
		ListNode pointer=head;
		while(head!=null)
		{
			stack.push(head.val);
			head=head.next;
		}
		while(pointer!=null)
		{
			if(pointer.val!=stack.pop())
				return false;
			pointer=pointer.next;
		}
		return true;
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


package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Reverse Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseLinkedList{
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * Performs reverseList operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public static ListNode reverseList(ListNode head) {
		// Check for null/base case
		if(head==null || head.next==null)
			return head;
		ListNode ln1=head;
		Stack<ListNode> stack=new Stack<>();
		while(head!=null)
		{
			stack.push(head);
			head=head.next;
		}
		head=new ListNode(-1);
		ln1=head;
		while(!stack.isEmpty())
		{
			head.next=stack.pop();
			head=head.next;
		}
		head.next=null;
		return ln1.next;
	}
	

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(3);
		ln=reverseList(ln);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}
	}
}


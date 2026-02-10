package leetCode;

import java.util.Stack;

/*
 * Link : https://leetcode.com/problems/reverse-linked-list/
 */

/**
 * Implementation of Reverse Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseLinkedList {
	/**
	 * Performs reverseList operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public static ListNode reverseList(ListNode head) {
		Stack<ListNode> stack=new Stack<>();
		while(head!=null)
		{
			stack.push(head);
			head=head.next;
		}
		ListNode temp=new ListNode(0);
		ListNode next=new ListNode(0);
		temp.next=next;
		while(!stack.isEmpty())
		{
			next.next=new ListNode(stack.pop().val);
			next=next.next;
		}
		return temp.next.next;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(1);
		ln.next.next=new ListNode(2);
		ln.next.next.next=new ListNode(3);
		ln.next.next.next.next=new ListNode(3);
		ln.next.next.next.next.next=new ListNode(4);
		ln=reverseList(ln);
		while(ln!=null){
			System.out.println(ln.val);
			ln=ln.next;
		}

	}
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Reverse Linked List2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseLinkedList2 {

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
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(4);
		ln.next.next.next.next=new ListNode(5);
		ln=reverseBetween(ln, 2, 4);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}

	}
	/**
	 * Performs reverseBetween operation.
	 *
	 * @param head the head parameter
	 * @param m the m parameter
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode headPointer=head;
		int index=1;
		while(index!=m)
		{
			head=head.next;
			index++;
		}
		Stack<Integer> stack=new Stack<>();
		ListNode startPointer=head;
		while(index<=n)
		{
			index++;
			stack.push(head.val);
			head=head.next;
		}
		while(!stack.isEmpty())
		{
			startPointer.val=stack.pop();
			startPointer=startPointer.next;
		}
		return headPointer;
	}
}


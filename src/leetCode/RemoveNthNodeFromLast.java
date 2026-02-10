package leetCode;

/*
 * Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

/**
 * Implementation of Remove Nth Node From Last algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveNthNodeFromLast {
	/**
	 * Removes nth from end from the data structure.
	 *
	 * @param head the head parameter
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode headNode=head;
		ListNode forwardPointer=head,backwardPointer=head;
		int count=0;
		while(count<n)
		{
			forwardPointer=forwardPointer.next;
			count++;
		}

		// Check for null/base case
		if(forwardPointer==null){
			return head.next;
		}

		while(forwardPointer.next!=null)
		{
			backwardPointer=backwardPointer.next;
			forwardPointer=forwardPointer.next;
		}
		backwardPointer.next = backwardPointer.next.next;
		return headNode;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(2);
		/*ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(4);
		ln.next.next.next.next=new ListNode(5);*/
		ln=removeNthFromEnd(ln, 1);
		while(ln!=null)
		{
			System.out.print(ln.val+"//");
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
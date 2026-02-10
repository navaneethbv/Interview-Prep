package LeetCodePerformancePractice;

/**
 * Implementation of Partition List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PartitionList {
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
		ln.next=new ListNode(4);
		ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(2);
		ln.next.next.next.next=new ListNode(5);
		ln.next.next.next.next.next=new ListNode(2);
		ln=partition(ln,3);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}
	}
	/**
	 * Performs partition operation.
	 *
	 * @param head the head parameter
	 * @param x the x parameter
	 * @return the list of results
	 */
	public static ListNode partition(ListNode head, int x) {
		// Check for null/base case
		if(head==null)
			return head;
		ListNode fakeLessHead=new ListNode(-1);
		ListNode lessPointer=fakeLessHead;
		ListNode fakeMoreHead=new ListNode(-1);
		ListNode morePointer=fakeMoreHead;

		while(head!=null)
		{
			if(head.val<x)
			{
				fakeLessHead.next=head;
				fakeLessHead=fakeLessHead.next;
			}
			else{
				fakeMoreHead.next=head;
				fakeMoreHead=fakeMoreHead.next;
			}
			head=head.next;
		}
		fakeMoreHead.next=null;
		fakeLessHead.next=morePointer.next;
		// Check for null/base case
		if(lessPointer.next==null)
			return morePointer.next;
		else{
			return lessPointer.next;
		}
	}
}

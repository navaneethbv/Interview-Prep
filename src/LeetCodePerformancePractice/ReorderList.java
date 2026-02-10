package LeetCodePerformancePractice;

/**
 * Implementation of Reorder List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReorderList {
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
		reorderList(ln);
	}

	/**
	 * Performs reverseList operation.
	 *
	 * @param ln the ln parameter
	 * @return the list of results
	 */
	private static ListNode reverseList(ListNode ln) {
		// Check for null/base case
		if(ln==null||ln.next==null)
			return ln;
		ListNode nextNode=ln.next;
		ln.next=null;
		ListNode reverse=reverseList(nextNode);
		nextNode.next=ln;
		return reverse;
	}
	/**
	 * Performs reorderList operation.
	 *
	 * @param head the head parameter
	 */
	public static void reorderList(ListNode head) {
		// Check for null/base case
		if(head==null||head.next==null)
			return;
		ListNode headPointer=head;
		ListNode fastPointer=head.next;
		ListNode slowPointer=head;
		while(fastPointer!=null)
		{
			// Check for null/base case
			if(fastPointer.next!=null){
				fastPointer=fastPointer.next.next;
				slowPointer=slowPointer.next;
			}
			else
			{
				break;
			}
		}
		ListNode reverseNode=slowPointer.next;
		slowPointer.next=null;
		reverseNode=reverseList(reverseNode);
		head=headPointer;
		while(head!=null && reverseNode!=null)
		{
			ListNode headNext=head.next;
			ListNode reverseNext=reverseNode.next;
			head.next=reverseNode;
			reverseNode.next=headNext;
			reverseNode=reverseNext;
			head=headNext;
		}
		head=headPointer;
		while(head!=null)
		{
			System.out.println(head.val);head=head.next;
		}
	}
}

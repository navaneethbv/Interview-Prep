package LeetCodePerformancePractice;

/**
 * Implementation of Odd Even Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class OddEvenLinkedList {
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
		ln.next.next.next.next.next=new ListNode(6);
		ln.next.next.next.next.next.next=new ListNode(7);
		//ln.next.next.next.next.next.next.next=new ListNode(8);
		ln=oddEvenList(ln);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}
	}
	/**
	 * Performs oddEvenList operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public static ListNode oddEvenList(ListNode head) {
		// Check for null/base case
		if(head==null||head.next==null||head.next.next==null)
			return head;
		ListNode oddNode=head;
		ListNode evenNode=new ListNode(-1);
		ListNode evenNodepointer=evenNode;
		while(oddNode!=null && evenNode!=null)
		{	
			// Check for null/base case
			if(oddNode.next==null)
				break;
			evenNode.next=oddNode.next;
			evenNode=evenNode.next;
			// Check for null/base case
			if(oddNode.next.next==null)
				break;
			oddNode.next=oddNode.next.next;
			oddNode=oddNode.next;
		}
		// Check for null/base case
		if(evenNode!=null)
			evenNode.next=null;
		oddNode.next=evenNodepointer.next;
		return head;
	}
}

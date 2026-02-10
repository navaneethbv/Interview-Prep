package LeetCodePractice;

/**
 * Implementation of Remove Nth Node From End algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveNthNodeFromEnd {

	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x; 
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(2);
		ln=removeNthFromEnd(ln, 1);
		while(ln!=null){
			System.out.println(ln.val);
			ln=ln.next;
		}
	}



	/**
	 * Removes nth from end from the data structure.
	 *
	 * @param head the head parameter
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode leadingPointer=head;
		ListNode laggingPointer=head;
		int count=0;
		while(count<n){
			leadingPointer=leadingPointer.next;
			count++;
		}
		// Check for null/base case
		if(leadingPointer==null)
			return head.next;
		
		while(leadingPointer.next!=null)
		{
			leadingPointer=leadingPointer.next;
			laggingPointer=laggingPointer.next;
		}
		laggingPointer.next=laggingPointer.next.next;
		return head;
	}
}

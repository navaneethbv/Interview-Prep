package LeetCodePerformancePractice;

/**
 * Implementation of Remove Nth Node End algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveNthNodeEnd {
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
		ln=(removeNthFromEnd(ln, 5));
		while(ln!=null)
		{
			System.out.println(ln.val);
			ln=ln.next;
		}
	}
	/**
	 * Removes nth from end from the data structure.
	 *
	 * @param ln the ln parameter
	 * @param i the i parameter
	 * @return the list of results
	 */
	private static ListNode removeNthFromEnd(ListNode ln, int i) {
		ListNode prev=new ListNode(0);
		ListNode curr=ln;
		ListNode fastPointer=ln;
		while(i>0)
		{
			fastPointer=fastPointer.next;
			i--;
		}
		// Check for null/base case
		if(fastPointer==null)
			return ln.next;
		while(fastPointer!=null)
		{
			prev=curr;
			curr=curr.next;
			fastPointer=fastPointer.next;
		}
		prev.next=curr!=null?curr.next:null;
		return ln;
	}

}

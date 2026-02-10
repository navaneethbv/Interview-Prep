package LeetCodePractice;

/**
 * Implementation of Remove Duplicates Sorted List2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesSortedList2 {
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
		ln.next=new ListNode(1);
		ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(6);
		ln.next.next.next.next=new ListNode(4);
		ln.next.next.next.next.next=new ListNode(4);
		ln.next.next.next.next.next.next=new ListNode(5);
		ln=deleteDuplicates(ln);
		while(ln!=null){System.out.print(ln.val+"/");ln=ln.next;}System.out.println();
		/*ln=new ListNode(1);
		ln.next=new ListNode(1);
		ln.next.next=new ListNode(1);
		ln.next.next.next=new ListNode(2);
		ln.next.next.next.next=new ListNode(3);
		while(ln!=null){System.out.print(ln.val+"/");ln=ln.next;}System.out.println();*/
	}									


	/**
	 * Performs deleteDuplicates operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public static ListNode deleteDuplicates(ListNode head) {
		// Check for null/base case
		if(head==null||head.next==null)
			return head;
		return null;
		
	}

}


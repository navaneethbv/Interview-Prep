package LeetCodePerformancePractice;

/**
 * Implementation of Remove Duplicates Sorted List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesSortedList {
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
		ListNode ln=new ListNode(2);
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(3);
		ln.next.next.next.next=new ListNode(4);
		ln.next.next.next.next.next=new ListNode(4);
		ln.next.next.next.next.next.next=new ListNode(5);
		ln=deleteDuplicates(ln);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}

	}
	/**
	 * Performs deleteDuplicates operation.
	 *
	 * @param ln the ln parameter
	 * @return the list of results
	 */
	private static ListNode deleteDuplicates(ListNode ln) {
		ListNode output=new ListNode(0);
		output.next=null;
		ListNode pointer=output;
		while(ln!=null)
		{
			// Check for null/base case
			if(ln.next!=null && ln.val==ln.next.val)
			{
				while(ln!=null && ln.next!=null && ln.val==ln.next.val)
				{
					ln=ln.next;
				}
			}
			output.next=ln;
			output=output.next;
			ln=ln.next;
		}
		return pointer.next;
	}

}

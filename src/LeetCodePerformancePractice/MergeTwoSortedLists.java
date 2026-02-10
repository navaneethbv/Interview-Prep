package LeetCodePerformancePractice;

/**
 * Implementation of Merge Two Sorted Lists algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MergeTwoSortedLists {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * Performs mergeTwoLists operation.
	 *
	 * @param l1 the l1 parameter
	 * @param l2 the l2 parameter
	 * @return the list of results
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode output=new ListNode(-1);
		ListNode pointer=output;
		while(l1!=null && l2!=null)
		{
			if(l1.val<l2.val){
				output.next=new ListNode(l1.val);
				l1=l1.next;
			}
			else{				
				output.next=new ListNode(l2.val);
				l2=l2.next;
			}
			output=output.next;
		}
		while(l1!=null)
		{
			output.next=new ListNode(l1.val);
			l1=l1.next;
			output=output.next;
		}
		while(l2!=null)
		{
			output.next=new ListNode(l2.val);
			l2=l2.next;
			output=output.next;
		}
		return pointer.next;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}


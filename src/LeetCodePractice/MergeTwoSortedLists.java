package LeetCodePractice;

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
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(7);
		l1.next.next.next=new ListNode(9);
		l1.next.next.next.next=new ListNode(10);
		ListNode l2=new ListNode(2);
		l2.next=new ListNode(3);
		l2.next.next=new ListNode(5);
		l2.next.next.next=new ListNode(6);
		l1=mergeTwoLists(l1, l2);
		while(l1!=null)
		{
			System.out.print(l1.val+"/");l1=l1.next;
		}
	}


	/**
	 * Performs mergeTwoLists operation.
	 *
	 * @param l1 the l1 parameter
	 * @param l2 the l2 parameter
	 * @return the list of results
	 */
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// Check for null/base case
		if(l1==null||l2==null)return l1==null?l2:l1;
		ListNode ln=new ListNode(-1);
		ListNode pointer =ln;
		while(l1!=null && l2!=null)
		{
			if(l1.val<l2.val)
			{
				pointer.next=new ListNode(l1.val);
				pointer=pointer.next;
				l1=l1.next;
			}
			else
			{
				pointer.next=new ListNode(l2.val);
				pointer=pointer.next;
				l2=l2.next;
			}
		}
		// Check for null/base case
		if(l1==null)
			pointer.next=l2;
		else
			pointer.next=l1;
		return ln.next;
	}
}

package LeetCodePerformancePractice;

/**
 * Implementation of Intersection Of Linked Lists algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntersectionOfLinkedLists {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Retrieves intersection node from the data structure.
	 *
	 * @param headA the headA parameter
	 * @param headB the headB parameter
	 * @return the list of results
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int length1=getLength(headA);
		int length2=getLength(headB);
		if(length1>length2)
		{
			int diff=length1-length2;
			while(diff!=0)
			{
				headA=headA.next;
			}
			return intersection(headA,headB);
		}
		else{
			int diff=length2-length1;
			while(diff!=0)
			{
				headB=headB.next;
			}
			return intersection(headB,headA);
		}
	}
	/**
	 * Performs intersection operation.
	 *
	 * @param head1 the head1 parameter
	 * @param head2 the head2 parameter
	 * @return the list of results
	 */
	private ListNode intersection(ListNode head1, ListNode head2) {
		while(head1!=null && head2!=null)
		{
			if(head1.val==head2.val)
				return head1;
			head1=head1.next;
			head2=head2.next;
		}
		return head1;
	}
	/**
	 * Retrieves length from the data structure.
	 *
	 * @param head the head parameter
	 * @return the computed integer result
	 */
	private int getLength(ListNode head) {
		// Recursively process left and right subtrees
		return head!=null?1+getLength(head.next):0;
	}
}

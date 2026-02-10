package LeetCodePerformancePractice;

/**
 * Implementation of Rotate List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RotateList {
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
		ln=rotateRight(ln, 5);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}
	}
	/**
	 * Rotates the right.
	 *
	 * @param head the head parameter
	 * @param k the k value
	 * @return the list of results
	 */
	public static ListNode rotateRight(ListNode head, int k) {
		// Check for null/base case
		if(k<=0||head==null)
			return head;
		int length=findLength(head);
		k=k%length;
		// Check for null/base case
		if(k<=0||head==null)
			return head;
		ListNode prev=null;
		ListNode curr=head;
		// Iterate through all elements
		for (int i = 0; i < length-k; i++) {
			prev=curr;
			curr=curr.next;
		}
		prev.next=null;
		ListNode newHead=curr;
		while(curr!=null &&curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=head;
		return newHead;
	}
	/**
	 * Finds length in the data structure.
	 *
	 * @param head the head parameter
	 * @return the computed integer result
	 */
	private static int findLength(ListNode head) {
		// Recursively process left and right subtrees
		return head!=null?1+findLength(head.next):0;
	}
}


package eBayPrep;

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
		ln=rotateRight(ln, 2);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}
	}

	/**
	 * Rotates the right.
	 *
	 * @param ln the ln parameter
	 * @param count the count parameter
	 * @return the list of results
	 */
	private static ListNode rotateRight(ListNode ln, int count) {
		// Check for null/base case
		if(ln==null||ln.next==null)
			return ln;

		ListNode newPointer=ln;
		int length=findLength(newPointer);
		count=count%length;
		// Inner loop to check combinations
		for (int j = 0; j < count; j++) {
			ln=rotateOnce(ln);
		}
		return ln;
	}

	/**
	 * Finds length in the data structure.
	 *
	 * @param ln the ln parameter
	 * @return the computed integer result
	 */
	private static int findLength(ListNode ln) {
		// Check for null/base case
		if(ln==null)
			return 0;
		// Recursively process left and right subtrees
		return 1+findLength(ln.next);
	}

	/**
	 * Rotates the once.
	 *
	 * @param ln the ln parameter
	 * @return the list of results
	 */
	private static ListNode rotateOnce(ListNode ln) {
		ListNode headPointer=ln;
		ListNode prev=null,curr=ln;
		while(ln!=null)
		{
			prev=ln;
			curr=ln.next;
			ln=ln.next;
			// Check for null/base case
			if(ln.next==null)
				break;
		}
		prev.next=null;
		curr.next=headPointer;
		return curr;
	}


}


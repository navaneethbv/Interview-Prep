package LeetCodePractice;

/**
 * Implementation of Swap Nodes In Pairs algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SwapNodesInPairs {
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
		ln=swapPairs(ln);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}
	}
	/**
	 * Performs swapPairs operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public static ListNode swapPairs(ListNode head) {
		// Check for null/base case
		if(head==null||head.next==null)
			return head;
		ListNode headPointer =head;
		ListNode pointer=head;
		while(pointer!=null){
			// Check for null/base case
			if(pointer.next==null)
				break;
			ListNode pointer1=pointer;
			ListNode pointer2=pointer.next;
			int temp=pointer1.val;
			pointer1.val=pointer2.val;
			pointer2.val=temp;
			pointer=pointer.next.next;
		}
		return headPointer;
	}
}

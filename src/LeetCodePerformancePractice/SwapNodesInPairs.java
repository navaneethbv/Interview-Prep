package LeetCodePerformancePractice;

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
		/*ln.next=new ListNode(2);
		ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(4);*/
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
		ListNode pointer=new ListNode(0);
		pointer.next=head;
		ListNode output=pointer;
		ListNode curr=null;
		while(pointer!=null)
		{
			ListNode prev=pointer.next;
			// Check for null/base case
			if(prev!=null && prev.next!=null){
				curr=prev.next;
				prev.next=curr!=null?curr.next:curr;
				// Check for null/base case
				if(curr!=null)
					curr.next=prev;
				pointer.next=curr;
			}
			pointer=prev;
		}
		return output.next;
	}

}


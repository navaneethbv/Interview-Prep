package leetCode;

/*
 * Link : https://leetcode.com/problems/swap-nodes-in-pairs/
 */

/**
 * Implementation of Swaps Nodes In Pairs algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SwapsNodesInPairs {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * Performs swapPairs operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public static ListNode swapPairs(ListNode head) {
		ListNode headNode=head;
		ListNode pointer=head;
		while(pointer!=null)
		{
			// Check for null/base case
			if(pointer.next!=null)
			{
				int val=pointer.val;
				pointer.val=pointer.next.val;
				pointer.next.val=val;
				pointer=pointer.next.next;
			}
			else{
				break;
			}
		}
		return headNode;
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
			System.out.print(ln.val+"/");
			ln=ln.next;
		}
		
	}
}
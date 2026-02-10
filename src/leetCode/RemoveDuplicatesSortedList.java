package leetCode;

/*
 * Link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

/**
 * Implementation of Remove Duplicates Sorted List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesSortedList {
	 /**
	  * Performs deleteDuplicates operation.
	  *
	  * @param head the head parameter
	  * @return the list of results
	  */
	 public static ListNode deleteDuplicates(ListNode head) {
	        // Check for null/base case
	        if(head == null || head.next == null)
	            return head;
	 
	        ListNode prev = head;    
	        ListNode p = head.next;
	 
	        while(p != null){
	            if(p.val == prev.val){
	                prev.next = p.next;
	                p = p.next;
	            }else{
	                prev = p;
	                p = p.next; 
	            }
	        }
	 
	        return head;
	 }
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class ListNode {
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
		ln.next.next=new ListNode(2);
		ln.next.next.next=new ListNode(3);
		ln.next.next.next.next=new ListNode(3);
		ln.next.next.next.next.next=new ListNode(4);
		ln=deleteDuplicates(ln);
		System.out.println("HERE");
		while(ln!=null){
			System.out.println(ln.val);
			ln=ln.next;
		}
	}
}
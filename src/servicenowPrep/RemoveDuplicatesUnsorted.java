package servicenowPrep;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of Remove Duplicates Unsorted algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesUnsorted {

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class ListNode{
		int value;
		public ListNode(int value) {
			this.value=value;
		}
		ListNode next;

	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode ln=new ListNode(12);
		ln.next=new ListNode(11);
		ln.next.next=new ListNode(12);
		ln.next.next.next=new ListNode(21);
		ln.next.next.next.next=new ListNode(41);
		ln.next.next.next.next.next=new ListNode(43);
		ln.next.next.next.next.next.next=new ListNode(21);
		ln=removeDuplicates(ln);
		System.out.println("****");
		while(ln!=null)
		{
			System.out.println(ln.value);
			ln=ln.next;
		}
		//12->11->12->21->41->43->21
	}
	/**
	 * Removes duplicates from the data structure.
	 *
	 * @param ln the ln parameter
	 * @return the list of results
	 */
	private static ListNode removeDuplicates(ListNode ln) {
		ListNode pointer=ln;
		ListNode curr=ln;
		Set<Integer> set=new HashSet<>();
		// Check for null/base case
		if(ln!=null)
			set.add(ln.value);
		while(curr!=null)
		{	
			if(!set.contains(curr.value))
			{
				set.add(curr.value);
				ln.next=curr;
				ln=ln.next;
			}
			curr=curr.next;
		}
		ln.next=null;
		return pointer;
	}




}

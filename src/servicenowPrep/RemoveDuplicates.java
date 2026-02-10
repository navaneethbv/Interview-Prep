package servicenowPrep;

/**
 * Implementation of Remove Duplicates algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicates {
	
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
		ListNode ln=new ListNode(11);
		ln.next=new ListNode(11);
		ln.next.next=new ListNode(11);
		ln.next.next.next=new ListNode(21);
		ln.next.next.next.next=new ListNode(43);
		ln.next.next.next.next.next=new ListNode(43);
		ln.next.next.next.next.next.next=new ListNode(60);
		ln=removeDuplicates(ln);
		System.out.println("****");
		while(ln!=null)
		{
			System.out.println(ln.value);
			ln=ln.next;
		}
	}
	/**
	 * Removes duplicates from the data structure.
	 *
	 * @param ln the ln parameter
	 * @return the list of results
	 */
	private static ListNode removeDuplicates(ListNode ln) {
		ListNode pointer=ln;
		ListNode prev=null,curr=ln;
		while(curr!=null)
		{	
			// Check for null/base case
			if(prev==null ||curr.value!=prev.value)
			{
				prev=curr;
				curr=curr.next;
				System.out.println(prev.value);
				ln.next=prev;
				ln=ln.next;
			}
			else{
				curr=curr.next;
			}
		}
		
		
		
		return pointer;
	}
	

	

}

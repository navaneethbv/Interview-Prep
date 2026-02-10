package servicenowPrep;

/**
 * Implementation of Merge Two Sorted LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MergeTwoSortedLL {

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
		ListNode ln = new ListNode(2);
		ln.next = new ListNode(4);
		ln.next.next = new ListNode(6);
		ln.next.next.next = new ListNode(8);
		ln.next.next.next.next = new ListNode(10);
		ln.next.next.next.next.next = new ListNode(12);
		ListNode ln1 = new ListNode(1);
		ln1.next = new ListNode(3);
		ln1.next.next = new ListNode(5);
		ln1.next.next.next = new ListNode(7);
		ln=(merge(ln,ln1));

		while(ln!=null)
		{
			System.out.println(ln.value);ln=ln.next;
		}
	}
	/**
	 * Performs merge operation.
	 *
	 * @param ln the ln parameter
	 * @param ln1 the ln1 parameter
	 * @return the list of results
	 */
	private static ListNode merge(ListNode ln,ListNode ln1) {
		ListNode output=new ListNode(-1),pointer=output;
		while(ln!=null && ln1!=null)
		{
			if(ln.value<ln1.value)
			{
				output.next=ln;
				output=output.next;
				ln=ln.next;
			}
			else{
				output.next=ln1;
				output=output.next;
				ln1=ln1.next;
			}
		}
		// Check for null/base case
		if(ln!=null)
		{
			while(ln!=null)
			{
				output.next=ln;
				output=output.next;
				ln=ln.next;
			}
		}
		else{
			while(ln1!=null)
			{
				output.next=ln1;
				output=output.next;
				ln1=ln1.next;
			}
		}
		return pointer.next;
	}

}

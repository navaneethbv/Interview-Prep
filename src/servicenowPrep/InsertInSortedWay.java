package servicenowPrep;

/**
 * Implementation of Insert In Sorted Way algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InsertInSortedWay {

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class ListNode{
		int value;
		ListNode next;
		public ListNode(int value) {
			this.value=value;
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode ln=new ListNode(2);
		ln.next=new ListNode(5);
		ln.next.next=new ListNode(7);
		ln.next.next.next=new ListNode(10);
		ln.next.next.next.next=new ListNode(15);
		ln=(insertSorted(ln,9));
		while(ln!=null)
		{
			System.out.println(ln.value);
			ln=ln.next;
		}
	}

	/**
	 * Performs insertSorted operation.
	 *
	 * @param ln the ln parameter
	 * @param i the i parameter
	 * @return the list of results
	 */
	private static ListNode insertSorted(ListNode ln, int i) {
		if(ln.value>i)
		{
			ListNode newHead=new ListNode(i);
			newHead.next=ln;
			return newHead;
		}
		else{
			ListNode pointer=ln;
			ListNode prev=null,curr=ln;
			while(pointer!=null && pointer.value<i)
			{
				prev=pointer;
				curr=pointer.next;
				pointer=pointer.next;
			}
			ListNode temp=new ListNode(i);
			prev.next=temp;
			temp.next=curr;
		}
		return ln;
	}

	


}

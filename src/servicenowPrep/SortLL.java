package servicenowPrep;

/**
 * Implementation of Sort LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortLL {

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
		ListNode ln = new ListNode(0);
        ln.next = new ListNode(1);
        ln.next.next = new ListNode(0);
        ln.next.next.next = new ListNode(2);
        ln.next.next.next.next = new ListNode(1);
        ln.next.next.next.next.next = new ListNode(1);
        ln.next.next.next.next.next.next = new ListNode(2);
        ln.next.next.next.next.next.next.next = new ListNode(1);
        ln.next.next.next.next.next.next.next.next = new ListNode(2);
        ln=sortLL(ln);
        while(ln!=null)
        {
        	System.out.println(ln.value);ln=ln.next;
        }
	}
	/**
	 * Performs sortLL operation.
	 *
	 * @param ln the ln parameter
	 * @return the list of results
	 */
	private static ListNode sortLL(ListNode ln) {
		
		return null;
	}
	
}

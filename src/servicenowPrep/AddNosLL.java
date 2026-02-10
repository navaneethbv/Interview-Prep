package servicenowPrep;

/**
 * Implementation of Add Nos LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AddNosLL {

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
		ListNode ln = new ListNode(7);
        ln.next = new ListNode(5);
        ln.next.next = new ListNode(9);
        ln.next.next.next = new ListNode(4);
        ln.next.next.next.next = new ListNode(6);
		ListNode ln1 = new ListNode(8);
        ln1.next = new ListNode(4);
        ln=addNos(ln,ln1);
        while(ln!=null)
        {
        	System.out.println(ln.value);ln=ln.next;
        }
	}
	/**
	 * Adds nos to the data structure.
	 *
	 * @param ln the ln parameter
	 * @param ln1 the ln1 parameter
	 * @return the list of results
	 */
	private static ListNode addNos(ListNode ln, ListNode ln1) {
		int carry=0;
		while(ln!=null && ln1!=null)
		{
			
		}
		return null;
	}
	

}

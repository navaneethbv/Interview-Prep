package servicenowPrep;

/**
 * Implementation of get Nth Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class getNthNode {

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
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(10);
		ln.next.next=new ListNode(30);
		ln.next.next.next=new ListNode(14);
		ln=(getNode(ln,2));
		System.out.println(ln.value);
	}

	/**
	 * Retrieves node from the data structure.
	 *
	 * @param ln the ln parameter
	 * @param N the size or count parameter
	 * @return the list of results
	 */
	private static ListNode getNode(ListNode ln, int N) {
		while(N>0)
		{
			ln=ln.next;
			N--;
		}
		return ln;
	}

	

}

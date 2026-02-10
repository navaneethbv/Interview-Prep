package servicenowPrep;

/**
 * Implementation of Identical LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IdenticalLL {

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
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(3);

		ListNode ln1=new ListNode(1);
		ln1.next=new ListNode(2);
		//ln1.next.next=new ListNode(3);

		System.out.println(isIdentical(ln,ln1));

	}

	/**
	 * Checks if identical.
	 *
	 * @param ln the ln parameter
	 * @param ln1 the ln1 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isIdentical(ListNode ln, ListNode ln1) {
		// Check for null/base case
		if(ln==null && ln1==null)
			return true;
		// Check for null/base case
		if(ln==null || ln1==null)
			return false;
		// Recursively process left and right subtrees
		return ln.value==ln1.value && isIdentical(ln.next, ln1.next);
	}

}

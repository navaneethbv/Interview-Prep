package servicenowPrep;

/**
 * Implementation of Recursive LL Print algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RecursiveLLPrint {

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
		ListNode ln=new ListNode(3);
		ln.next=new ListNode(6);
		ln.next.next=new ListNode(9);
		ln.next.next.next=new ListNode(15);
		ln.next.next.next.next=new ListNode(30);
		recursivePrint(ln);
	}

	/**
	 * Performs recursivePrint operation.
	 *
	 * @param ln the ln parameter
	 */
	private static void recursivePrint(ListNode ln) {
		// Check for null/base case
		if(ln==null)
			return;
		recursivePrint(ln.next);
		System.out.println(ln.value);
	}

	

}

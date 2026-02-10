package servicenowPrep;

/**
 * Implementation of Detect And Remove Loop algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DetectAndRemoveLoop {

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
		ListNode ln = new ListNode(50);
        ln.next = new ListNode(20);
        ln.next.next = new ListNode(15);
        ln.next.next.next = new ListNode(4);
        ln.next.next.next.next = new ListNode(10);
        ln.next.next.next.next.next = ln.next.next;
        if(detectLoop(ln))
        	ln=removeLoop(ln);
        while(ln!=null)
        {
        	System.out.println(ln.value);ln=ln.next;
        }
	}
	/**
	 * Removes loop from the data structure.
	 *
	 * @param ln the ln parameter
	 * @return the list of results
	 */
	private static ListNode removeLoop(ListNode ln) {
		ListNode fastPointer=ln.next.next;
		ListNode slowPointer=ln;
		ListNode prev=null;
		while(fastPointer!=null && fastPointer!=slowPointer)
		{
			fastPointer=fastPointer.next;
			fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
			prev=fastPointer;
		}
		prev.next=null;
		return ln;
	}
	/**
	 * Performs detectLoop operation.
	 *
	 * @param ln the ln parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean detectLoop(ListNode ln) {
		ListNode fastPointer=ln.next.next;
		ListNode slowPointer=ln;
		while(fastPointer!=null && fastPointer!=slowPointer)
		{
			fastPointer=fastPointer.next;
			// Check for null/base case
			if(fastPointer!=null)
				fastPointer=fastPointer.next;
			else
				return false;
			slowPointer=slowPointer.next;
		}
		return true;
	}

}

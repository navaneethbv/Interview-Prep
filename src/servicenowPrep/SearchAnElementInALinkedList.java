package servicenowPrep;

/**
 * Implementation of Search An Element In A Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchAnElementInALinkedList {

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
		ln.next.next.next=new ListNode(4);
		ln.next.next.next.next=new ListNode(5);
		ln.next.next.next.next.next=new ListNode(6);
		System.out.println(searchElementRecursive(ln,5));
		System.out.println(searchElementRecursive(ln,-1));
		
	}

	/**
	 * Searches for element.
	 *
	 * @param ln the ln parameter
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean searchElement(ListNode ln, int i) {
		while(ln!=null)
		{
			if(ln.value==i)
				return true;
			ln=ln.next;
		}
		return false;
	}
	
	/**
	 * Searches for element recursive.
	 *
	 * @param ln the ln parameter
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean searchElementRecursive(ListNode ln, int i) {
		// Check for null/base case
		if(ln==null)
			return false;
		if(ln.value==i)
			return true;
		return searchElement(ln.next, i);
	}
	

}

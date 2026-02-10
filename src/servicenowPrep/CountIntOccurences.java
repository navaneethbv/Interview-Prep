package servicenowPrep;

/**
 * Implementation of Count Int Occurences algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountIntOccurences {

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
		ln.next.next = new ListNode(2);
		ln.next.next.next = new ListNode(3);
		ln.next.next.next.next = new ListNode(4);
		ln.next.next.next.next.next = new ListNode(2);
		ln.next.next.next.next.next.next = new ListNode(6);
		ln.next.next.next.next.next.next.next = new ListNode(2);
		ln.next.next.next.next.next.next.next.next = new ListNode(8);
		System.out.println(getCount(ln,2));

	}
	/**
	 * Retrieves count from the data structure.
	 *
	 * @param ln the ln parameter
	 * @param number the number parameter
	 * @return the computed integer result
	 */
	private static int getCount(ListNode ln,int number) {
		int count=0;
		while(ln!=null)
		{	
			count+=(ln.value==number)?1:0;
			ln=ln.next;
		}
		return count;
	}

}

package servicenowPrep;

/**
 * Implementation of Find Length Of LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindLengthOfLL {

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
		System.out.println(findLengthRecursive(ln));
	}

	/**
	 * Finds length in the data structure.
	 *
	 * @param ln the ln parameter
	 * @return the computed integer result
	 */
	private static int findLength(ListNode ln) {
		int count=0;
		while(ln!=null)
		{
			ln=ln.next;
			count+=1;
		}
		return count;
	}

	/**
	 * Finds length recursive in the data structure.
	 *
	 * @param ln the ln parameter
	 * @return the computed integer result
	 */
	private static int findLengthRecursive(ListNode ln) {
		// Check for null/base case
		if(ln==null)
			return 0;
		return 1+findLength(ln.next);
	}

}

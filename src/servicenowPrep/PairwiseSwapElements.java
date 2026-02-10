package servicenowPrep;

/**
 * Implementation of Pairwise Swap Elements algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PairwiseSwapElements {

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
		ln=pairwiseSwap(ln);
		while(ln!=null)
		{
			System.out.println(ln.value);ln=ln.next;
		}
	}

	/**
	 * Performs pairwiseSwap operation.
	 *
	 * @param ln the ln parameter
	 * @return the list of results
	 */
	private static ListNode pairwiseSwap(ListNode ln) {
		ListNode pointer=ln;
		while(pointer!=null)
		{
			// Check for null/base case
			if(pointer.next!=null)
			{
				int temp=pointer.next.value;
				pointer.next.value=pointer.value;
				pointer.value=temp;
			}
			else{
				break;
			}
			pointer=pointer.next.next;
		}
		return ln;
	}

}

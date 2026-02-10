package servicenowPrep;

/**
 * Implementation of Get Intersection Point algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GetIntersectionPoint {

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
		ListNode ln1=new ListNode(10);
		ln1.next=new ListNode(15);
		ln1.next.next=new ListNode(30);
		System.out.println(findIntersection(ln,ln1).value);
	}

	/**
	 * Finds intersection in the data structure.
	 *
	 * @param ln the ln parameter
	 * @param ln1 the ln1 parameter
	 * @return the list of results
	 */
	private static ListNode findIntersection(ListNode ln, ListNode ln1) {
		int length1=findLength(ln);
		int length2=findLength(ln1);
		if(length1>length2)
		{
			int diff=length1=length2;
			while(diff!=1)
			{
				ln=ln.next;
				diff--;
			}
			while(ln.value!=ln1.value)
			{
				ln=ln.next;
				ln1=ln1.next;
			}
		}
		else{
			int diff=length2=length1;
			while(diff!=1)
			{
				ln1=ln1.next;
				diff--;
			}
			while(ln.value!=ln1.value)
			{
				ln=ln.next;
				ln1=ln1.next;
			}
		}
		return ln;
	}

	/**
	 * Finds length in the data structure.
	 *
	 * @param ln the ln parameter
	 * @return the computed integer result
	 */
	private static int findLength(ListNode ln) {
		// Check for null/base case
		if(ln!=null)
			// Recursively process left and right subtrees
			return 1+findLength(ln.next);
		return 0;
	}

}

package careerCup;

/*
 * Link: http://www.careercup.com/question?id=310691
 * Implement merge sort of linked list
 */
/**
 * Implementation of google Career Cup algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class googleCareerCup {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

		ListNode ln=new ListNode(3);
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(4);
		ln.next.next.next=new ListNode(1);
		mergeSort(ln);
		while(ln!=null)
		{
			System.out.println(ln.val);
			ln=ln.next;
		}
	}

	static ListNode a,b;
	/**
	 * Performs mergeSort operation.
	 *
	 * @param ln the ln parameter
	 */
	private static void mergeSort(ListNode ln) {
		// Check for null/base case
		if ((ln == null) || (ln.next == null))
		{
			return;
		}

		split(ln,a,b);
		mergeSort(a);
		mergeSort(b);
		ln=sortedMerge(a,b);
	}


	/**
	 * Performs sortedMerge operation.
	 *
	 * @param a the a parameter
	 * @param b the b parameter
	 * @return the list of results
	 */
	private static ListNode sortedMerge(ListNode a, ListNode b) {
		// Check for null/base case
		if(a==null)
			return b;
		// Check for null/base case
		else if(b==null)
			return a;
		ListNode result=null;
		if(a.val<=b.val)
		{
			result=a;
			result.next=sortedMerge(a.next, b);
		}
		else
		{
			result=b;
			result.next=sortedMerge(a, b.next);	
		}
		return result;
	}


	/**
	 * Performs split operation.
	 *
	 * @param ln the ln parameter
	 * @param a the a parameter
	 * @param b the b parameter
	 */
	private static void split(ListNode ln, ListNode a, ListNode b) {
		// Check for null/base case
		if(ln==null)
		{
			a=ln;
			b=null;
		}
		ListNode slowPointer=ln;
		ListNode fastPointer=ln;
		while(fastPointer!=null)
		{
			fastPointer=fastPointer.next;
			// Check for null/base case
			if(fastPointer==null)
				break;
			fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
		}
		a=ln;
		b=slowPointer!=null?slowPointer.next:null;
		// Check for null/base case
		if(slowPointer!=null)
			slowPointer.next=null;
	}


	/**
	 * Inner class representing a node in the data structure.
	 */
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val) {
			this.val=val;
		}
	}

}

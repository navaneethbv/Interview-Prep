package servicenowPrep;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of Intersection Of LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntersectionOfLL {

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
		ln.next.next.next.next=new ListNode(6);
		ListNode ln1=new ListNode(2);
		ln1.next=new ListNode(4);
		ln1.next.next=new ListNode(6);
		ln1.next.next.next=new ListNode(8);
		ln=intersection(ln,ln1);
		while(ln!=null)
		{
			System.out.println(ln.value);ln=ln.next;
		}
	}

	/**
	 * Performs intersection operation.
	 *
	 * @param ln the ln parameter
	 * @param ln1 the ln1 parameter
	 * @return the list of results
	 */
	private static ListNode intersection(ListNode ln, ListNode ln1) {
		ListNode outputPointer=new ListNode(-1);
		ListNode output=outputPointer;

		Set<Integer> set=new HashSet<>();
		while(ln!=null)
		{
			set.add(ln.value);
			ln=ln.next;
		}
		while(ln1!=null)
		{
			if(set.contains(ln1.value))
			{
				output.next=new ListNode(ln1.value);
				output=output.next;
			}
			ln1=ln1.next;
		}
		return outputPointer.next;
	}

}

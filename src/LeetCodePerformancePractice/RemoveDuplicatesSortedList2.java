package LeetCodePerformancePractice;

/**
 * Implementation of Remove Duplicates Sorted List2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesSortedList2 {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
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
		/*ln.next.next.next=new ListNode(3);
		ln.next.next.next.next=new ListNode(4);
		ln.next.next.next.next.next=new ListNode(4);
		ln.next.next.next.next.next.next=new ListNode(5);*/
		ln=deleteDuplicates(ln);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}



	}
	/**
	 * Performs deleteDuplicates operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode output=new ListNode(0);
		// Check for null/base case
		if(head==null||head.next==null)
			return head;
		output.next=null;
		ListNode pointer=output;
		while(head!=null )
		{
			// Check for null/base case
			if(head.next!=null)
			{
				if(head.val==head.next.val)
				{
					while(head.next!=null && head.val==head.next.val){
						head=head.next;
					}
					head=head!=null?head.next:null;
				}
				else{
					output.next=head;
					output=output.next;
					head=head.next;
				}
			}
			else{
				output.next=head;
				output=output.next;
				head=head.next;
			}
			output.next=null;
		}
		return pointer.next;



	}
}

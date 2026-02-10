package LeetCodePractice;

/**
 * Implementation of Rotate List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RotateList {
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
		ln=rotateRight(ln, 5);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}
	}

	/**
	 * Rotates the right.
	 *
	 * @param head the head parameter
	 * @param k the k value
	 * @return the list of results
	 */
	public static ListNode rotateRight(ListNode head, int k) {
		ListNode headPointer=head;
		// Check for null/base case
		if(head==null||head.next==null)
			return head;
		
		int length=findLength(head);
		k=k%length;
		for (int i = 0; i < k; i++) {
			headPointer=head;
			headPointer=rotateListToRight(headPointer);
		}
		return headPointer;

	}

	/**
	 * Finds length in the data structure.
	 *
	 * @param head the head parameter
	 * @return the computed integer result
	 */
	private static int findLength(ListNode head) {
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}

	/**
	 * Rotates the list to right.
	 *
	 * @param headPointer the headPointer parameter
	 * @return the list of results
	 */
	private static ListNode rotateListToRight(ListNode headPointer) {
		ListNode pointer=headPointer;
		int temp=Integer.MIN_VALUE;;//1->2->3->4->5
		while(headPointer!=null)
		{
			// Check for null/base case
			if(headPointer.next!=null)
			{
				if(temp==Integer.MIN_VALUE){
					temp=headPointer.next.val;
					headPointer.next.val=headPointer.val;
				}
				else{
					int tempPrev=temp;
					temp=headPointer.next.val;
					headPointer.next.val=tempPrev;
				}
				headPointer=headPointer.next;
			}
			else{
				//temp=headPointer.val;
				headPointer=null;
			}

		}
		pointer.val=temp;
		return pointer;

	}
}


package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Reverse Nodes K Groups algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseNodesKGroups {
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
		ln.next.next.next=new ListNode(4);
		ln.next.next.next.next=new ListNode(5);

		ln=reverseNodes(ln,3);
		while(ln!=null)
		{
			System.out.println(ln.val);ln=ln.next;
		}
	}

	/**
	 * Performs reverseNodes operation.
	 *
	 * @param ln the ln parameter
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	private static ListNode reverseNodes(ListNode ln, int n) {
		Stack<Integer> stack=new Stack<>();
		ListNode head=ln;
		while(ln!=null)
		{	
			ListNode lnPointer=ln;
			int count=0;
			while(count<n && lnPointer!=null)
			{
				stack.push(lnPointer.val);
				lnPointer=lnPointer.next;
				count++;
			}
			while(!stack.isEmpty())
			{
				ln.val=stack.pop();
				ln=ln.next;
			}
		}
		return head;
	}

}

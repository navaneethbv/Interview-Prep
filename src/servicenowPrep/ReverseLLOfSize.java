package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Reverse LL Of Size algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseLLOfSize {

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
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(4);
		ln.next.next.next.next=new ListNode(5);
		ln.next.next.next.next.next=new ListNode(6);
		ln.next.next.next.next.next.next=new ListNode(7);
		ln.next.next.next.next.next.next.next=new ListNode(8);
		ln=reverseLL(ln,3);
		System.out.println("****");
		while(ln!=null)
		{
			System.out.println(ln.value);
			ln=ln.next;
		}
	}
	/**
	 * Performs reverseLL operation.
	 *
	 * @param ln the ln parameter
	 * @param k the k value
	 * @return the list of results
	 */
	private static ListNode reverseLL(ListNode ln, int k) {
		
		ListNode output=ln;
		ListNode outputNode=output;
		while(ln!=null)
		{
			ListNode pointer=ln;
			Stack<ListNode> stack=new Stack<>();
			for (int i = 0; i < k; i++) {
				// Check for null/base case
				if(pointer!=null){
					stack.push(pointer);
					pointer=pointer.next;
				}
			}

			while(!stack.isEmpty())
			{
				output.next=stack.pop();
				output=output.next;
			}
			//output.next=null;
			ln=pointer;
		}
		output.next=null;
		return outputNode;
	}

}

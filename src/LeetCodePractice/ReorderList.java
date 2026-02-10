package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Reorder List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReorderList {

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
		reorderList(ln);
	}
	/**
	 * Performs reorderList operation.
	 *
	 * @param ln the ln parameter
	 */
	public static void reorderList(ListNode ln) {
		Stack<ListNode> stack=new Stack<>();
		ListNode headPointer=ln;
		int length=0;
		while(ln!=null)
		{
			stack.push(ln);
			length++;
			ln=ln.next;
		}
		if(length<=2){
			ln=headPointer;
			return;
		}
		ln=headPointer;
		int counter=0;
		while(ln!=null && counter<length)
		{
			ListNode ln1=stack.pop();
			ListNode nextNode=ln.next;
			ln.next=ln1;
			counter++;
			if(counter<length)
				ln1.next=nextNode;
			else
				ln1.next=null;
			counter++;
			ln=ln.next;
			// Check for null/base case
			if(ln!=null)
				ln=ln.next;	
		}
		// Check for null/base case
		if(ln!=null)
		{
			ln.next=null;
		}
		ln=headPointer;
	}
}


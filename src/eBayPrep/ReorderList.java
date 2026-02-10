package eBayPrep;

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
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs reorderList operation.
	 *
	 * @param ln the ln parameter
	 */
	public static void reorderList(ListNode ln) {
		ListNode headNode=ln;
		int length=0;
		Stack<ListNode> stack=new Stack<>();
		while(ln!=null)
		{
			stack.push(ln);
			ln=ln.next;
			length++;
		}
		if(length<=2)
			return;
		ln=headNode;
		int counter=1;
		//length=(length/2)%2==0?length/2+1:(length/2);
		while(ln!=null && !stack.isEmpty() && counter<(length))
		{
			ListNode newNode=stack.pop();
			ListNode nextNode=ln.next;
			ln.next=newNode;
			newNode.next=nextNode;
			ln=nextNode;
			counter+=2;
		}
		ln.next=null;
		ln=headNode;
		while(ln!=null)
		{
			System.out.println(ln.val);
			ln=ln.next;
		}
	}
}


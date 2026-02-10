package appleInterview;

import java.util.Stack;

/**
 * Implementation of DSLL Reverse LL Iterative algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSLLReverseLLIterative {

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node next;
		int value;
		public Node(int value){
			this.value=value;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		print(n);
		//n=reverseIterativeExtraSpace(n);
		n=reverseIterative(n);
		print(n);

	}

	/**
	 * Performs reverseIterativeExtraSpace operation.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node reverseIterativeExtraSpace(Node n) {
		Stack<Integer> valueStack=new Stack<Integer>();
		Node temp=n;
		Node newHead=n;
		while(n!=null)
		{
			valueStack.push(n.value);
			n=n.next;
		}
		while(!valueStack.isEmpty()){
			temp.value=valueStack.pop();
			temp=temp.next;
		}
		return newHead;
	}

	/**
	 * Performs reverseIterative operation.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node reverseIterative(Node n) {
		Node prev=null;
		Node current=n;
		Node next;
		
		while(current!=null)
		{
			next=current.next;
			current.next = prev;   
	        prev = current;
	        current = next;
		}
		return prev;
	}

	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null){
			System.out.print(n.value+"/");
			n=n.next;
		}
		System.out.println();
	}

}

package appleInterview;

import java.util.Stack;

/**
 * Implementation of DSLL Reverse LL Group Sub Size algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSLLReverseLLGroupSubSize {
	static Node head;
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
		Node n1=new Node(1);
		n1.next=new Node(2);
		n1.next.next=new Node(3);
		n1.next.next.next=new Node(4);
		n1.next.next.next.next=new Node(5);
		n1.next.next.next.next.next=new Node(6);
		n1.next.next.next.next.next.next=new Node(7);
		n1.next.next.next.next.next.next.next=new Node(8);
		print(n1);
		/*reverseLLSize(n1,3);
		print(n1);*/
		reverseLLSize(n1,5);
		print(n1);
	}

	/**
	 * Performs reverseLLSize operation.
	 *
	 * @param n1 the n1 parameter
	 * @param i the i parameter
	 */
	private static void reverseLLSize(Node n1, int i) {
		while(n1!=null)
		{
			Stack<Integer> elemStack=new Stack<Integer>();
			Node temp=n1;
			// Inner loop to check combinations
			for (int j = 0; j < i; j++) {
				// Check for null/base case
				if(n1!=null)
				{
					elemStack.push(n1.value);
					n1=n1.next;
				}
			}
			while(!elemStack.isEmpty()){
				temp.value=elemStack.pop();
				temp=temp.next;
			}
		}
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

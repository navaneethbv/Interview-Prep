package yelpInterview;

import java.util.Stack;

/**
 * Implementation of Reverse LL Alternate K algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseLLAlternateK {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value=value;
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		n.next.next.next.next.next.next=new Node(7);
		n.next.next.next.next.next.next.next=new Node(8);
		n=reverseLL(n,5);
		print(n);
	}


	/**
	 * Performs reverseLL operation.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 * @return the Node result
	 */
	private static Node reverseLL(Node n,int k) {
		Node outputNode=new Node(-1);
		Node ptr=outputNode;
		while(n!=null)
		{
			Stack<Integer> stack=new Stack<>();
			for (int i = 0; i < k; i++) {
				// Check for null/base case
				if(n!=null)
					stack.push(n.value);
				else
					break;
				n=n.next;
			}
			while(!stack.isEmpty())
			{
				outputNode.next=new Node(stack.pop());
				outputNode=outputNode.next;
			}
		}
		return ptr.next;
	}










	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null)
		{
			System.out.print(n.value+"/");
			n=n.next;
		}
	}

}







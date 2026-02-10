package yelpInterview;

import java.util.Set;
import java.util.TreeSet;

/**
 * Implementation of Pairwise Swap Elements LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PairwiseSwapElementsLL {
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
		n=pairwiseSwap(n);
		print(n);
	}

	/**
	 * Performs pairwiseSwap operation.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node pairwiseSwap(Node n) {
		Node outputNode=n;
		while(n!=null)
		{
			int firstValue=n.value;
			// Check for null/base case
			if(n.next!=null){
				int secondValue=n.next.value;
				n.value=secondValue;
				n.next.value=firstValue;
				n=n.next;
			}
			n=n.next;
		}
		return outputNode;
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


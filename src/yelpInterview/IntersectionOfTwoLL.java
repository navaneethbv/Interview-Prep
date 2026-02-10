package yelpInterview;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of Intersection Of Two LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntersectionOfTwoLL {
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
		n.next.next.next.next=new Node(6);

		Node n1=new Node(2);
		n1.next=new Node(4);
		n1.next.next=new Node(6);
		n1.next.next.next=new Node(8);

		n=findIntersection(n,n1);
		print(n);
	}

	/**
	 * Finds intersection in the data structure.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return the Node result
	 */
	private static Node findIntersection(Node n1,Node n2) {
		Set<Integer> set=new HashSet<>();
		Node outputNode=new Node(-1);
		Node nOut=outputNode;
		while(n1!=null)
		{
			set.add(n1.value);n1=n1.next;
		}
		while(n2!=null)
		{
			if(set.contains(n2.value))
			{
				outputNode.next=new Node(n2.value);
				outputNode=outputNode.next;
			}
			n2=n2.next;
		}
		return nOut.next;
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


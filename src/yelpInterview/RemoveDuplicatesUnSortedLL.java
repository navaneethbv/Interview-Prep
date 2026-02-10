package yelpInterview;

import java.util.Set;
import java.util.TreeSet;

/**
 * Implementation of Remove Duplicates Un Sorted LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesUnSortedLL {
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
		Node n=new Node(12);
		n.next=new Node(11);
		n.next.next=new Node(12);
		n.next.next.next=new Node(21);
		n.next.next.next.next=new Node(41);
		n.next.next.next.next.next=new Node(43);
		n.next.next.next.next.next.next=new Node(21);
		n.next.next.next.next.next.next.next=new Node(12);
		
		n=removeDuplicates(n);
		print(n);
	}

	/**
	 * Removes duplicates from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node removeDuplicates(Node n) {
		Node outputNode=n;
		Set<Integer> set=new TreeSet<>();
		while(n!=null)
		{
			if(set.contains(n.value))
			{
				// Check for null/base case
				if(n.next!=null){
					n.value=n.next.value;
					n.next=n.next.next;
				}
				else{
					n=null;
				}
			}
			else{
				set.add(n.value);
				n=n.next;
			}
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


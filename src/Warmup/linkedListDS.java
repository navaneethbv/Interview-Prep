package Warmup;

/*
 * Link:https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list 
 */	
/**
 * Implementation of linked List DS algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class linkedListDS {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node n=new Node();
		n.data=1;
		n.next=new Node();
		n.next.data=2;
		n=Insert(n,3);
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as */
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node {
		int data;
		Node next;
	}
	/**/
	static Node Insert(Node head,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		Node n=head;
		while(n!=null && n.next!=null)
		{
			n=n.next;    
		}
		n.next=new Node();
		n.next.data=data;
		n.next.next=null;
		return head;
	}


}
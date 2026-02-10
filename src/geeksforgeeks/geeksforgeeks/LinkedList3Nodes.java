package geeksforgeeks;

/**
 * Implementation of Linked List3 Nodes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LinkedList3Nodes {
	Node head; // head of list 	
	/* The linked list node is made static so that it becomes available from the main fucntion*/
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node 
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		LinkedList3Nodes llist = new LinkedList3Nodes();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
	}
}

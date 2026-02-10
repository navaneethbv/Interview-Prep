package geeksforgeeks;

public class LinkedList3Nodes {
	Node head; // head of list 	
	/* The linked list node is made static so that it becomes available from the main fucntion*/
	static class Node 
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
		}
	}
	public static void main(String[] args) {
		LinkedList3Nodes llist = new LinkedList3Nodes();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
	}
}

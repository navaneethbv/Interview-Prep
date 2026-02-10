package hackerRank.DataStructures.LinkedList;

/*
 * Link:https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
 */

/**
 * Implementation of Print Elements algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintElements {

	void Print(Node head) {
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	class Node{
		Node next;
		int data;
	}
}

package hackerRank.DataStructures.LinkedList;

/*
 * Link:https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
 */

/**
 * Implementation of Delete Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DeleteNode {

	Node Delete(Node head, int position) {
		Node headNode=head;
		if(head==null)
			return head;
		if(position==0)
			return head!=null?head.next:null;
		else{
			while(position>1)
			{
				position--;
				head=head.next;
			}
			head.next=head.next!=null?head.next.next:null;
		}
		return headNode;
	}
	class Node{
		Node next;
		int data;
	}
}

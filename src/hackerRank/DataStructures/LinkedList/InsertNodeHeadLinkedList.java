package hackerRank.DataStructures.LinkedList;

/*
 * Link:https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
 */

/**
 * Implementation of Insert Node Head Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InsertNodeHeadLinkedList {

	Node Insert(Node head,int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=head;
		return newNode;
	}
	class Node{
		Node next;
		int data;
	}
}

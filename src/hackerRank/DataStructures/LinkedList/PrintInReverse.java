package hackerRank.DataStructures.LinkedList;

import java.util.Stack;

/*
 * Link:https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse
 */

/**
 * Implementation of Print In Reverse algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintInReverse {

	void ReversePrint(Node head) {
		Stack<Integer> stack=new Stack<>();
		while(head!=null)
		{
			stack.push(head.data);
			head=head.next;
		}
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}
	class Node{
		Node next;
		int data;
	}
}

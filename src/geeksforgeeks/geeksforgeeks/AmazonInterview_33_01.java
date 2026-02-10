package geeksforgeeks;

import ctci._02linkedList;
import ctci._02linkedList.Node;




/*
 * http://www.geeksforgeeks.org/amazon-interview-set-33-2/
 * Given a singly linked list, swap every 2 nodes,
 * for odd number of input; retain the last node as it is.
 * Eg: Input: 5 13 15 18 20 11 6 7
 * Output: 13 5 18 15 11 20 7 6
 */;
/**
 * Implementation of Amazon Interview_33_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_33_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _02linkedList linkedList=new _02linkedList();
		 linkedList.add(5);
		 linkedList.add(13);
		 linkedList.add(15);
		 linkedList.add(18);
		 linkedList.add(20);
		 linkedList.add(11);
		 linkedList.add(6);
		 linkedList.add(7);
		 System.out.println(linkedList.toString());		 
		 linkedList=swapTwoNodes(linkedList);
		 System.out.println(linkedList.toString());
	 }

	/**
	 * Performs swapTwoNodes operation.
	 *
	 * @param linkedList the linkedList parameter
	 * @return the list of results
	 */
	private static _02linkedList swapTwoNodes(_02linkedList linkedList) {
		Node pointerNode=linkedList.getHeadNode();
		while(pointerNode!=null && pointerNode.next!=null)
		{
			pointerNode.data=pointerNode.data^pointerNode.next.data;
			pointerNode.next.data=pointerNode.data^pointerNode.next.data;
			pointerNode.data=pointerNode.data^pointerNode.next.data;
			// Check for null/base case
			if(pointerNode.next!=null && pointerNode.next.next!=null)
				pointerNode=pointerNode.next.next;
			else
				break;
			
		}
		return linkedList;
	}


 }
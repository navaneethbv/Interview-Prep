package ctci;

import java.io.InputStreamReader;
import java.util.Scanner;

import ctci._02linkedList.Node;

/*Implementation of CTCI 2.6//Implementation only*/
/**
 * Implementation of Linked List_5 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LinkedList_5 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs checkLoop operation.
	 *
	 * @param linkedList the linkedList parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkLoop(_02linkedList linkedList) {
		Node fastPointerNode=linkedList.getHeadNode();
		Node slowPointerNode=linkedList.getHeadNode();
		while(fastPointerNode.next!=null && fastPointerNode!=slowPointerNode){
			fastPointerNode=fastPointerNode.next;
			// Check for null/base case
			if(fastPointerNode!=null)
				fastPointerNode=fastPointerNode.next;
			else{
				return false;
			}
			slowPointerNode=slowPointerNode.next;
		}
		slowPointerNode=linkedList.getHeadNode();
		while(slowPointerNode!=fastPointerNode){
			slowPointerNode=slowPointerNode.next;
			fastPointerNode=fastPointerNode.next;
		}
		System.out.println("Starting element is : "+slowPointerNode.data);
		return true;	
	}

}

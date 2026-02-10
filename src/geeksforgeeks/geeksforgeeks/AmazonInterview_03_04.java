package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;

import ctci._02linkedList;
import ctci._02linkedList.Node;




/*
 * http://www.geeksforgeeks.org/amazon-interview-set-2/
 * You are given a linked list and a parameter k. You will have to swap values in a certain fashion,do it without swapping the values.
 * If you want a swap to occur between two nodes, then you will have to move the nodes itself.
 */
/**
 * Implementation of Amazon Interview_03_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_03_04 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_02linkedList linkedList=new _02linkedList();
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int k=Integer.parseInt(scanner.nextLine());
		scanner.close();
		for (int i = 0; i < 3*k; i++) {
			linkedList.add(i+1);
		}
		System.out.println(linkedList.toString());
		linkedList=replaceValues(linkedList,k);
		System.out.println(linkedList.toString());
	}

	/**
	 * Performs replaceValues operation.
	 *
	 * @param linkedList the linkedList parameter
	 * @param k the k value
	 * @return the list of results
	 */
	private static _02linkedList replaceValues(_02linkedList linkedList,int k) {
		// TODO Auto-generated method stub
		Node slowPointerNode=linkedList.getHeadNode();
		Node fastPointerNode=linkedList.getHeadNode();
		while(fastPointerNode!=null){
			fastPointerNode=movePointer(k, fastPointerNode);
			// Check for null/base case
			if(fastPointerNode==null)
				break;
			Node temporaryNode=fastPointerNode;
			int data=fastPointerNode.data;
			fastPointerNode.data=slowPointerNode.data;
			fastPointerNode=slowPointerNode;
			slowPointerNode.data=data;
			slowPointerNode=temporaryNode;
			slowPointerNode=movePointer(k, slowPointerNode);
		}
		return linkedList;
	}

	/**
	 * Performs movePointer operation.
	 *
	 * @param k the k value
	 * @param fastPointerNode the fastPointerNode parameter
	 * @return the Node result
	 */
	private static Node movePointer(int k, Node fastPointerNode) {
		for (int i = 0; i < k; i++) {
			// Check for null/base case
			if(fastPointerNode==null)
				return null;
			fastPointerNode=fastPointerNode.next;
		}
		return fastPointerNode;
	}




}
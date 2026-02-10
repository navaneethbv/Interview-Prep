package ctci;

import java.io.InputStreamReader;
import java.util.Scanner;

import ctci._02linkedList.Node;




/*Implementation of CTCI 2.2*/
/**
 * Implementation of Linked List_2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LinkedList_2 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter K value");
		int k=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter linked list size");
		int noOfElements=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter single spaced elements");
		_02linkedList linkedList=new _02linkedList();
		String stringArray[]=scanner.nextLine().split(" ");
		for (int i = 0; i < noOfElements; i++) {
			linkedList.add(Integer.parseInt(stringArray[i]));
		}
		scanner.close();
		int kthLastElement=getKthLastElement(linkedList,k);
		System.out.println("Kth to last element is : "+kthLastElement);
	}

	/**
	 * Retrieves kth last element from the data structure.
	 *
	 * @param linkedList the linkedList parameter
	 * @param k the k value
	 * @return the computed integer result
	 */
	private static int getKthLastElement(_02linkedList linkedList, int k) {
		if(k>linkedList.size())
			return Integer.MIN_VALUE;
		Node pointerOneNode=linkedList.getHeadNode();
		Node pointerTwoNode=linkedList.getHeadNode();
		for (int i = 0; i < k; i++) {
			pointerOneNode=pointerOneNode.next;
		}
		while (pointerOneNode.next!=null) {
			pointerOneNode=pointerOneNode.next;
			pointerTwoNode=pointerTwoNode.next;
		}
		return pointerTwoNode.data;
	}
}

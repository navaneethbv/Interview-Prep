package ctci;

import java.io.InputStreamReader;
import java.util.Scanner;

/*Implementation of CTCI 2.4*/
/**
 * Implementation of Linked List_3 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LinkedList_3 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter Singly spaced elements");
		String inputStringArray[]=scanner.nextLine().split(" ");
		_02linkedList linkedList=new _02linkedList();
		for (int i = 0; i < inputStringArray.length; i++) {
			linkedList.add(Integer.parseInt(inputStringArray[i]));
		}
		System.out.println("Enter Pivot");
		int pivot=Integer.parseInt(scanner.nextLine());
		scanner.close();
		_02linkedList dividedLinkedList=divideLinkedList(linkedList,pivot);
		for (int i = 0; i < dividedLinkedList.size(); i++) {
			System.out.print(dividedLinkedList.get(i)+" ");
		}
	}

	private static _02linkedList divideLinkedList(_02linkedList linkedList,
			int pivot) {
		_02linkedList mainList=new _02linkedList();
		int pivotCounter=0;
		for (int i = 0; i < linkedList.size(); i++) {
			int value=linkedList.get(i);
			if(value<pivot)
				mainList.add(value);
			else if(value==pivot)
				pivotCounter+=1;
		}
		for (int i = 0; i < pivotCounter; i++) {
			mainList.add(pivot);
		}
		for (int i = 0; i < linkedList.size(); i++) {
			int value=linkedList.get(i);
			if(value>pivot)
				mainList.add(value);
		}
		return mainList;	}
}

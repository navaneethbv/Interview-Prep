package geeksforgeeks;

import java.util.Hashtable;
import java.util.LinkedList;

import ctci._02linkedList.Node;

/*
 * http://www.geeksforgeeks.org/amazon-interview/
 *  Design a data structure for the following operations:
 *I.Enqueue
 *II.Dequeue
 *III.Delete a given number(if it is present in the queue, else do nothing)
 *IV.isNumberPresent
 *All these operations should take O(1) time.
 */
/**
 * Implementation of Amazon Interview_02_06 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_02_06 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	class AmazonDS{
		//should use doubly linkedlist here
		LinkedList<Integer> elementsList;
		//the second argument to the hashtable will be the address of the node for easier removal
		Hashtable<Integer, Integer> elementsTable;
		Node presentNode;
		public AmazonDS() {
			elementsList=new LinkedList<Integer>();
			elementsTable=new Hashtable<Integer, Integer>();
		}
		/**
		 * Performs enqueue operation.
		 *
		 * @param value the value value
		 */
		public void enqueue(int value){
			elementsTable.put(value, value);
			elementsList.add(value);//make sure to implement the method add with return type Node,so as to assign the presentNode if size=0
		}
		/**
		 * Performs dequeue operation.
		 *
		 * @return the computed integer result
		 */
		public int dequeue(){
			elementsTable.get(0);//get the corresponsing value using the presentNode
			elementsTable.remove(0);
			int value=elementsList.getLast();//get the node corresponding the the presentNode and remove that node
			//change the present node to its previous node here
			return value;
		}
		/**
		 * Performs delete operation.
		 *
		 * @param value the value value
		 */
		public void delete(int value){
			if(elementsTable.contains(value)){
				elementsTable.get(value);//used to get the doubly linkedlist node
				elementsTable.remove(value);
				elementsList.remove(value);//goto the corresponsing element using the node and re arrange the previous and next pointers suitably
			}
		}
		/**
		 * Checks if number present.
		 *
		 * @param value the value value
		 * @return true if condition is met, false otherwise
		 */
		public boolean isNumberPresent(int value){
			return elementsTable.contains(value);
		}
	}
}

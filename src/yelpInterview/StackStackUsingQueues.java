package yelpInterview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of Stack Stack Using Queues algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StackStackUsingQueues {
	static Queue<Integer> q1=new LinkedList<>();
	static Queue<Integer> q2=new LinkedList<>();

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		push(10);
		push(20);
		push(30);
		push(40);
		System.out.println(pop());
		push(30);
		push(40);
		System.out.println(pop());
	}

	/**
	 * Performs pop operation.
	 *
	 * @return the computed integer result
	 */
	private static int pop() {
		for (int i = 0; i < q1.size(); i++) {
			q2.add(q1.remove());
		}
		int element=q2.remove();
		for (int i = 0; i < q2.size(); i++) {
			q1.add(q2.remove());
		}
		return element;
	}

	/**
	 * Performs push operation.
	 *
	 * @param i the i parameter
	 */
	private static void push(int i) {
		q1.add(i);
	}



}


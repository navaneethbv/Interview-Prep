package yelpInterview;

import java.util.Stack;

/**
 * Implementation of Queue Queue Using Stacks algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class QueueQueueUsingStacks {
	static Stack<Integer> stack1=new Stack<>();
	static Stack<Integer> stack2=new Stack<>();
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		System.out.println(dequeue());
		enqueue(60);
		System.out.println(dequeue());
	}

	/**
	 * Performs dequeue operation.
	 *
	 * @return the computed integer result
	 */
	private static int dequeue() {
		if(stack1.isEmpty())
			return -1;
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
		}
		int element=stack2.pop();
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
		}
		return element;
	}

	/**
	 * Performs enqueue operation.
	 *
	 * @param i the i parameter
	 */
	private static void enqueue(int i) {
		stack1.push(i);
	}

}


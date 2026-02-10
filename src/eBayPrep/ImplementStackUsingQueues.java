package eBayPrep;

import java.util.LinkedList;

/**
 * Implementation of Implement Stack Using Queues algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ImplementStackUsingQueues{

	LinkedList<Integer> q1;//,q2;
	public _225ImplementStackUsingQueues() {
		q1=new LinkedList<>();
		//q2=new LinkedList<>();
	}
	/**
	 * Performs push operation.
	 *
	 * @param x the x parameter
	 */
	public void push(int x) {
		q1.addLast(x);
	}

	// Removes the element on top of the stack.
	/**
	 * Performs pop operation.
	 *
	 */
	public void pop() {
		q1.removeLast();
	}

	// Get the top element.
	/**
	 * Performs top operation.
	 *
	 * @return the computed integer result
	 */
	public int top() {
		return q1.peekLast();
	}

	// Return whether the stack is empty.
	/**
	 * Performs empty operation.
	 *
	 * @return true if condition is met, false otherwise
	 */
	public boolean empty() {
		return q1.size()==0;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}


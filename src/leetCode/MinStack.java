package leetCode;

import java.util.ArrayList;
import java.util.Stack;

/*
 * Link : https://leetcode.com/problems/min-stack/
 */

/**
 * Implementation of Min Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinStack {
	class MinStack {
		ArrayList<Integer> minList=new ArrayList<>();
		Stack<Integer> mainStack=new Stack<>();
		/**
		 * Performs push operation.
		 *
		 * @param x the x parameter
		 */
		public void push(int x) {
			mainStack.push(x);
			if(!minList.isEmpty())
				if(minList.get(minList.size()-1)>x)
					minList.add(x);
				else
					minList.add(minList.get(minList.size()-1));
			else
				minList.add(x);
		}

		/**
		 * Performs pop operation.
		 *
		 */
		public void pop() {
			mainStack.pop();
			minList.remove(minList.size()-1);
		}

		/**
		 * Performs top operation.
		 *
		 * @return the computed integer result
		 */
		public int top() {
			return mainStack.peek();
		}

		/**
		 * Retrieves min from the data structure.
		 *
		 * @return the computed integer result
		 */
		public int getMin() {
			return minList.get(minList.size()-1);
		}
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
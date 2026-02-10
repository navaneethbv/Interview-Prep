package servicenowPrep;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of Implement Stack Using Queues algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ImplementStackUsingQueues {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		MyStack m=new MyStack();
		m.push(1);
		m.push(2);
		m.push(3);
		System.out.println(m.pop());
	}

	/**
	 * Inner class MyStack for supporting operations.
	 */
	static class MyStack{
		Queue<Integer> queue1=new LinkedList<>();
		Queue<Integer> queue2=new LinkedList<>();
		/**
		 * Performs push operation.
		 *
		 * @param x the x parameter
		 */
		public void push(int x)
		{
			queue1.add(x);
		}
		/**
		 * Performs pop operation.
		 *
		 * @return the computed integer result
		 */
		public int pop()
		{
			while(!queue1.isEmpty())
			{
				queue2.add(queue1.remove());
			}
			int value=queue2.remove();
			while(!queue2.isEmpty())
			{
				queue1.add(queue2.remove());
			}
			return value;
		}
	}

}

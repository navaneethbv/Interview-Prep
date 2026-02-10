package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Queue Using Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class QueueUsingStack {
	
	/**
	 * Inner class MyQueue for supporting operations.
	 */
	static class MyQueue{
		Stack<Integer> stack1=new Stack<>();
		Stack<Integer> stack2=new Stack<>();
		/**
		 * Performs enqueue operation.
		 *
		 * @param value the value value
		 */
		public void enqueue(int value)
		{
			stack1.push(value);
		}
		/**
		 * Performs dequeue operation.
		 *
		 * @return the computed integer result
		 */
		public int dequeue()
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
			int value=stack2.pop();
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
			return value;
		}
		
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		MyQueue m=new MyQueue();
		m.enqueue(1);
		m.enqueue(2);
		m.enqueue(3);
		System.out.println(m.dequeue());
		
	}
	

	

}

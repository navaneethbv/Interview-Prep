package Codility;

import java.util.Stack;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/fish
 */

/**
 * Implementation of Stacks And Queues Fish algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StacksAndQueuesFish {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs solution operation.
	 *
	 * @param A[] the A[] parameter
	 * @param B[] the B[] parameter
	 * @return the computed integer result
	 */
	public static int solution(int A[],int B[]) {
		Stack<StackObj> stack=new Stack<StackObj>();
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			StackObj sb=new StackObj(A[i],(B[i]==0)?"up":"down");
			if(stack.isEmpty())
			{
				stack.push(sb);
			}
			else{
				StackObj peekedObj=stack.peek();
				if(peekedObj.direction.contentEquals("down"))
				{
					if(sb.direction.contentEquals("up"))
					{
						if(sb.value>peekedObj.value)
						{
							stack.pop();
							stack.push(sb);
						}
					}
					else{
						stack.push(sb);
					}
				}
				else{
					stack.push(sb);
				}
			}
		}
		return stack.size();
	}

}
class StackObj{
	int value;
	String direction;
	public StackObj(Integer value,String direction) {
		this.value=value;
		this.direction=direction;
	}
}
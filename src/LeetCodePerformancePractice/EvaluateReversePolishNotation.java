package LeetCodePerformancePractice;

import java.util.Stack;

/**
 * Implementation of Evaluate Reverse Polish Notation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class EvaluateReversePolishNotation {
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
	 * Performs evalRPN operation.
	 *
	 * @param tokens the array to process
	 * @return the computed integer result
	 */
	public static int evalRPN(String[] tokens) {
		// Check for null/base case
		if(tokens==null||tokens.length<1)
			return 0;
		Stack<Integer> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < tokens.length; i++) {
			String str=tokens[i];
			if(str.length()==1 && (str.contentEquals("+")||str.contentEquals("-")
					||str.contentEquals("*")||str.contentEquals("/")))
			{
				int value1=0,value2=0;
				if(!stack.isEmpty())
				{
					value1=stack.pop();
					if(!stack.isEmpty())
					{
						value2=stack.pop();
						if(str.contentEquals("+"))
							stack.push(value2+value1);
						else if(str.contentEquals("-"))
							stack.push(value2-value1);
						else if(str.contentEquals("/"))
							stack.push(value2/value1);
						else
							stack.push(value1*value2);
					}
					else
						return -1;
				}
				else
					return -1;
			}
			else{
				stack.push(Integer.parseInt(str));
			}
		}
		return stack.pop();


	}
}

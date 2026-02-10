package LeetCodePerformancePractice;

import java.util.Stack;

/**
 * Implementation of Longest Valid Parentheses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestValidParentheses {
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
	 * Performs longestValidParentheses operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int longestValidParentheses(String s) {
		Stack<int[]> stack=new Stack<>();
		int maxLength=Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(c=='(')
				stack.push(new int[]{i,0});
			else{
				if(stack.isEmpty()||stack.peek()[1]==1)
				{
					stack.push(new int[]{i,1});
				}
				else{
					stack.pop();
					int currLength=0;
					if(stack.isEmpty())
					{
						currLength=i+1;
					}
					else{
						currLength=i-stack.peek()[0];
					}
					maxLength=Math.max(currLength, maxLength);
				}
			}
		}
		return maxLength;
	}
}


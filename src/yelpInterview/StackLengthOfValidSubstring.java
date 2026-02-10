package yelpInterview;

import java.util.Stack;

/**
 * Implementation of Stack Length Of Valid Substring algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StackLengthOfValidSubstring {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds length in the data structure.
	 *
	 * @param str the str parameter
	 * @return the computed integer result
	 */
	private static int findLength(String str) {
		Stack<Integer> stack=new Stack<>();
		int result = 0;
		stack.push(-1);
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c=='(')
			{
				stack.push(i);
			}
			else{
				//if(!stack.isEmpty()){
					stack.pop();
					if (!stack.isEmpty())
						result = Math.max(result, i - stack.peek());
					else stack.push(i);
				//}
			}
		}
		return result;
	}

}


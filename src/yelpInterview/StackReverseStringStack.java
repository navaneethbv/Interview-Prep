package yelpInterview;

import java.util.Stack;

/**
 * Implementation of Stack Reverse String Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StackReverseStringStack {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs evaluate operation.
	 *
	 * @param string the string parameter
	 * @return the resulting string
	 */
	private static String evaluate(String string) {
		Stack<Character> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			stack.push(string.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		return sb.toString();
	}

}


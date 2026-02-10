package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Reverse A String Using Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseAStringUsingStack {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs reverseString operation.
	 *
	 * @param string the string parameter
	 * @return the resulting string
	 */
	private static String reverseString(String string) {
		Stack<Character> stack=new Stack<>();
		StringBuilder sb=new StringBuilder("");                                                                                                                       
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			stack.push(string.charAt(i));
		}
		while(!stack.isEmpty())
		{
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	


}

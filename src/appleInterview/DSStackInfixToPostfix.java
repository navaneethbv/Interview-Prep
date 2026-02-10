package appleInterview;

import java.util.Stack;

/**
 * Implementation of DS Stack Infix To Postfix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSStackInfixToPostfix {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs convertToPostfix operation.
	 *
	 * @param infix the infix parameter
	 * @return the resulting string
	 */
	private static String convertToPostfix(String infix) {
		StringBuilder output=new StringBuilder("");
		Stack<Character> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < infix.length(); i++) {
			char c=infix.charAt(i);
			switch(c)
			{
			case '+':handleStack(output, stack, c);
			break;
			case '-':handleStack(output, stack, c);
			break;
			case '*':handleStack(output, stack, c);
			break;
			case '/':handleStack(output, stack, c);
			break;
			case '(':stack.push(c);
			break;
			case ')':while(!stack.isEmpty() && stack.peek()!='(')
			{
				output.append(stack.pop());
			}
			break;
			default:output.append(c);
			break;
			}
		}
		return output.toString();
	}

	/**
	 * Performs handleStack operation.
	 *
	 * @param output the output parameter
	 * @param stack the stack parameter
	 * @param c the c parameter
	 */
	private static void handleStack(StringBuilder output, Stack<Character> stack, char c) {
		if(!stack.isEmpty())
		{	
			boolean b=checkPrec(c,stack.peek());
			if(b)
			{
				stack.push(c);
			}
			else{
				while(!stack.isEmpty() && checkPrec(c,stack.peek())){
					output.append(stack.pop());
				}
				stack.push(c);
			}
		}
		else{
			stack.push(c);
		}
	}

	/**
	 * Performs checkPrec operation.
	 *
	 * @param c the c parameter
	 * @param peek the peek parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkPrec(char c, Character peek) {
		return (c>peek);
	}
}

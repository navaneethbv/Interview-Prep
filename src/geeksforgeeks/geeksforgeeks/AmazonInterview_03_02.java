package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;



/*
 * http://www.geeksforgeeks.org/amazon-interview-set-2/
 * Parenthesis checker.
 */
/**
 * Implementation of Amazon Interview_03_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_03_02 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs checkParentheses operation.
	 *
	 * @param inputString the inputString parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkParentheses(String inputString) {
		// TODO Auto-generated method stub
		Stack<Character> stack=new Stack<Character>();
		// Iterate through all elements
		for (int i = 0; i < inputString.length(); i++) {
			Character c= inputString.charAt(i);
			if((c=='(')||(c=='{')||(c=='[')){
				stack.push(c);
			}
			else if((c==')')||(c=='}')||(c==']')){
				if(!stack.isEmpty() && (stack.peek()=='(' && c==')')||(stack.peek()=='{' && c=='}')||(stack.peek()=='[' && c==']')){
					stack.pop();
				}
				else{
					return false;
				}
			}
		}
		return true;
	}


}
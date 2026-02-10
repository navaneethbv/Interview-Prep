package hackerRank.Java.Collections;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/*
 * Link:https://www.hackerrank.com/challenges/java-stack
 */

/**
 * Implementation of Java Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaStack {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner((System.in));
		while(scanner.hasNext()){
			String inputString=scanner.nextLine();
			System.out.println(validateParentheses(inputString));
		}
	}

	/**
	 * Performs validateParentheses operation.
	 *
	 * @param inputString the inputString parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean validateParentheses(String inputString) {
		Stack<Character> charStack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < inputString.length(); i++) {
			char indexedChar=inputString.charAt(i);
			if(indexedChar=='('||indexedChar=='['||indexedChar=='{')
			{
				charStack.push(indexedChar);
			}
			else{
				if(charStack.isEmpty())
					return false;
				else
				{
					char poppedChar=charStack.pop();
					if((indexedChar==']' && poppedChar=='[')
							||(indexedChar=='}' && poppedChar=='{')
							||(indexedChar==')' && poppedChar=='('))
						continue;
					else
						return false;
				}
			}
		}
		return charStack.isEmpty();
	}
	}
package yelpInterview;

import java.util.Stack;

/**
 * Implementation of Stack Minimum Bracker Reversals algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StackMinimumBrackerReversals {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		System.out.println(findBracketReversals("}{"));
		System.out.println(findBracketReversals("{{{"));
		System.out.println(findBracketReversals("{{{{"));
		System.out.println(findBracketReversals("{{{{}}"));
		System.out.println(findBracketReversals("}{{}}{{{"));

	}

	/**
	 * Finds bracket reversals in the data structure.
	 *
	 * @param string the string parameter
	 * @return the computed integer result
	 */
	private static int  findBracketReversals(String string) {
		Stack<Character> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)=='{')
			{
				stack.push('{');
			}
			else{
				if(!stack.isEmpty() && stack.peek()=='{')
					stack.pop();
				else{
					stack.push(string.charAt(i));
				}
			}
		}

		int openingBraceCount=0;
		int size=stack.size();
		while(!stack.isEmpty()){
			if(stack.pop()=='{')
				openingBraceCount++;
		}
		return size/2+openingBraceCount%2;
	}

}

	}
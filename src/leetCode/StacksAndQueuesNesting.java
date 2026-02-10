package leetCode;

import java.util.Stack;

/*
 * Link : https://codility.com/programmers/task/nesting
 */

/**
 * Implementation of Stacks And Queues Nesting algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StacksAndQueuesNesting {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println("(()(())())"+solution("(()(())())"));
		System.out.println(""+solution(""));
		System.out.println("(U)"+solution("(U)"));
		System.out.println("VW"+solution("VW"));
		System.out.println("())"+solution("())"));
		
	}
	/**
	 * Performs solution operation.
	 *
	 * @param str the str parameter
	 * @return the computed integer result
	 */
	public static int solution(String str){
		Stack<Character> charStack=new Stack<Character>();
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c=='(' || c=='{'|| c=='[')
			{
				charStack.push(c);
			}
			else if(c==')' || c=='}'|| c==']')
			{
				if(charStack.isEmpty())
					return 0;
				else
				{
					char poppedChar=charStack.pop();
					if(!(c==')' && poppedChar=='(')||
							(c==']' && poppedChar=='[')||
							(c=='}' && poppedChar=='{'))
						return 0;
				}
			}
		}
		return 1;
	}
}
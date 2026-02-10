package appleInterview;

import java.util.Stack;

/**
 * Implementation of DS Stack Evaluate Post Fix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSStackEvaluatePostFix {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}
	/**
	 * Performs evaluatePostfix operation.
	 *
	 * @param postfix the postfix parameter
	 * @return the computed integer result
	 */
	private static int evaluatePostfix(String postfix) {
		Stack<Integer> charStack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < postfix.length(); i++) {
			char c=postfix.charAt(i);
			switch(c){
			case '+':performOperation(charStack,c);break;
			case '-':performOperation(charStack,c);break;
			case '*':performOperation(charStack,c);break;
			case '/':performOperation(charStack,c);break;
			default:charStack.push(Integer.parseInt(c+""));
			break;
			}
		}
		return charStack.isEmpty()?0:Integer.parseInt(charStack.peek()+"");
	}
	/**
	 * Performs performOperation operation.
	 *
	 * @param charStack the charStack parameter
	 * @param c the c parameter
	 */
	private static void performOperation(Stack<Integer> charStack,Character c) {
		if(!charStack.isEmpty())
		{	
			int a=Integer.parseInt(charStack.pop()+"");
			if(!charStack.isEmpty())
			{
				int b=Integer.parseInt(charStack.pop()+"");
				switch(c){
				case '+':charStack.push((a+b));break;
				case '-':charStack.push((b-a));break;
				case '*':charStack.push((a*b));break;
				case '/':charStack.push((a/b));break;
				default:break;
				}
			}
		}
	}
}

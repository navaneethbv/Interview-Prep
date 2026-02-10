package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Evaluation Of Postfix Expression algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class EvaluationOfPostfixExpression {
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
	 * @param string the string parameter
	 * @return the computed integer result
	 */
	private static int evaluatePostfix(String string) {
		Stack<Integer> stack=new Stack<Integer>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if(Character.isDigit(c))
			{
				stack.push(Integer.parseInt(c+""));
			}
			else{
				if(!stack.isEmpty())
				{
					int valueA=stack.pop();
					if(!stack.isEmpty())
					{
						int valueB=stack.pop();
						if(c=='+')
							stack.push(valueA+valueB);
						else if(c=='-')
							stack.push(-valueA+valueB);
						else if(c=='/')
							stack.push(valueB/valueA);
						else if(c=='*')
							stack.push(valueA*valueB);
					}
				}
			}
		}
		return stack.pop();
	}

}

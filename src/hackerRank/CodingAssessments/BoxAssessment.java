package hackerRank.CodingAssessments;

import java.util.Stack;

/**
 * Implementation of Box Assessment algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BoxAssessment {
	/**
	 * Performs rpn_calculate operation.
	 *
	 * @param tokens the array to process
	 */
	static void rpn_calculate(String[] tokens){
		Stack<String> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < tokens.length; i++) {
			boolean exceptionFlag=false;
			try{
				int x=Integer.parseInt(tokens[i]);
				stack.push(x+"");
			}
			catch(NumberFormatException n){
				exceptionFlag=true;
			}
			finally{
				if(exceptionFlag)
				{
					if(!stack.isEmpty()){
						int value2=Integer.parseInt(stack.pop());
						if(!stack.isEmpty()){
							int value1=Integer.parseInt(stack.pop());
							String result=handleInput(value1,value2,tokens[i]);
							if(result.contentEquals("Error"))
							{
								System.out.println("Invalid Input");
								System.exit(0);
							}
							else{
								stack.push(result);
							}
						}
						else{
							System.out.println("Invalid Input");
							System.exit(0);
						}
					}
					else{
						System.out.println("Invalid Input");
						System.exit(0);
					}
				}
			}
		}
		System.out.println(stack.peek());
	}

	/**
	 * Performs handleInput operation.
	 *
	 * @param value1 the value1 parameter
	 * @param value2 the value2 parameter
	 * @param string the string parameter
	 * @return the resulting string
	 */
	private static String handleInput(int value1, int value2, String string) {
		String output;
		switch(string){
		case "+":output=value1+value2+"";
		break;
		case "-":output=value1-value2+"";
		break;
		case "*":output=value1*value2+"";
		break;
		case "/":output=value1/value2+"";
		break;
		default:output="Error";
		break;
		}
		return output;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}
}

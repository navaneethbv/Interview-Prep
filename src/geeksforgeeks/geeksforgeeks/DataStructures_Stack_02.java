package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;



/*
 * http://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
 * Reverse a stack using recursion
 */;
/**
 * Implementation of Data Structures_ Stack_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_Stack_02 {	 
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 String inputString="darshan";//scanner.nextLine();
		 scanner.close();
		 Stack<Character> stack=new Stack<Character>();
		 stack=addToStack(inputString,stack);
		 System.out.println(stack.toString());
		 reverseStackRecursion(stack);
		 System.out.println(stack.toString());

	 }

	 /**
	  * Performs reverseStackRecursion operation.
	  *
	  * @param stack the stack parameter
	  */
	 private static void reverseStackRecursion(Stack<Character> stack) {
		 if(stack.isEmpty()) 
			 return;
	     Character temp = stack.pop();
	     reverseStackRecursion(stack);
	     insert_at_bottom(stack,temp);
	 }

	 /**
	  * Performs insert_at_bottom operation.
	  *
	  * @param stack the stack parameter
	  * @param data the data parameter
	  */
	 private static void insert_at_bottom(Stack<Character> stack, Character data) {
		 if(stack.isEmpty()){
	          stack.push(data);
	          return;
	     }
	     Character temp=stack.pop();
	     insert_at_bottom(stack,data);
	     stack.push(temp);
	 }

	/**
	 * Adds to stack to the data structure.
	 *
	 * @param inputString the inputString parameter
	 * @param stack the stack parameter
	 * @return the Stack<Character> result
	 */
	private static Stack<Character> addToStack(String inputString,Stack<Character> stack) {
		 // Iterate through all elements
		 for (int i = 0; i < inputString.length(); i++) {
			 stack.push(inputString.charAt(i));
		 }
		 return stack;
	}


 }

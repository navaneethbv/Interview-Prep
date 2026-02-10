package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/*
 * http://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 * Check for balanced parentheses in an expression
 */;
/**
 * Implementation of Data Structures_ Stack_03 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_Stack_03 {	 
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
		 Stack<Character> charStack=new Stack<Character>();
		 // Iterate through all elements
		 for (int i = 0; i < inputString.length(); i++) {
			 char element=inputString.charAt(i);
			 if(element=='[' || element=='{'||element=='(')
			 {
				 charStack.push(element);
			 }
			 else{
				 char poppedElement=charStack.pop();
				 if((element==']' && poppedElement!='[')||
						 (element=='}' && poppedElement!='{')||
						 (element==')' && poppedElement!='('))
				 {
					 return false;
				 }
			 }
		 }
		 return true;
	 }

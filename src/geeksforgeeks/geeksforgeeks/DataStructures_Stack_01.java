package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;



/*
 * http://geeksquiz.com/stack-set-3-reverse-string-using-stack/
 * Reverse a string using stack
 */;
/**
 * Implementation of Data Structures_ Stack_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_Stack_01 {	 
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	 /**
	  * Performs reverseString operation.
	  *
	  * @param inputString the inputString parameter
	  * @return the resulting string
	  */
	 private static String reverseString(String inputString) {
		 Stack<Character> characterStack=new Stack<Character>();
		 // Iterate through all elements
		 for (int i = 0; i < inputString.length(); i++) {
			 characterStack.push(inputString.charAt(i));
		 }
		 String outputString="";
		 while(!characterStack.isEmpty())
		 {
			 outputString+=characterStack.pop();
		 }
		 return outputString;
	 }
 }

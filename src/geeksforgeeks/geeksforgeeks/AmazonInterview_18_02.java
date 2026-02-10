package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


/*
 * http://www.geeksforgeeks.org/amazon-interview-set-18/
 * Convert postfix to infix in which the result must be having minimum number of braces i.e apply braces whenever necessary.
 */;
/**
 * Implementation of Amazon Interview_18_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_18_02 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	 /**
	  * Performs convertToInfix operation.
	  *
	  * @param inputString the inputString parameter
	  * @return the resulting string
	  */
	 private static String convertToInfix(String inputString) {
		 int index=0;
		 Stack<String> stack=new Stack<String>();
		 String inputStringArray[]=inputString.split(" ");
		 while(index<inputStringArray.length){
			 String characterElement=inputStringArray[index];
			 char character=characterElement.charAt(0);
			 if(character=='^'||character=='+'||character=='-'||character=='/'||character=='*')
			 {
				 String first=stack.pop();
				 String second=stack.pop();
				 
				 stack.push("("+second+character+first+")");	
			 }
			 else{
				 stack.push(characterElement);
			 }
			 index++;
		 }
		 return stack.pop();
	 }
 }
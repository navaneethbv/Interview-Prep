package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-35/
 * Convert a n-byte integer from little endian to big endian.
 */;
/**
 * Implementation of Amazon Interview_35_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_35_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	 /**
	  * Performs convertToBigEndianStack operation.
	  *
	  * @param input the input parameter
	  * @return the resulting string
	  */
	 private static String convertToBigEndianStack(Integer input) {
		 String inputString=Integer.toHexString(input);
		 System.out.println("Input string is : "+inputString);
		 Stack<String> stack=new Stack<String>();
		 String outputString="";
		 // Iterate through all elements
		 for (int i = 0; i < inputString.length(); i=i+2) {
			 if(i+1<inputString.length())
				 stack.push(inputString.substring(i,i+2));
			 else
				 stack.push(inputString.substring(i,i+1));
		 }
		 while(!stack.isEmpty()){
			 outputString+=stack.pop();
		 }
		 return outputString;
	 }
 }
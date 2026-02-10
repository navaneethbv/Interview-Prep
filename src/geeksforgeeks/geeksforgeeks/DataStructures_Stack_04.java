package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/*
 * http://geeksquiz.com/stack-set-2-infix-to-postfix/
 * Infix to Postfix
 */;
/**
 * Implementation of Data Structures_ Stack_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_Stack_04 {	 
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	 /**
	  * Performs convertToPostfix operation.
	  *
	  * @param inputString the inputString parameter
	  * @return the resulting string
	  */
	 private static String convertToPostfix(String inputString) {
		 Stack<Character> stack=new Stack<Character>();
		 StringBuilder sb=new StringBuilder();
		 HashMap<Character,Integer> precedenceMap=new HashMap<Character,Integer>();
		 precedenceMap.put('+',1);
		 precedenceMap.put('-',1);
		 precedenceMap.put('*',2);
		 precedenceMap.put('/',3);
		 precedenceMap.put('^',4);
		 precedenceMap.put('(',5);
		 precedenceMap.put(')',5);

		 // Iterate through all elements
		 for (int i = 0; i < inputString.length(); i++) {
			 char element=inputString.charAt(i);
			 if((element+"").matches("^[a-z0-9]"))
			 {
				 System.out.print(element+"//");
			 }
			 else{
				 if(stack.isEmpty())
					 stack.push(element);
				 else 
				 {	
					 if(element!='(' && element!=')')
					 {
						 char poppedElement=stack.peek();
						 int poppedPrecedence=precedenceMap.get(poppedElement);
						 if(poppedPrecedence<=precedenceMap.get(element))
						 {
							 stack.push(element);
						 }
						 else{
							 while(!stack.isEmpty()){
								 if(precedenceMap.get(stack.peek())<precedenceMap.get(element)){
									 stack.pop();
									 stack.push(element);
									 break;
								 }
								 else{
									 stack.pop();
								 }
							 }
						 }
					 }
					 else if(element=='(')
						 stack.push('(');
					 else if(element==')')
					 {
						 int poppedElem=stack.pop();
						 System.out.println(poppedElem);
						 while(poppedElem!='('){
							 poppedElem=stack.pop();
							 System.out.print(poppedElem);
						 }
					 }

				 }

			 }

		 }

		 return null;
	 }
 }

package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;





/*
 * http://www.geeksforgeeks.org/amazon-interview-set-22/
 * Code for converting floating point decimal number to binary numbers.
 * If the number cannot be converted, state so.
 */;
/**
 * Implementation of Amazon Interview_22_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_22_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 Float inputNumber=Float.parseFloat(scanner.nextLine());
		 scanner.close();
		 System.out.println(inputNumber);
		 convertToBinary(inputNumber);
	 }

	 /**
	  * Performs convertToBinary operation.
	  *
	  * @param inputNumber the inputNumber parameter
	  */
	 private static void convertToBinary(Float inputNumber) {
		 String inputString=String.valueOf(inputNumber);
		 Integer numberPart=Integer.parseInt(inputString.substring(0,inputString.indexOf('.')));
		 Float decimalPart=Float.parseFloat(inputString.substring(inputString.indexOf('.'),inputString.length()));
		 String strBefore=getBinaryBefore(numberPart);
		 String strAfter=getBinaryAfter(decimalPart);
		 System.out.println(strBefore+"."+strAfter);		
	 }

	 /**
	  * Retrieves binary after from the data structure.
	  *
	  * @param decimalPart the decimalPart parameter
	  * @return the resulting string
	  */
	 private static String getBinaryAfter(Float decimalPart) {
		 Stack<String> stack=new Stack<String>();	
		 StringBuffer sb=new StringBuffer();
		 while(decimalPart!=1.0){
			 decimalPart=decimalPart*2;
			 stack.push(decimalPart.toString().split("")[1]);
			 sb.append(decimalPart.toString().split("")[1]);
			 decimalPart=Float.parseFloat(decimalPart.toString().substring(decimalPart.toString().indexOf('.'),decimalPart.toString().length()));
			 if(stack.size()>15)
				 break;
		 }
		 return sb.toString();
	 }

	 /**
	  * Retrieves binary before from the data structure.
	  *
	  * @param numberPart the numberPart parameter
	  * @return the resulting string
	  */
	 private static String getBinaryBefore(Integer numberPart) {
		 Stack<Integer> stack=new Stack<Integer>();	
		 while(numberPart!=0){
			 stack.push(numberPart%2);
			 numberPart/=2;
		 }
		 StringBuffer sb=new StringBuffer();
		 while(!stack.isEmpty()){
			 sb.append(stack.pop());
		 }
		 return sb.toString();
	 }
 }
package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;





/*
 * http://www.geeksforgeeks.org/amazon-interview-set-8/
 * We have a huge file with braces () [just one type..] Find if they are balanced 
 * (stacks wouldnt work here because you will probably run out of memory storing the stack .
 */;
/**
 * Implementation of Amazon Interview_08_08 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_08_08 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 int size=Integer.parseInt(scanner.nextLine());
		 scanner.close();
		 String inputString="";
		 for (int i = 0; i < size*3; i++) {
			 if((i*(3*i+123)+"").hashCode()%(i+1)==0){
				 inputString+="(";
			 }
			 else{
				 inputString+=")";
			 }
		 }
		 System.out.println("Input is : "+ inputString);
		 System.out.println("Brace check results : "+braceCheck(inputString));
	 }

	 /**
	  * Performs braceCheck operation.
	  *
	  * @param inpuString the inpuString parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean braceCheck(String inpuString) {
		 int braceCount=0;
		 // Iterate through all elements
		 for (int i = 0; i < inpuString.length(); i++) {
			 if(inpuString.charAt(i)=='(')
				 braceCount++;
			 else if(inpuString.charAt(i)==')')
				 braceCount--;
			 if(braceCount<0)
				 return false;
		 }
		 if(braceCount!=0)
			 return false;
		 return true;
	 }
 }
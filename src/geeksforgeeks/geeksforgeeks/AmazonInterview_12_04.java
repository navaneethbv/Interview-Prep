package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-12/
 *  An expression is given.
 * [] can enclosed [], {} and ()
 * {} can enclosed {}, ()
 * () can enclosed only ()
 * Check that brackets in the expression are valid or not according to enclosing condition and opening closing condition.
 */;
/**
 * Implementation of Amazon Interview_12_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_12_04 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 String inputString=scanner.nextLine();
		 scanner.close();
		 System.out.println(inputString);
		 System.out.println("Input string balance condition ? "+checkBalance(inputString));
	 }

	 /**
	  * Performs checkBalance operation.
	  *
	  * @param inputString the inputString parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean checkBalance(String inputString) {
		 Boolean flowerBrace=false,squareBrace=false,smallBrace=false;
		 int squareCounter=0,flowerCounter=0,smallCounter=0;
		 // Iterate through all elements
		 for (int i = 0; i < inputString.length(); i++) {
			 char character=inputString.charAt(i);
			 if(character=='['){
				 if(flowerBrace||smallBrace)
					 return false;
				 squareBrace=true;
				 squareCounter++;
			 }else if(character=='{'){
				 if(smallBrace)
					 return false;
				 flowerBrace=true;
				 flowerCounter++;
			 }else if(character=='('){
				 smallBrace=true;
				 smallCounter++;
			 }else if(character==']'){
				 squareCounter--;
				 // Check for null/base case
				 if(squareCounter==0)
					 squareBrace=false;
			 }else if(character=='}'){
				 flowerCounter--;
				 // Check for null/base case
				 if(flowerCounter==0)
					 flowerBrace=false;
			 }else if(character==')'){
				 smallCounter--;
				 // Check for null/base case
				 if(smallCounter==0)
					 smallBrace=false;
			 }

		 }
		 return (smallCounter==0 && flowerCounter==0 && squareCounter==0)?true:false;
	 }
 }
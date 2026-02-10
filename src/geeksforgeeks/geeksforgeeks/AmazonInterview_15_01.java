package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-16/
 * Given a number with the number of digits in the range of 10-50,
 * find the next higher permutation of the number.
 * If such a number doesnt exist, return -1.
 */;
/**
 * Implementation of Amazon Interview_15_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_15_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 String number=(scanner.nextLine());
		 scanner.close();
		 System.out.println("Number is : "+number);
		 System.out.println("Next Higher permuatation is : "+findNextHighestNumber(number));
	 }

	 /**
	  * Finds next highest number in the data structure.
	  *
	  * @param number the number parameter
	  * @return the resulting string
	  */
	 private static String findNextHighestNumber(String number) {
		 if(Integer.parseInt(number)<10 || Integer.parseInt(number)>50){
			 return "Number not in range of 10-50";
		 }
		 else{
			String numberArray[]=number.split("");
			if(Integer.parseInt(numberArray[2])>4){
				return "-1";
			}
			else{
				return numberArray[2]+numberArray[1];
			}
			
		 }
	 }
 }
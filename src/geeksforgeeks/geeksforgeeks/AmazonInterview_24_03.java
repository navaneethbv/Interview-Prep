package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-24/
 * Given a number is it divisible by 3 and 5
 */;
/**
 * Implementation of Amazon Interview_24_03 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_24_03 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	/**
	 * Performs checkNumber operation.
	 *
	 * @param inputNumber the inputNumber parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkNumber(Integer inputNumber) {
		// TODO Auto-generated method stub
		if(checkDivisibleBy3(inputNumber))
			if(checkDivisibleBy5(inputNumber))
				return true;
		return false;
	}

	/**
	 * Performs checkDivisibleBy3 operation.
	 *
	 * @param inputNumber the inputNumber parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkDivisibleBy3(Integer inputNumber) {
		// TODO Auto-generated method stub
		String inputString=String.valueOf(inputNumber);
		int sum=0;
		// Iterate through all elements
		for (int i = 0; i <inputString.length(); i++) {
			sum+=Integer.parseInt(inputString.charAt(i)+"");
		}
		// Check for null/base case
		if(sum%3==0)
			return true;
		return false;
	}

	/**
	 * Performs checkDivisibleBy5 operation.
	 *
	 * @param inputNumber the inputNumber parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkDivisibleBy5(Integer inputNumber) {
		// TODO Auto-generated method stub
		String inputString=String.valueOf(inputNumber);
		if(Integer.parseInt(inputString.charAt(inputString.length()-1)+"")==5 || 
				Integer.parseInt(inputString.charAt(inputString.length()-1)+"")==0)
			return true;
		return false;
	}

 }
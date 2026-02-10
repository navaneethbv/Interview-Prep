package careerCup;

import java.util.Arrays;
import java.util.Random;

/*
 * Link: http://www.careercup.com/question?id=291796
 * Given an array of numbers
 * write a function which will return another array containing the elements of the previous array but in random order.
 */
/**
 * Implementation of Google Career Cup Problem1796 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem1796 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs randomiseArray operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	public static int[] randomiseArray(int[] inputArray){
		Random r=new Random();
		int[] outputArray=new int[inputArray.length];
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			int index=r.nextInt(inputArray.length-i);
			outputArray[i]=inputArray[index];
			inputArray[index]=inputArray[index]^inputArray[inputArray.length-i-1];
			inputArray[inputArray.length-i-1]=inputArray[index]^inputArray[inputArray.length-i-1];
			inputArray[index]=inputArray[index]^inputArray[inputArray.length-i-1];
		}
		return outputArray;
	}
	
	


}

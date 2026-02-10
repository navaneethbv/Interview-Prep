package geeksforgeeks;

import java.util.Arrays;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-23/
 * Given a Sorted array with one missing number.
 * I have to find first missing number.Code was required.
 * I gave solution with o(logn) time complexity.
 */;
/**
 * Implementation of Amazon Interview_23_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_23_02 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		int inputArray[]={1,2,3,4,5,7,8,9,10};
		System.out.println(Arrays.toString(inputArray));
		System.out.println(getMissingElementSorted(inputArray));
		int inputArray1[]={2, 3, 7, 6, 8,1,-1, -10, 15};
		System.out.println(getMissingElementUnSorted(inputArray1));
		
	 }

	/**
	 * Retrieves missing element un sorted from the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int getMissingElementUnSorted(int[] inputArray) {
		// TODO Auto-generated method stub
		Arrays.sort(inputArray);
		int element=inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if(inputArray[i]!=(element+1)&&element>=0)
				return inputArray[i-1]+1;
			else
				element=inputArray[i];
		}
		return -1;
	}

	/**
	 * Retrieves missing element sorted from the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int getMissingElementSorted(int[] inputArray) {//O(n)
		int element=inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if(inputArray[i]!=(element+1))
				return inputArray[i-1]+1;
			else
				element++;
		}
		return -1;
		
	}
 }
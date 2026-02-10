package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Algo Bubble Sort algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AlgoBubbleSort {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs bubbleSort operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] bubbleSort(int[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length-1; i++) {
			for (int j = 0; j < inputArray.length-i-1; j++) {
				if(inputArray[j]>inputArray[j+1])
				{
					int temp=inputArray[j];
					inputArray[j]=inputArray[j+1];
					inputArray[j+1]=temp;
				}
			}
		}
		return inputArray;
	}

}


package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Algo Selection Sort algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AlgoSelectionSort {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs selectionSort operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] selectionSort(int[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			int minIndex=i;
			for (int j = i+1; j < inputArray.length; j++) {
				if(inputArray[j]<inputArray[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=inputArray[i];
			inputArray[i]=inputArray[minIndex];
			inputArray[minIndex]=temp;
		}
		return inputArray;
	}


}


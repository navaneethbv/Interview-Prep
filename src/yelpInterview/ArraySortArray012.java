package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Sort Array012 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySortArray012 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs sortArrayDutch operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] sortArrayDutch(int[] inputArray) {
		int low=0,mid=0,high=inputArray.length-1;
		while(mid<=high)
		{
			switch(inputArray[mid])
			{
			case 0:inputArray[low]=inputArray[mid]^inputArray[low];
			inputArray[mid]=inputArray[mid]^inputArray[low];
			inputArray[low]=inputArray[mid]^inputArray[low];
			low++;mid++;
			break;
			case 1:mid++;break;
			case 2:inputArray[high]=inputArray[mid]^inputArray[high];
			inputArray[mid]=inputArray[mid]^inputArray[high];
			inputArray[high]=inputArray[mid]^inputArray[high];
			high--;;break;
			}
		}
		return inputArray;
	}






	/**
	 * Performs sortArray operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] sortArray(int[] inputArray) {
		int noOfZeros=0,noOfOnes=0,noOfTwos=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			// Check for null/base case
			if(inputArray[i]==0)
				noOfZeros++;
			else if(inputArray[i]==1)
				noOfOnes++;
			else
				noOfTwos++;
		}
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(noOfZeros>0){
				inputArray[i]=0;
				noOfZeros--;
			}
			else if(noOfOnes>0){
				inputArray[i]=1;
				noOfOnes--;
			}
			else
				inputArray[i]=2;
		}
		return inputArray;
	}

}
package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Segregate Even Odd Nos algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySegregateEvenOddNos {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs segregateNos operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] segregateNos(int[] inputArray) {
		int left=0;
		int right=inputArray.length-1;
		while(left<right)
		{
			while(inputArray[left]%2==0 )
			{
				left++;
			}
			while(inputArray[right]%2!=0)
			{
				right--;
			}
			if(left<right){
				inputArray[left]=inputArray[left] ^ inputArray[right];
				inputArray[right]=inputArray[left] ^ inputArray[right];
				inputArray[left]=inputArray[left] ^ inputArray[right];
			}
		}
		return inputArray;
	}

}
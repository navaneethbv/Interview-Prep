package yelpInterview;

import java.util.Arrays;
import java.util.Random;

/**
 * Implementation of Array Shuffle Given Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayShuffleGivenArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs shuffleArray operation.
	 *
	 * @param arr the array to process
	 * @return the resulting array
	 */
	private static int[] shuffleArray(int[] arr) {
		Random rand = new Random();
		for (int i = arr.length-1; i > 0; i--)
		{
			int j = rand.nextInt(i+1);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}
}
package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link: http://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
 */
/**
 * Implementation of Segregate Zeros Ones Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SegregateZerosOnesArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs segregateZeros operation.
	 *
	 * @param arr the array to process
	 */
	private static void segregateZeros(int[] arr) {
		int sum=0;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1)sum++;
		}
		Arrays.fill(arr, 0);
		for (int i = arr.length-1; i >=0; i--) {
			if(sum>0)
				arr[i]=1;
			sum--;
		}
	}

	

}

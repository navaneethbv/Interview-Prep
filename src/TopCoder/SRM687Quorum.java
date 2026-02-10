package TopCoder;

import java.util.Arrays;

/*
 * SRM 687 Div2
 * Link:
 */



/**
 * Implementation of SRM687 Quorum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM687Quorum {
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
	 * Counts the number of .
	 *
	 * @param arr the array to process
	 * @param k the k value
	 * @return the computed integer result
	 */
	public static int count(int[] arr, int k){
		Arrays.sort(arr);
		int count=0;
		for (int i = 0; i <k; i++) {
			count+=arr[i];
		}	
		return count;
	}

}

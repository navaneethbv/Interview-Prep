package Warmup;

import java.util.Arrays;

/**
 * Implementation of Service Now Prep66 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ServiceNowPrep66 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs inplaceMove operation.
	 *
	 * @param arr the array to process
	 * @return the resulting array
	 */
	private static int[] inplaceMove(int[] arr) {
		int index=arr.length-1;
		for (int i = arr.length-1;i>=0; i--) {
			// Check for null/base case
			if(arr[i]==0)
			{
				arr[index]=arr[i]^arr[index];
				arr[i]=arr[i]^arr[index];
				arr[index]=arr[i]^arr[index];
				index--;
			}
		}
		return arr;
	}
}


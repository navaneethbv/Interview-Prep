package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link: http://www.geeksforgeeks.org/maximum-difference-between-two-elements/
 */
/**
 * Implementation of max Difference Arrays algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class maxDifferenceArrays {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds max difference in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findMaxDifference(int[] arr) {
		int maxDifference=arr[1]-arr[0];
		int minElement=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]-minElement>maxDifference)
				maxDifference=arr[i]-minElement;
			if(arr[i]<minElement)
				minElement=arr[i];
		}
		return maxDifference;
	}

}

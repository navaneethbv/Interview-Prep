package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link:http://www.geeksforgeeks.org/two-elements-whose-sum-is-closest-to-zero/
 */
/**
 * Implementation of First And Second Smallest Elements Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FirstAndSecondSmallestElementsArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds min elements in the data structure.
	 *
	 * @param arr the array to process
	 * @return the resulting string
	 */
	private static String findMinElements(int[] arr) {
		int firstMin=Integer.MAX_VALUE,secondMin=Integer.MAX_VALUE;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<firstMin)
			{
				secondMin=firstMin;
				firstMin=arr[i];
			}
			else if(arr[i]<secondMin && arr[i]!=firstMin){
				secondMin=arr[i];
			}
		}
		return firstMin+"/"+secondMin;
	}


}

package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Find Triplet Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindTripletSum {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds triplet sum in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findTripletSum(int[] inputArray, int sum) {
		Arrays.sort(inputArray);
		// Iterate through all elements
		for (int i = 0; i < inputArray.length-2; i++) {
			int low=0;
			int high=inputArray.length-1;
			while(low<high){
				int outputSum=inputArray[i]+inputArray[low]+inputArray[high];
				if(outputSum==sum){
					System.out.println(inputArray[i]+"/"+inputArray[low]+"/"+inputArray[high]);
					return true;
				}
				if(outputSum>sum)
					high--;
				else
					low++;
			}
		}
		return false;
	}

}
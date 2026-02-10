package yelpInterview;

/**
 * Implementation of Array Largest Contiguous Sub Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayLargestContiguousSubArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds max sum in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMaxSum(int[] inputArray) {
		int maxSoFar=0,maxEndingHere=0;
		for (int i = 1; i < inputArray.length; i++) {
			maxEndingHere+=inputArray[i];
			if (maxEndingHere < 0)
				maxEndingHere = 0;
			maxSoFar=Math.max(maxEndingHere, maxSoFar);
		}
		return maxSoFar;
	}

}


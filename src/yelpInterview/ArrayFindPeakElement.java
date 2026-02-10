package yelpInterview;

/**
 * Implementation of Array Find Peak Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindPeakElement {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds peak element in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findPeakElement(int[] arr) {
		int output=-1;
		for (int i = 1; i < arr.length-2; i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
				return arr[i];
		}
		return output;
	}

}
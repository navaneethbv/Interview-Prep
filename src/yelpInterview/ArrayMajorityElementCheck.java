package yelpInterview;

/**
 * Implementation of Array Majority Element Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayMajorityElementCheck {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Checks if majority.
	 *
	 * @param inputArray the array to process
	 * @param x the x parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isMajority(int[] inputArray, int x) {
		int index=getFirstIndex(inputArray,0,inputArray.length-1,x);
		int n=inputArray.length-1;
		if (index == -1)
			return false;
		if (((index + n/2) <= (n -1)) && inputArray[index + n/2] == x)
			return true;
		else
			return false;
	}

	/**
	 * Retrieves first index from the data structure.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	private static int getFirstIndex(int[] arr, int low,int high,int x) {
		if (low<=high)
		{
			int mid = (low + high)/2; 
			// Check for null/base case
			if ( (mid == 0 || x > arr[mid-1]) && (arr[mid] == x) )
				return mid;
			else if (x > arr[mid])
				// Recursively process left and right subtrees
				return getFirstIndex(arr, (mid + 1), high, x);
			else
				// Recursively process left and right subtrees
				return getFirstIndex(arr, low, (mid -1), x);
		}

		return -1;
	}

}
package yelpInterview;

/**
 * Implementation of Array Largest Pair Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayLargestPairSum {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds max pair sum in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findMaxPairSum(int[] arr) {
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(firstMax==Integer.MIN_VALUE){
				firstMax=arr[i];
				continue;
			}
			if(secondMax==Integer.MIN_VALUE){
				secondMax=arr[i];
				continue;
			}
			if(arr[i]>firstMax)
			{
				firstMax=arr[i];
			}
			else if(arr[i]>secondMax){
				secondMax=arr[i];
			}
		}
		return firstMax+secondMax;
	}



}
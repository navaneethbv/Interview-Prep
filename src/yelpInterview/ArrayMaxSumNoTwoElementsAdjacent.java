package yelpInterview;

/**
 * Implementation of Array Max Sum No Two Elements Adjacent algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayMaxSumNoTwoElementsAdjacent {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds sum in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findSum(int[] arr) {
		int incl=arr[0],excl=0;
		for (int i = 1; i < arr.length; i++) {
			int prevExcl=excl;
			int prevIncl=incl;
			incl=excl+arr[i];
			excl=Math.max(prevExcl,prevIncl);
		}
		return Math.max(incl, excl);
	}

}
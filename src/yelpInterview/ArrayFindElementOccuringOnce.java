package yelpInterview;

/**
 * Implementation of Array Find Element Occuring Once algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindElementOccuringOnce {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds element occuring once in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findElementOccuringOnce(int[] arr) {
		int output=arr[0];
		for (int i = 1; i < arr.length; i++) {
			output^=arr[i];
		}
		return output;
	}

	

}
package yelpInterview;

/**
 * Implementation of Array Odd Number Occuring Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayOddNumberOccuringElement {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds odd occuring number in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findOddOccuringNumber(int[] inputArray) {
		int output=inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			output=output^inputArray[i];
		}
		return output;
	}

}


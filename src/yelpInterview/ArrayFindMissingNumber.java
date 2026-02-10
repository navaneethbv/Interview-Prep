package yelpInterview;

/**
 * Implementation of Array Find Missing Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindMissingNumber {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds missing number in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMissingNumber(int[] inputArray) {
		int n=inputArray.length+1;
		int sum=(int)(n*(n+1)/(float)2);
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			sum-=inputArray[i];
		}
		return sum;
	}

}


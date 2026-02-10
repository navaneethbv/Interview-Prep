package appleInterview;

/**
 * Implementation of Prep Doc Find Missing Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocFindMissingElement {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds missing in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findMissing(int[] arr) {
		int sum=0;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return -sum+(arr.length+1)*(arr.length+2)/2;
	}

}

package appleInterview;

/**
 * Implementation of Prep Doc Mean Value Of Arrays algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocMeanValueOfArrays {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds mean in the data structure.
	 *
	 * @param is the array to process
	 * @param is2 the array to process
	 * @return the double result
	 */
	private static double findMean(int[] is, int[] is2) {
		int total=0;
		int count=is.length+is2.length;
		// Iterate through all elements
		for (int i = 0; i < is.length; i++) {
			total+=is[i];
		}
		// Iterate through all elements
		for (int i = 0; i < is2.length; i++) {
			total+=is2[i];
		}
		return total/count;
	}


}

package appleInterview;

/**
 * Implementation of Prep Doc Factorial algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocFactorial {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds recursive factorial in the data structure.
	 *
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int findRecursiveFactorial(int i) {
		int output=1;
		for (int j = 1; j <=i; j++) {
			output*=j;
		}
		return output;
	}

	/**
	 * Finds factorial in the data structure.
	 *
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int findFactorial(int i) {
		if(i<=1)
			return 1;
		else
			// Recursively process left and right subtrees
			return i*findFactorial(i-1);
	}


}

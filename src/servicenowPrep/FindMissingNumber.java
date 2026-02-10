package servicenowPrep;

/**
 * Implementation of Find Missing Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindMissingNumber
{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds missing num in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findMissingNum(int[] arr) {
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=i+1)
				return i+1;
		}
		return -1;
	}

	

}
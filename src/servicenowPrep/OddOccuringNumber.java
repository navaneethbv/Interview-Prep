package servicenowPrep;

/**
 * Implementation of Odd Occuring Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class OddOccuringNumber
{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs oddOccuringNumber operation.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int oddOccuringNumber(int[] arr) {
		int number=arr[0];
		for (int i =1; i < arr.length; i++) {
			number=number^arr[i];
		}
		return number;
	}



}
package yelpInterview;

/**
 * Implementation of Array Leaders In Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayLeadersInArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs printLeaders operation.
	 *
	 * @param inputArray the array to process
	 */
	private static void printLeaders(int[] inputArray) {
		int max=inputArray[inputArray.length-1];
		System.out.println(max);
		for (int i = inputArray.length-1;i>=0; i--) {
			if(inputArray[i]>max)
			{
				System.out.println(inputArray[i]);
				max=inputArray[i];
			}
		}

	}

}
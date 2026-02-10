package yelpInterview;

/**
 * Implementation of Array Equilibrium Index algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayEquilibriumIndex {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds equilibrium point in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findEquilibriumPoint(int[] inputArray) {
		int index=0,rightSum=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			rightSum+=inputArray[i];
		}
		int leftSum=0;
		for (index = 0; index < inputArray.length; index++) {
			leftSum+=inputArray[index];
			rightSum-=inputArray[index];
			if(leftSum==rightSum)
				break;
		}
		return index;
	}

}
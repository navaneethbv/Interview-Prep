package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
 */
/**
 * Implementation of Odd Times Number Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class OddTimesNumberArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds odd timed number in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findOddTimedNumber(int[] inputArray) {
		int result=inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			result^=inputArray[i];
		}
		return result;
	}

}

package yelpInterview;

/**
 * Implementation of Array Second Smallest algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySecondSmallest {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds smallest in the data structure.
	 *
	 * @param inputArray the array to process
	 */
	private static void findSmallest(int[] inputArray) {
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i]<first)
			{
				first=inputArray[i];
			}
			else if(inputArray[i]>first && inputArray[i]<second && first!=second)
			{
				second=inputArray[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
		
	}

	


}
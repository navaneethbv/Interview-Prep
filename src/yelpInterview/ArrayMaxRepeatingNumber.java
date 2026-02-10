package yelpInterview;

/**
 * Implementation of Array Max Repeating Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayMaxRepeatingNumber {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds max repeating number in the data structure.
	 *
	 * @param arr the array to process
	 * @param k the k value
	 * @return the computed integer result
	 */
	private static int findMaxRepeatingNumber(int[] arr, int k) {
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			arr[arr[i]%k]+=k;
		}

		int max=arr[0],index=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
			}
		}
		return index;
	}



}
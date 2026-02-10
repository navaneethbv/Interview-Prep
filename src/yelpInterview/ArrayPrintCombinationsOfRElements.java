package yelpInterview;

/**
 * Implementation of Array Print Combinations Of R Elements algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayPrintCombinationsOfRElements {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs printCombinations operation.
	 *
	 * @param arr1 the array to process
	 * @param r the r parameter
	 */
	private static void printCombinations(int[] arr1, int r) {
		int data[]=new int[r];
		printCombinationUtil(arr1,arr1.length,r,0,data,0);
	}

	/**
	 * Performs printCombinationUtil operation.
	 *
	 * @param arr[] the arr[] parameter
	 * @param n the size or count parameter
	 * @param r the r parameter
	 * @param index the index parameter
	 * @param data[] the data[] parameter
	 * @param i the i parameter
	 */
	private static void printCombinationUtil(int arr[], int n, int r, int index, int data[], int i) {
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]);
			System.out.println();
			return;
		}
		if (i >= n)
			return;
		data[index] = arr[i];
		printCombinationUtil(arr, n, r, index+1, data, i+1);
		printCombinationUtil(arr, n, r, index, data, i+1);
	}


}
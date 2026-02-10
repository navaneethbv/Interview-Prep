package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Count Triangles algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayCountTriangles {
	static boolean[][] visited;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}
	/**
	 * Counts the number of triangles.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int countTriangles(int[] inputArray) {
		Arrays.sort(inputArray);
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length-2; i++) {
			int k=i+2;
			for (int j = i+1; j < inputArray.length; j++) {

				while(k<inputArray.length && inputArray[i] + inputArray[j] > inputArray[k])
					k++;
				count+=k-j-1;
			}
		}
		return count;
	}

}
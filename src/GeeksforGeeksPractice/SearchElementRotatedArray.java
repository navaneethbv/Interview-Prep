package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
/**
 * Implementation of Search Element Rotated Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchElementRotatedArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Searches for .
	 *
	 * @param inputArray the array to process
	 * @param element the element parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean search(int[] inputArray, int element) {
		int pivot=inputArray.length/2;
		if(element==inputArray[pivot])
			return true;
		else if(element>inputArray[0])
			return Arrays.binarySearch(Arrays.copyOfRange(inputArray, 0, pivot-1), element)==-1?false:true;
		else
			return Arrays.binarySearch(Arrays.copyOfRange(inputArray, pivot+1, inputArray.length), element)==-1?false:true;
	}

}

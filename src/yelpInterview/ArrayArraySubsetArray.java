package yelpInterview;

import java.util.HashSet;

/**
 * Implementation of Array Array Subset Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayArraySubsetArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {11, 3, 7, 1};
		System.out.println(isSubArray(arr1,arr2));
		arr1 = new int[]{1, 2, 3, 4, 5, 6};
		arr2 = new int[]{1, 2, 4};
		System.out.println(isSubArray(arr1,arr2));
		arr1 = new int[]{10, 5, 2, 23, 19};
		arr2 = new int[]{19, 5, 3};
		System.out.println(isSubArray(arr1,arr2));
	}

	/**
	 * Checks if sub array.
	 *
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isSubArray(int[] arr1, int[] arr2) {
		HashSet<Integer> elementCount=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < arr1.length; i++) {
			elementCount.add(arr1[i]);
		}
		// Iterate through all elements
		for (int i = 0; i < arr2.length; i++) {
			if(!elementCount.contains(arr2[i]))
				return false;
		}
		return true;
	}


}
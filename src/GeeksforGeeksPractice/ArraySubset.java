package GeeksforGeeksPractice;

import java.util.HashMap;

/*
 * Link : http://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/
 */
/**
 * Implementation of Array Subset algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySubset {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {11, 3, 7, 1};
		System.out.println(checkSubset(arr1,arr2));
		arr1 = new int[]{1, 2, 3, 4, 5, 6};
		arr2 = new int[]{1, 2, 4};
		System.out.println(checkSubset(arr1,arr2));
		arr1 = new int[]{10, 5, 2, 23, 19};
		arr2 = new int[]{19, 5, 3};
		System.out.println(checkSubset(arr1,arr2));
	}

	/**
	 * Performs checkSubset operation.
	 *
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkSubset(int[] arr1, int[] arr2) {
		int count=0;
		HashMap<Integer,Integer> elementMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < arr1.length; i++) {
			elementMap.put(arr1[i],1);
		}
		// Iterate through all elements
		for (int i = 0; i < arr2.length; i++) {
			if(elementMap.containsKey(arr2[i]))
				count++;
		}
		return count==arr2.length;
	}

}

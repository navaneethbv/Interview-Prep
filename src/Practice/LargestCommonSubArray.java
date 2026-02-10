package Practice;

import java.util.*;

/**
 * Implementation of Largest Common Sub Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LargestCommonSubArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int[] array1 = {1,2,3,2,3,2};
		int[] array2 = {2,2,3,3,4,5};
		for(int i = 0; i < largestCommonSubArray(array1,array2).length; i++) {
			System.out.print(largestCommonSubArray(array1,array2)[i]);
		}
	}

	/**
	 * Performs largestCommonSubArray operation.
	 *
	 * @param array1 the array to process
	 * @param array2 the array to process
	 * @return the resulting array
	 */
	private static Object[] largestCommonSubArray(int[] array1, int[] array2) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		// Iterate through all elements
		for(int i = 0; i < array1.length; i++) {
			set.add(array1[i]);
		}
		// Iterate through all elements
		for(int i = 0; i < array2.length; i++) {
			if(set.contains(array2[i])) {
				list.add(array2[i]);
			}			
		}
		return  list.toArray();
	}
}
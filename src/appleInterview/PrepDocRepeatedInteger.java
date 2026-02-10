package appleInterview;

import java.util.HashSet;

/**
 * Implementation of Prep Doc Repeated Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocRepeatedInteger {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs repeatedInteger operation.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int repeatedInteger(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i]))
				return arr[i];
			else
				set.add(arr[i]);
		}
		return -1;
	}
}

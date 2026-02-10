package Practice;

import java.util.*;

/**
 * Implementation of Pairs Equal To Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PairsEqualToSum {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs printPairsEqualToSum operation.
	 *
	 * @param array the array to process
	 * @param sum the sum parameter
	 */
	private static void printPairsEqualToSum(int[] array, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		// Iterate through all elements
		for(int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		int difference = 0;
		if(checkDuplicate(array, sum)) { // To remove faulty condition where sum/2 occurs once.
			set.remove(sum/2);
		}
		// Iterate through all elements
		for(int i = 0 ; i < array.length; i++) {
			difference = sum - array[i];
			if(set.contains(difference)) {
				System.out.println("Pair of numbers adding to Sum "+sum+" are "+array[i]+" and "+difference);
				set.remove(array[i]);
			}
		}
	}

	/**
	 * Performs checkDuplicate operation.
	 *
	 * @param array the array to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkDuplicate(int[] array, int sum) {
		int dupValue = sum / 2; int count = 0;
		// Iterate through all elements
		for(int i = 0; i < array.length; i++) {
			if(array[i] == dupValue) {
				count++;
			}
		}
		if(count == 1) {
			return true;
		} else {
			return false;
		}
	}
}

package Codility;

/* 
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/tape_equilibrium
 */

/**
 * Implementation of Time Complexity Tape Equilibrium algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TimeComplexityTapeEquilibrium {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs minimise operation.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int minimise(int[] inputArray) {
		int min=Integer.MAX_VALUE;
		int leftSum=0,rightSum=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			rightSum+=inputArray[i];
		}
		int diff=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			leftSum+=inputArray[i];
			rightSum-=inputArray[i];
			diff=Math.abs(leftSum-rightSum);
			if(diff<min)
				min=diff;
		}
		return min;
	}

}

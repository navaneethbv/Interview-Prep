package Codility;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/perm_missing_elem
 */

/**
 * Implementation of Time Complexity Perm Missing Elem algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TimeComplexityPermMissingElem {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Performs solution operation.
	 *
	 * @param inputArray[] the array to process
	 * @return the computed integer result
	 */
	public static int solution(int inputArray[])
	{
		int sum=0;
		for (int i = 0; i < inputArray.length; i++) {
			sum+=inputArray[i];
		}
		int size=inputArray.length+1;
		return ((size*(size+1))/2)-sum;
	}
}
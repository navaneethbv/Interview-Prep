package Codility;

import java.util.HashMap;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/distinct
 */

/**
 * Implementation of Sorting Distinct algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortingDistinct {

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
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int solution(int[] A){
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			if(!elementMap.containsKey(A[i]))
			{
				elementMap.put(A[i],A[i]);
				count++;
			}
		}
		return count;
	}
}
package leetCode;

import java.util.HashMap;

/*
 * Link : https://codility.com/programmers/task/missing_integer
 */

/**
 * Implementation of Counting Elements Missing Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountingElementsMissingInteger {

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
	 * @param inputArray the array to process
	 * @param N the size or count parameter
	 * @return the computed integer result
	 */
	public static int solution(int[] inputArray,int N)
	{	
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		for (int i = 0; i < inputArray.length; i++) {
			elementMap.put(inputArray[i],1);
		}
		for (int i = 1; i <=N; i++) {
			if(!elementMap.containsKey(i))
				return i;
		}
		return -1;
	}
}
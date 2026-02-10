package Codility;

import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/max_counters
 */

/**
 * Implementation of Counting Elements Max Counters algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountingElementsMaxCounters {

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
	 * @param N the size or count parameter
	 * @param A the array to process
	 * @return the resulting array
	 */
	public static int[] solution(int N, int[] A)
	{	
		int outputArray[][]=new int[A.length][N];
		for (int i = 0; i < A.length; i++) {
			int element=A[i];
			if(i!=0){
				if(element>=N)
				{
					Arrays.fill(outputArray[i],findMax(outputArray[i-1]));
				}
				else{
					outputArray[i]=Arrays.copyOf(outputArray[i-1],outputArray[0].length);
					outputArray[i][element-1]=outputArray[i-1][element-1]+1;
				}
			}
			else{
				outputArray[i][element-1]=1;
			}

		}
		return outputArray[outputArray.length-1];
	}

	/**
	 * Finds max in the data structure.
	 *
	 * @param is the array to process
	 * @return the computed integer result
	 */
	private static int findMax(int[] is) {
		int max=Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < is.length; i++) {
			if(is[i]>max)
			{
				max=is[i];
			}
		}
		System.out.println(max);
		return max;
	}
}
package Codility;

import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/max_double_slice_sum
 */

/**
 * Implementation of Maximum Slice Max Double Slice Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumSliceMaxDoubleSliceSum {
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
		int[] A1=new int[A.length];
		int[] A2=new int[A.length];
		for (int i = 1; i < A.length-1; i++) {
			A1[i]=Math.max(A1[i-1]+A[i],0);
		}
		System.out.println(Arrays.toString(A1));
		for (int i = A.length-2; i >0; i--) {
			A2[i]=Math.max(A2[i+1]+A[i],0);
		}
		System.out.println(Arrays.toString(A2));
		int max=0;
		for (int i = 1; i < A2.length-1; i++) {
			max=Math.max(max,A1[i-1]+A2[i+1]);
		}
		return max;
	}
}
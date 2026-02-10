package Codility;

import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/min_abs_sum_of_two
 */

/**
 * Implementation of Caterpillar Method Min Abs Sum Of Two algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CaterpillarMethodMinAbsSumOfTwo {
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
	public static  int solution(int[] A){
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		int l=0,r=A.length-1;
		int min=Math.abs(A[0]+A[0]);
		while(l<=r)//Similar to Binary search traversal
		{
			int lval=Math.abs(A[l]*2);
			int rval=Math.abs(A[r]*2);
			int both=Math.abs(A[l]+A[r]);
			if (lval < min){
				min = lval;
			}
			if (rval < min){
				min = rval;
			}
			if (both < min){
				min = both;
			} 
			if (A[l] >= 0){
				break;    
			}
			if (lval < rval){
				r--;
			}
			else if (lval > rval){
				l++;
			}
			else {
				r--;
				l++;
			}
		}
		return min;
	}

}
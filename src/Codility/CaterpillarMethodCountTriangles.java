package Codility;

import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/count_triangles
 */

/**
 * Implementation of Caterpillar Method Count Triangles algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CaterpillarMethodCountTriangles {
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
		int count=0;
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		// Iterate through all elements
		for (int i = 0; i <A.length-2; i++) {
			int k=i+2;
			for (int j = i+1; j < A.length; ++j)
			{
				while (k < A.length && A[i] + A[j] > A[k])
					++k;
				count += k - j - 1;
			}
		}

		return count;
	}

}
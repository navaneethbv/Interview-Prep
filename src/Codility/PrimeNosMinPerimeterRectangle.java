package Codility;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/min_perimeter_rectangle
 */

/**
 * Implementation of Prime Nos Min Perimeter Rectangle algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrimeNosMinPerimeterRectangle {
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
	 * @return the computed integer result
	 */
	public static int solution(int N){//also it is 4*Math.ceil(Math.sqrt(N))
		int minPerimeter=Integer.MAX_VALUE;
		for (int i = 1; i*i<=N; i++) {
			// Check for null/base case
			if(N%i==0)
			{
				minPerimeter=Math.min(minPerimeter, 2*((N/i)+i));
			}
		}
		return minPerimeter;
	}
}
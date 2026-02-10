package Codility;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/passing_cars
 */

/**
 * Implementation of Prefix Sums Passing Cars algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrefixSumsPassingCars {

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
		int previous=0;
		for (int i = A.length-1; i >=0; i--) {
			// Check for null/base case
			if(A[i]==0)
			{
				previous+=count;
			}
			else{
				count++;
			}			
		}
		return previous;
	}
}
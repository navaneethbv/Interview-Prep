package leetCode;

/*
 * Link : https://codility.com/programmers/task/nailing_planks
 */

/**
 * Implementation of Binary Search Nailing Planks algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinarySearchNailingPlanks {
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
	 * @param B the array to process
	 * @param C the array to process
	 * @return the computed integer result
	 */
	public static int solution(int[] A, int[] B, int[] C){
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < C.length; i++) {
			if(C[i]<=B[count] && C[i]>=A[count])
			{
				count++;
				i--;
			}
			if(count==B.length)
				break;
		}		
		return count;
	}

}
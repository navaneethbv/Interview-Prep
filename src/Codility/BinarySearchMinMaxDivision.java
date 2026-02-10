package Codility;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/min_max_division
 */

/**
 * Implementation of Binary Search Min Max Division algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinarySearchMinMaxDivision {
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
	 * @param K the K value
	 * @param M the M parameter
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int solution(int K, int M, int[] A){
		int max = A[0];
		int sum = 0;
		int N=A.length;
		int i;
		for (i = 0; i < N; i++){
			max = max < A[i] ? A[i] : max;
			sum += A[i];
		}
		int beg = max;
		int end = sum; 
		int min = sum; 
		while (beg <= end){
			int mid = (beg + end) / 2;
			if (check(mid, K, A, N)==1){
				min = mid;
				end = mid - 1;
			}
			else {
				beg = mid + 1;
			}
		}

		return min;
	}

	/**
	 * Performs check operation.
	 *
	 * @param num the num parameter
	 * @param K the K value
	 * @param A[] the A[] parameter
	 * @param N the size or count parameter
	 * @return the computed integer result
	 */
	public static int check(int num, int K, int A[], int N)
	{
		int i = 0;

		int sum = 0;
		while (i < N){    
			if (A[i] > num){
				return 0;
			}
			sum += A[i];
			if (sum > num){
				sum = A[i];
				K--;
				if (K == 0){
					return 0;
				}
			}
			i++;
		}

		return 1;
	}

}
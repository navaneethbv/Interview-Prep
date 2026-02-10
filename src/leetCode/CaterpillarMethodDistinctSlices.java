package leetCode;

/*
 * Link : https://codility.com/programmers/task/count_distinct_slices
 */

/**
 * Implementation of Caterpillar Method Distinct Slices algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CaterpillarMethodDistinctSlices {
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
	 * @param M the M parameter
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int solution(int M, int[] A)
	public static int solution(int M, int[] A)
	{
		int N = A.length;
		int[] counters = new int[M+1];
		int head = 0;
		int tail = 0;
		int result = 0;
		while (tail < N) {
			// find the most right end of the array for each tail
			while (head < N && counters[A[head]] != 2) {//repitition of elements
				counters[A[head]]++;
				if (counters[A[head]] == 2)
					break;
				head++;
			}
			result += head - tail;
			counters[A[tail]] = 0;
			tail++;
		}
		return result;
	}

}
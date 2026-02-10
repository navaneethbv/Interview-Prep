import java.util.BitSet;

/**
 * A non-empty zero-indexed array A consisting of N integers is given.
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * For example, array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * is a permutation, but array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * is not a permutation, because value 2 is missing.
 * The goal is to check whether array A is a permutation.
 * Write a function:
 * int solution(int A[], int N);
 * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
 * For example, given array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * the function should return 1.
 * Given array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * the function should return 0.
 * Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
/**
 * Implementation of Perm Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PermCheck {
    /**
     * Performs solution operation.
     *
     * @param A the array to process
     * @return the computed integer result
     */
    public int solution(int[] A) {
        int n = A.length;
        BitSet bit = new BitSet(n);
        // Iterate through all elements
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > n || bit.get(A[i] - 1)) return 0;
            bit.set(A[i] - 1);
        }
        return 1;
    }

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}
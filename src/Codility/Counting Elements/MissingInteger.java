
import java.util.BitSet;

/**
 * MissingInteger
 * Find the minimal positive integer not occurring in a given sequence.
 * Task description
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer that does not occur in A.
 * For example, given:
 * A[0] = 1
 * A[1] = 3
 * A[2] = 6
 * A[3] = 4
 * A[4] = 1
 * A[5] = 2
 * the function should return 5.
 * Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [?2,147,483,648..2,147,483,647].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
/**
 * Implementation of Missing Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MissingInteger {
    /**
     * Performs solution operation.
     *
     * @param A the array to process
     * @return the computed integer result
     */
    /*public int solution(int[] A) {
        int n = A.length;
        BitSet hash = new BitSet(n + 1);
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) {
                hash.set(A[i]);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!hash.get(i)) return i;
        }
        return n + 1;
    }*/
    }
    /**
     * Performs solution operation.
     *
     * @param A the array to process
     * @return the computed integer result
     */
    public int solution(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            while (A[i] > 0 && A[i] <= n && A[i] != i + 1 && A[A[i] - 1] != A[i]) {
                swap(A, i, A[i] - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (A[i] != i + 1) return i + 1;
        }
        return n + 1;
    }

    /**
     * Performs swap operation.
     *
     * @param a the array to process
     * @param x the x parameter
     * @param y the y parameter
     */
    private void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    /**
     * Main method to test the functionality of the class with various test cases.
     *
     * @param args the array to process
     */
    public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
    }
}
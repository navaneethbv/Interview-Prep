package Codility.Lesson_1;

/*

Task description

A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which meanswer that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

/**
 * Performs solution operation.
 *
 * @param A the array to process
 * @return the computed integer result
 */
class Solution { public int solution(int[] A); }
class Solution { public int solution(int[] A); }

that, given a zero-indexed array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Assume that:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 */


/**
 * Implementation of Perm Missing Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PermMissingElement 
{
	// swap the ith element and the (A[i]-1)th element, until A[i]=i+1;
	
	/**
	 * Performs solution operation.
	 *
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public int solution(int[] A) 
	public int solution(int[] A) 
	{
		int n = A.length;
		for (int i = 0; i < n; i++) 
		{
			if (A[i] == i + 1) continue;
			while (A[i] != i + 1 && A[i] <= n) 
			{
				swap(A, i, A[i] - 1);
			}
		}
		for (int i = 0; i < n; i++) 
		{
			if (A[i] > n) return i + 1;
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
	private void swap(int[] a, int x, int y) 
	private void swap(int[] a, int x, int y) 
	{
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) 
	{
		int answer = new PermMissingElement().solution(new int[]{5, 2, 3, 1});
		System.out.println(answer);
	}

	// calculate the sum of all elements
	/**
	 * Performs solution operation.
	 *
	 * @param A the array to process
	 * @return the computed integer result
	 */
	/* public int solution(int[] A) 
	/* public int solution(int[] A) 
	 * {
        int n = A.length;
        // using long instead of int
        long target = (long) (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            target -= A[i];
        }
        return (int) target;
    } */
}

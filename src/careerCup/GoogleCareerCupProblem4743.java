package careerCup;

/*
 * Link: http://www.careercup.com/question?id=244743
 * Find the median of 2 sorted arrays
 * http://www.geeksforgeeks.org/median-of-two-sorted-arrays/
 */
/**
 * Implementation of Google Career Cup Problem4743 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem4743 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds median in the data structure.
	 *
	 * @param ar1 the array to process
	 * @param ar2 the array to process
	 * @param left the left parameter
	 * @param right the right parameter
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findMedian(int[] ar1, int[] ar2, int left, int right, int n) {
		int i,j;
		i=(left+right)/2;
		j=n-i-1;
		if (left > right)
			// Recursively process left and right subtrees
			return findMedian(ar2, ar1, 0, n-1, n);
		if (ar1[i] > ar2[j] && (j == n-1 || ar1[i] <= ar2[j+1]))
		{
			// Check for null/base case
			if (i == 0 || ar2[j] > ar1[i-1])
				return (ar1[i] + ar2[j])/2;
			else
				return (ar1[i] + ar1[i-1])/2;
		}
		else if (ar1[i] > ar2[j] && j != n-1 && ar1[i] > ar2[j+1])
			// Recursively process left and right subtrees
			return findMedian(ar1, ar2, left, i-1, n);
		else 
			// Recursively process left and right subtrees
			return findMedian(ar1, ar2, i+1, right, n);
	}
}

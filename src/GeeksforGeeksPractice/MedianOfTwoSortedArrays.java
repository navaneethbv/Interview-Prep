package GeeksforGeeksPractice;

/**
 * Implementation of Median Of Two Sorted Arrays algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MedianOfTwoSortedArrays {

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
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 * @param left the left parameter
	 * @param right the right parameter
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int findMedian(int[] arr1, int[] arr2,int left,int right,int n) {
		if(left>right)
			// Recursively process left and right subtrees
			return findMedian(arr2, arr1, left, right, n);
		int i=(left+right)/2,j=n-i-1;
		if (arr1[i] > arr2[j] && (j == n-1 || arr1[i] <= arr2[j+1]))
		{
			// Check for null/base case
			if (i == 0 || arr2[j] > arr1[i-1])
				return (arr1[i] + arr2[j])/2;
			else
				return (arr1[i] + arr1[i-1])/2;
		}
		else if (arr1[i] > arr2[j] && j != n-1 && arr1[i] > arr2[j+1])
			// Recursively process left and right subtrees
			return findMedian(arr1, arr2, left, i-1, n);
		else 
			// Recursively process left and right subtrees
			return findMedian(arr1, arr2, i+1, right, n);
	}
}

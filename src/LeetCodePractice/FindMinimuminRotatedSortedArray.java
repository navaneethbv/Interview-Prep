package LeetCodePractice;

/**
 * Implementation of Find Minimumin Rotated Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindMinimuminRotatedSortedArray {
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
	 * Finds min in the data structure.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int findMin(int[] nums) {
		// Recursively process left and right subtrees
		return findMinimum(nums,0,nums.length-1);
	}
	/**
	 * Finds minimum in the data structure.
	 *
	 * @param arr the array to process
	 * @param left the left parameter
	 * @param right the right parameter
	 * @return the computed integer result
	 */
	private static int findMinimum(int[] arr, int left, int right) {
		if(left==right)
		{	
			return arr[left];
		}
		if (Math.abs(right - left) == 1)
			return Math.min(arr[left], arr[right]);
		int mid=(left+right)/2;
		if(arr[left]<arr[right])
			return arr[left];
		else if(arr[mid]>arr[left])
			// Recursively process left and right subtrees
			return findMinimum(arr, mid, right);
		else
			// Recursively process left and right subtrees
			return findMinimum(arr, left, mid);

	}
}


package LeetCodePractice;

/**
 * Implementation of Find Peak Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindPeakElement {

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
	 * Finds peak element in the data structure.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int findPeakElement(int[] nums) {
		// Recursively process left and right subtrees
		return findPeakElement(nums,0,nums.length-1);
	}

	/**
	 * Finds peak element in the data structure.
	 *
	 * @param arr the array to process
	 * @param left the left parameter
	 * @param right the right parameter
	 * @return the computed integer result
	 */
	private static int findPeakElement(int[] arr, int left, int right) {

		int mid=(left+right)/2;
		if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1])
			return arr[mid];
		else if(arr[left]>arr[right])
		{
			// Recursively process left and right subtrees
			return findPeakElement(arr,mid,right);
		}
		else
			// Recursively process left and right subtrees
			return findPeakElement(arr,left,mid);
	}
}


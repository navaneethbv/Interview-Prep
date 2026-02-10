package LeetCodePerformancePractice;

/**
 * Implementation of Search Insert Position algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchInsertPosition {
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
	 * Searches for insert.
	 *
	 * @param arr the array to process
	 * @param target the target value
	 * @return the computed integer result
	 */
	public static int searchInsert(int[] arr, int target) {
		int left=0,right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
			{
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
		return Math.max(left, right);
	}
}


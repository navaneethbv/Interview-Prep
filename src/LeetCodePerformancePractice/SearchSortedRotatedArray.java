package LeetCodePerformancePractice;

/**
 * Implementation of Search Sorted Rotated Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchSortedRotatedArray {
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
	 * Searches for .
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the computed integer result
	 */
	public static int search(int[] nums, int target) {
		int left=0,right=nums.length-1;
		while(left<=right)
		{
			int middle=(left+right)/2;
			if(nums[middle]==target)
				return middle;
			if(nums[left]<=nums[middle])
			{
				if(nums[left]<=target && target<nums[middle])
				{
					right=middle-1;
				}
				else
					left=middle+1;
			}
			else{
				if(nums[middle]<target && target <=nums[right])
				{
					left=middle+1;
				}
				else
					right=middle-1;
			}
		}
		return -1;
	}

}


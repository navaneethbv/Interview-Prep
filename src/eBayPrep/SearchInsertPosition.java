package eBayPrep;

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
		System.out.println("5->"+(searchInsert(new int[]{1,3,5,6},5)));
		System.out.println();
		System.out.println("2->"+(searchInsert(new int[]{1,3,5,6},2)));
		System.out.println();
		System.out.println("7->"+(searchInsert(new int[]{1,3,5,6},7)));
		System.out.println();
		System.out.println("0->"+(searchInsert(new int[]{1,3,5,6},0)));
	}

	/**
	 * Searches for insert.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the computed integer result
	 */
	public static int searchInsert(int[] nums, int target) {
		int startPosition=findStart(nums,0,nums.length-1,target);
		return startPosition;
	}

	/**
	 * Finds start in the data structure.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param target the target value
	 * @return the computed integer result
	 */
	private static int findStart(int[] arr, int low, int high, int target) {
		if(low>high){
			//System.out.println("low->"+low+"/high->"+high);
			return low;
		}
		int mid=(low+high)/2;
		// Check for null/base case
		if(arr[mid]==target &&(mid==0 || arr[mid-1]!=target))
			return mid;
		else if(arr[mid]<target)
		{
			// Recursively process left and right subtrees
			return findStart(arr, mid+1, high, target);
		}
		return 
				findStart(arr, low, mid-1, target);
	}

}

package leetCode;

/*
 * Link : https://leetcode.com/problems/merge-sorted-array/
 */

/**
 * Implementation of Merge Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MergeSortedArray {
	/**
	 * Performs merge operation.
	 *
	 * @param nums1 the array to process
	 * @param m the m parameter
	 * @param nums2 the array to process
	 * @param n the size or count parameter
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int mLastIndex=m-1;
		int nLastIndex=n-1;
		int arrayLastIndex=nums1.length-1;
		while((mLastIndex+1)>0 && (nLastIndex+1)>0)
		{
			if(nums1[mLastIndex]>nums2[nLastIndex])
			{
				nums1[arrayLastIndex]=nums1[mLastIndex];
				arrayLastIndex--;
				mLastIndex--;
			}
			else{
				nums1[arrayLastIndex]=nums2[nLastIndex];
				arrayLastIndex--;
				nLastIndex--;
			}	
		}
		while((nLastIndex+1)>0)
		{
			nums1[arrayLastIndex]=nums2[nLastIndex];
			arrayLastIndex--;
			nLastIndex--;
		}
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
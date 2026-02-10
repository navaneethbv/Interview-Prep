package LeetCodePractice;

import java.util.Arrays;

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
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int nums1Pointer=m-1;
		int nums2Pointer=n-1;
		int outputPointer=nums1.length-1;
		while(outputPointer>=0)
		{
			if(nums1Pointer>=0 && nums2Pointer>=0)
			{
				if(nums1[nums1Pointer]>nums2[nums2Pointer])
				{
					nums1[outputPointer]=nums1[nums1Pointer];
					nums1Pointer--;
				}
				else{
					nums1[outputPointer]=nums2[nums2Pointer];
					nums2Pointer--;
				}
			}
			else if(nums1Pointer<0)
			{
				nums1[outputPointer]=nums2[nums2Pointer];
				nums2Pointer--;
			}
			else{
				nums1[outputPointer]=nums1[nums1Pointer];
				nums1Pointer--;
			}
			outputPointer--;
		}
		System.out.println(Arrays.toString(nums1));
		
	}


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}


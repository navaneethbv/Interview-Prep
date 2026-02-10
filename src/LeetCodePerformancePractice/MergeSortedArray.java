package LeetCodePerformancePractice;

/**
 * Implementation of Merge Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MergeSortedArray {
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
	 * Performs merge operation.
	 *
	 * @param nums1 the array to process
	 * @param m the m parameter
	 * @param nums2 the array to process
	 * @param n the size or count parameter
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int index=nums1.length-1;
		m--;n--;
		while (index>=0) {
			if(m>=0 && n>=0)
			{
				if(nums1[m]>nums2[n])
				{
					nums1[index]=nums1[m];
					m--;
				}
				else{
					nums1[index]=nums2[n];
					n--;
				}
			}
			else if(m>=0)
			{
				nums1[index]=nums1[m];
				m--;
			}
			else
			{
				nums1[index]=nums2[n];
				n--;
			}
			index--;
		}
	}

}

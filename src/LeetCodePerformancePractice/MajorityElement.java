package LeetCodePerformancePractice;

/**
 * Implementation of Majority Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MajorityElement {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
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
	/**
	 * Performs majorityElement operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public int majorityElement(int[] nums) {
		int count=0,result=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(count==0)
			{
				result=nums[i];
				count++;
			}
			else if(nums[i]==result)
				count++;
			else
				count--;
		}
		return result;
	}
}

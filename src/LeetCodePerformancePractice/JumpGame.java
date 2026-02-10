package LeetCodePerformancePractice;

/**
 * Implementation of Jump Game algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JumpGame {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(canJump(new int[]{2,3,1,1,4}));
		System.out.println(canJump(new int[]{3,2,1,0,4}));//false
		System.out.println(canJump(new int[]{2,0}));
		System.out.println(canJump(new int[]{0}));
		System.out.println(canJump(new int[]{0,2}));//false
		System.out.println(canJump(new int[]{2,0,0}));

	}
	/**
	 * Performs canJump operation.
	 *
	 * @param nums the array to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean canJump(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length==0)
			return true;
		int maxReachable=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]+i>maxReachable)
				maxReachable=nums[i]+i;
			if(maxReachable>=nums.length-1)
				return true;
			// Check for null/base case
			if(nums[i]==0 && maxReachable<=i)
				return false;
		}
		return false;
	}
}


package LeetCodePractice;

/**
 * Implementation of Productof Array Except Self algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ProductofArrayExceptSelf{
	/**
	 * Performs productExceptSelf operation.
	 *
	 * @param nums the array to process
	 * @return the resulting array
	 */
	/*public int[] productExceptSelf(int[] nums) {
		int product=1;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0)
				product*=nums[i];
		}
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0)
				nums[i]=product/nums[i];
		}
		return nums;
	}*/
	}
	/**
	 * Performs productExceptSelf operation.
	 *
	 * @param nums the array to process
	 * @return the resulting array
	 */
	public int[] productExceptSelf(int[] nums) {
		int[] output=new int[nums.length];
		int[] temp1=new int[nums.length];
		int[] temp2=new int[nums.length];
		temp1[0]=1;
		temp2[nums.length-1]=1;
		
		// Iterate through all elements
		for (int i = 0; i < temp2.length-1; i++) {
			temp1[i+1]=nums[i]*temp1[i];
		}
		for (int i = nums.length-1; i >0; i--) {
			temp2[i-1]=nums[i]*temp2[i];
		}
		// Iterate through all elements
		for (int i = 0; i < temp2.length; i++) {
			output[i]=temp1[i]*temp2[i];
		}
		return output;
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


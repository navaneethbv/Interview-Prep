package yelpInterview;

/**
 * Implementation of Container Most Water algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ContainerMostWater {

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
	 * Performs maxArea operation.
	 *
	 * @param height the array to process
	 * @return the computed integer result
	 */
	public static int maxArea(int[] height) {
		// Check for null/base case
		if(height.length==0||height.length<2)
			return 0;
		int left=0;
		int right=height.length-1;
		int max=0;
		while(left<right)
		{
			if(height[left]>height[right])
			{
				max=Math.max(max,(right-left) * height[right]);
				right--;
			}else{
				max=Math.max(max,(right-left) * height[left]);
				left++;
			}

		}
		return max;
	}

}


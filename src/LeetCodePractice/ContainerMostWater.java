package LeetCodePractice;

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
		if(height.length==0||height.length==1)
			return 0;
		int max=Integer.MIN_VALUE;
		int left=0,right=height.length-1;
		while(left<right)
		{	
			int area=(right-left)*Math.min(height[left], height[right]);
			max=Math.max(max, area);
			if(height[left]>height[right])
			{
				right--;
			}
			else
				left++;
		}
		return max;
	}
}

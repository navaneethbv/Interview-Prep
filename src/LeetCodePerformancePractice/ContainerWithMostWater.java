package LeetCodePerformancePractice;

/**
 * Implementation of Container With Most Water algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ContainerWithMostWater {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs maxArea operation.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int maxArea(int[] inputArray) {
		// Check for null/base case
		if(inputArray==null||inputArray.length<=0)
			return 0;
		int left=0,right=inputArray.length-1;
		int maxArea=0;
		while(left<right)
		{
			int height=Math.min(inputArray[left], inputArray[right]);
			int area=(right-left) * height;
			maxArea=Math.max(area, maxArea);
			if(inputArray[left]>inputArray[right])
			{
				right--;
			}
			else
				left++;
		}
		return maxArea;
	}
   
    
}

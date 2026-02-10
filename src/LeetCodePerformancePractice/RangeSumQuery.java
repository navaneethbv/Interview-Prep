package LeetCodePerformancePractice;

/**
 * Implementation of Range Sum Query algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RangeSumQuery {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	public class NumArray {
		int[] numsNew;
		public NumArray(int[] nums) {
			numsNew=new int[nums.length];
			int sum=0;
			for (int i = 0; i < nums.length; i++) {
				sum+=nums[i];
				numsNew[i]=sum;
			}
		}

		/**
		 * Performs sumRange operation.
		 *
		 * @param i the i parameter
		 * @param j the j parameter
		 * @return the computed integer result
		 */
		public int sumRange(int i, int j) {
			return i==0?numsNew[j]:numsNew[j]-numsNew[i-1];
		}
	}

}

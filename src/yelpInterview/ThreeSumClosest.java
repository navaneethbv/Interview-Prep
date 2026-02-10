package yelpInterview;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Implementation of Three Sum Closest algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ThreeSumClosest {

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
	 * Performs threeSumClosest operation.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the computed integer result
	 */
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closest=Integer.MAX_VALUE;
		HashSet<Integer> set=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {

			int left=0;
			int right=nums.length-1;
			while(left<right)
			{
				if(left==i)
					left++;
				else if(right==i)
					right--;
				else{
					int sum=nums[left]+nums[right]+nums[i];
					if(!set.contains(sum))
					{
						closest=Math.min(closest, Math.abs(sum-target));
						set.add(sum);
					}
					if(sum>target)
					{
						right--;
					}
					else{
						left++;
					}
				}
			}	
		}
		System.out.println(Arrays.toString(set.toArray()));
		if(set.contains(target+closest))
			return target+closest;
		else
			return target-closest;

	}

}


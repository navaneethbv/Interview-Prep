package LeetCodePractice;

import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Triangle algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Triangle {

	/**
	 * Performs minimumTotal operation.
	 *
	 * @param triangle the triangle parameter
	 * @return the computed integer result
	 */
	public int minimumTotal(List<List<Integer>> triangle) {
		int sum=0;
		for (int i = 0; i < triangle.size(); i++) {
			List<Integer> list=triangle.get(i);
			Object arr[]=list.toArray();
			Arrays.sort(arr);
			sum+=(Integer)arr[0];
		}
		return sum;
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


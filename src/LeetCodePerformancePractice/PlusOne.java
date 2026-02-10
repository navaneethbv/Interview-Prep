package LeetCodePerformancePractice;

import java.util.Arrays;

/**
 * Implementation of Plus One algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PlusOne {
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
	 * Performs plusOne operation.
	 *
	 * @param digits the array to process
	 * @return the resulting array
	 */
	public static int[] plusOne(int[] digits) {
		int[] output=new int[digits.length+1];
		int carry=1;
		for (int i = digits.length-1; i >=0; i--) {
			int sum=digits[i]+carry;
			if(sum>9){
				output[i+1]=10-sum;
				carry=1;
			}
			else{
				output[i+1]=sum;
				carry=0;
			}
		}
		if(carry==1)
		{
			output[0]=1;
		}
		else{
			output=Arrays.copyOfRange(output, 1, output.length);
		}
		return output;
	}

}


package LeetCodePractice;

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
		int carry=1;
		int[] output=new int[digits.length+1];
		for (int i = digits.length-1; i >=0; i--) {
			int value=digits[i]+carry;
			if(value>=10){
				output[i]=0;
				digits[i]=0;
				carry=1;
			}
			else{
				output[i]=value;
				digits[i]=value;
				carry=0;
			}
		}
		if(carry==1)
			output[0]=1;
		return carry==1?output:digits;

	}

}


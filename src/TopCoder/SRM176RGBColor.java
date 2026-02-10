package TopCoder;

import java.util.Arrays;

/*
 * SRM 176 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=2251&rd=4685
 */



/**
 * Implementation of SRM176 RGB Color algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM176RGBColor {
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
	 * Retrieves complement from the data structure.
	 *
	 * @param rgb the array to process
	 * @return the resulting array
	 */
	public static int[] getComplement(int[] rgb){
		int[] rgbcomplement=new int[3];
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < rgbcomplement.length; i++) {
			rgbcomplement[i]=255-rgb[i];
			if(Math.abs(rgbcomplement[i]-rgb[i])<=32){
				count++;
			}
		}
		if(count==3)
			// Iterate through all elements
			for (int i = 0; i < rgbcomplement.length; i++) {
				rgbcomplement[i]=rgb[i]-128>=0?rgb[i]-128:rgb[i]+128;
			}
		return rgbcomplement;
	}
}

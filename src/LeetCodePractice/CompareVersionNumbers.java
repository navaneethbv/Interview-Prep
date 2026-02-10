package LeetCodePractice;

import java.util.Arrays;

/**
 * Implementation of Compare Version Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CompareVersionNumbers {

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
	 * Performs compareVersion operation.
	 *
	 * @param version1 the version1 parameter
	 * @param version2 the version2 parameter
	 * @return the computed integer result
	 */
	public static int compareVersion(String version1, String version2) {
		String v1Arr[]=version1.split("\\.");
		String v2Arr[]=version2.split("\\.");
		System.out.println(Arrays.toString(v1Arr));
		System.out.println(Arrays.toString(v2Arr));
		
		if(v1Arr.length>v2Arr.length)
		{
			// Iterate through all elements
			for (int i = 0; i < v2Arr.length; i++) {
				if(Integer.parseInt(v1Arr[i]+"")>Integer.parseInt(v2Arr[i]+""))
					return 1;
				else if(Integer.parseInt(v1Arr[i]+"")<Integer.parseInt(v2Arr[i]+""))
					return -1;
			}
			for (int i = v2Arr.length; i < v1Arr.length; i++) {
				if(Integer.parseInt(v1Arr[i]+"")>0)
					return 1;
			}
			return 0;
		}
		else
		{
			// Iterate through all elements
			for (int i = 0; i < v1Arr.length; i++) {
				if(Integer.parseInt(v1Arr[i]+"")>Integer.parseInt(v2Arr[i]+""))
					return 1;
				else if(Integer.parseInt(v1Arr[i]+"")<Integer.parseInt(v2Arr[i]+""))
					return -1;
			}
			for (int i = v1Arr.length; i < v2Arr.length; i++) {
				if(Integer.parseInt(v2Arr[i]+"")>0)
					return -1;
			}
			return 0;
		}
	}
}


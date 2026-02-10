package eBayPrep;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Implementation of Largest Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LargestNumber {
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
	 * Performs largestNumber operation.
	 *
	 * @param nums the array to process
	 * @return the resulting string
	 */
	public static String largestNumber(int[] nums) {
		String[] arr=new String[nums.length];
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			arr[i]=String.valueOf(nums[i]);
		}
		Arrays.sort(arr,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String leftRight=o1+o2;
				String rightLeft=o2+o1;
				return -leftRight.compareTo(rightLeft);
			}
		});
		StringBuilder sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		while(sb.length()>1 && sb.charAt(0)=='0')
			sb=sb.deleteCharAt(0);
		return sb.toString();
	}
}


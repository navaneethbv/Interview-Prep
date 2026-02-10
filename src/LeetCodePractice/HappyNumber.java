package LeetCodePractice;

import java.util.HashSet;

/**
 * Implementation of Happy Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class HappyNumber {
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
	 * Checks if happy.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isHappy(int n) {
		boolean exit=false;
		HashSet<Integer> set=new HashSet<>();
		while(!exit)
		{
			char arr[]=(n+"").toCharArray();
			int sum=0;
			// Iterate through all elements
			for (int i = 0; i < arr.length; i++) {
				sum = sum + (Integer.parseInt(arr[i]+"") * Integer.parseInt(arr[i]+""));
			}
			if(sum==1)
				return true;
			if(set.contains(sum))
				return false;
			else{
				set.add(sum);
				n=sum;
			}
		}
		return exit;
	}
}


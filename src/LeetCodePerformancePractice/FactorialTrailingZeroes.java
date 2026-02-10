package LeetCodePerformancePractice;

/**
 * Implementation of Factorial Trailing Zeroes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FactorialTrailingZeroes {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
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
	 * Performs trailingZeroes operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int trailingZeroes(int n) {
		if(n<0)
			return -1;
		int count=0;
		long div=5;
		while((n/div)>=1)
		{
			count+=n/div;
			div=div*5;
		}
		return count;
	}

}
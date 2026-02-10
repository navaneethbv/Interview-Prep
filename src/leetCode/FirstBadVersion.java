package leetCode;

/*
 * Link : https://leetcode.com/problems/first-bad-version/
 */

/**
 * Implementation of First Bad Version algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FirstBadVersion {
	static boolean[] badVersion=new boolean[]{false,false,false,false,false,true,true};
	/**
	 * Performs firstBadVersion operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		int mid;
		while (start + 1 < end) {
			mid = start + (end - start) / 2;
			if (isBadVersion(mid)) {
				end = mid;
			} else {
				start = mid;
			}
		}

		if (isBadVersion(start)) {
			return start;
		}
		return end;
	}
	/**
	 * Checks if bad version.
	 *
	 * @param mid the mid parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isBadVersion(int mid) {
		return badVersion[mid];
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

}
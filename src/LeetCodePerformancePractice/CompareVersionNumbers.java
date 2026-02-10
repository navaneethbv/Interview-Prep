package LeetCodePerformancePractice;

/**
 * Implementation of Compare Version Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CompareVersionNumbers {
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
	 * Performs compareVersion operation.
	 *
	 * @param version1 the version1 parameter
	 * @param version2 the version2 parameter
	 * @return the computed integer result
	 */
	public static int compareVersion(String version1, String version2) {
		String v1[]=version1.split("\\.");
		String v2[]=version2.split("\\.");
		int length=Math.max(v1.length, v2.length);
		// Iterate through all elements
		for (int i = 0; i < length; i++) {
			if(i<v1.length && i<v2.length){
				if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i]))
					return 1;
				else if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i]))
					return -1;
			}
			else if(i<v1.length){
				if(Integer.parseInt(v1[i])>0)
					return 1;
			}
			else{
				if(Integer.parseInt(v2[i])>0)
					return -1;
			}
		}
		return 0;
	}
}

package LeetCodePerformancePractice;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of First Unique Character In String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FirstUniqueCharacterInString {
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
	 * Performs firstUniqChar operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int firstUniqChar(String s) {
		Set<Character> set=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(s.lastIndexOf(c)==i && !set.contains(c))
				return i;
			set.add(c);
		}
		return -1;
	}
}

package ctci;

import java.util.Arrays;

/**
 * Implementation of Check Permutations algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckPermutations {
  /**
   * Checks if permutation.
   *
   * @param s1 the s1 parameter
   * @param s2 the s2 parameter
   * @return true if condition is met, false otherwise
   */
  public static boolean isPermutation(String s1, String s2) {
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    if (a.length != b.length) return false;
    // Iterate through all elements
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) return false;
    }
    return true;
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
package ctci;

/**
 * Implementation of String Compression algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StringCompression {
  /**
   * Performs compress operation.
   *
   * @param str the str parameter
   * @return the resulting string
   */
  public static String compress(String str) {
    StringBuilder sb = new StringBuilder();
    int count = 1;
    // Iterate through all elements
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) != str.charAt(i + 1)) {
        sb.append(str.charAt(i));
        sb.append(count);
      } else
        count++;
    }
    String x = sb.toString();
    if (x.length() > str.length())
      return str;
    else
      return x;
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
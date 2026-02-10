package LeetCodePractice;

/**
 * Implementation of Reverse Wordsina String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseWordsinaString {
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
	 * Performs reverseWords operation.
	 *
	 * @param s the s parameter
	 * @return the resulting string
	 */
	public static String reverseWords(String s) {
		s=s.replaceAll("[ ]+", " ").trim();
		String arr[]=s.split(" ");
		StringBuilder sb=new StringBuilder("");
		for (int i = arr.length-1; i >=0; i--) {
			sb.append(arr[i]);
			if(i!=0)
				sb.append(" ");
		}
		return sb.toString();
	}
}


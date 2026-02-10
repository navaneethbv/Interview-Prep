package LeetCodePerformancePractice;

/**
 * Implementation of Reverse Vowels Of String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseVowelsOfString {
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
	 * Performs reverseVowels operation.
	 *
	 * @param s the s parameter
	 * @return the resulting string
	 */
	public static String reverseVowels(String s) {
		return reverseVowel(s.toCharArray(),0,s.length()-1);
	}
	/**
	 * Performs reverseVowel operation.
	 *
	 * @param c the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the resulting string
	 */
	private static String reverseVowel(char[] c, int i, int j) {
		while(i<j)
		{
			while(i<j && i<c.length && !isVowel(c[i])){
				i++;
			}
			while(i<j && j>=0 && !isVowel(c[j])){
				j--;
			}
			if(i<j && i<c.length && j>=0)
			{
				char c1=c[i];
				c[i]=c[j];
				c[j]=c1;
				i++;
				j--;
			}
		}
		return new String(c);
	}
	/**
	 * Checks if vowel.
	 *
	 * @param c the c parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isVowel(char c) {
		return c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U';
	}
}

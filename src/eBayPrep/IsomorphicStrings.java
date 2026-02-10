package eBayPrep;

/**
 * Implementation of Isomorphic Strings algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IsomorphicStrings {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(isIsomorphic("add", "egg"));
		System.out.println(isIsomorphic("foo", "bar"));
		System.out.println(isIsomorphic("paper", "title"));
		System.out.println(isIsomorphic("ab", "ba"));
		System.out.println(isIsomorphic("13", "42"));

	}
	/**
	 * Checks if isomorphic.
	 *
	 * @param s the s parameter
	 * @param t the t parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isIsomorphic(String s, String t) {
		int[] str1Array=new int[127];
		int[] str2Array=new int[127];
		if(s.length()!=t.length())
			return false;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			str1Array[s.charAt(i)]++;
			str2Array[t.charAt(i)]++;
		}
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			if(str1Array[s.charAt(i)]!=str2Array[t.charAt(i)])
				return false;
			else{
				str1Array[s.charAt(i)]--;
				str2Array[t.charAt(i)]--;
			}
		}
		return true;
	}
}


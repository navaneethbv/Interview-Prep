package yelpInterview;

/**
 * Implementation of Longest Substring WO Repeat algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestSubstringWORepeat {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring("dvdf"));
		System.out.println(lengthOfLongestSubstring("bpfbhmipx"));

	}

	/**
	 * Performs lengthOfLongestSubstring operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int lengthOfLongestSubstring(String s) {
		String str="";
		int maxLength=0;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			if(!str.contains(s.charAt(i)+""))
			{
				str+=s.charAt(i);
			}
			else
			{
				maxLength=Math.max(maxLength, str.length());
				str=str.substring(str.indexOf(s.charAt(i))+1)+s.charAt(i);
			}
		}
		return maxLength>str.length()?maxLength:str.length();
	}
}


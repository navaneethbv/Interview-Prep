package leetCode;

/*
 * Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

/**
 * Implementation of Reverse Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseInteger {
	 /**
	  * Performs lengthOfLongestSubstring operation.
	  *
	  * @param s the s parameter
	  * @return the computed integer result
	  */
	 public static int lengthOfLongestSubstring(String s) {
		int maxLength=0;
		int length=0;
		StringBuilder sb=new StringBuilder();
		 // Iterate through all elements
		 for (int i = 0; i < s.length(); i++) {
			if(sb.toString().contains(s.charAt(i)+""))
			{
				//int elementIndex=sb.indexOf(s.charAt(i)+"");
				
			}
			else{
				sb.append(s.charAt(i)+"");
				length++;
			}
		}
		 return maxLength>length?maxLength:length;        
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
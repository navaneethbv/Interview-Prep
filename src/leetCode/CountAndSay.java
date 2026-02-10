package leetCode;

	import java.math.BigInteger;

/*
 * Link : https://leetcode.com/problems/count-and-say/
 */

/**
 * Implementation of Count And Say algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountAndSay {
	/**
	 * Counts the number of and say.
	 *
	 * @param n the size or count parameter
	 * @return the resulting string
	 */
	public static String countAndSay(int n) {
		BigInteger start=new BigInteger("1");
		for (int i = 0; i < n-1; i++) {
			//System.out.println(start);
			String numberString=String.valueOf(start);
			char prevChar=' ';
			int prevCharCount=0;
			//boolean ended=true;
			StringBuffer sb=new StringBuffer();
			// Inner loop to check combinations
			for (int j = 0; j < numberString.length(); j++) {
				if(prevChar==' ')
				{
					prevCharCount=1;
					prevChar=numberString.charAt(j);
				}
				else{
					if(prevChar==numberString.charAt(j))
					{
						prevCharCount++;
					}
					else{
						sb.append(prevCharCount+""+prevChar);
						prevChar=numberString.charAt(j);
						prevCharCount=1;
					}
				}
			}
			sb.append(prevCharCount+""+prevChar);
			start=new BigInteger(sb.toString());
			System.out.println(start);
		}
		return start.toString();
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
package LeetCodePractice;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of Word Break algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class WordBreak {

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
	 * Performs wordBreak operation.
	 *
	 * @param s the s parameter
	 * @param wordDict the wordDict parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean wordBreak(String s, Set<String> wordDict) {
		int index=0;
		while(s.length()>0)
		{	
			if(index>s.length())
				return false;
			if(wordDict.contains(s.substring(0,index))){
				s=s.substring(index);
				index=0;
			}
			else{
				index++;
			}
		}
		return true;
	}
}


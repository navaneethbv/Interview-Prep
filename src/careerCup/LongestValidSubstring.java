package careerCup;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/*
 * Link: http://www.geeksforgeeks.org/length-of-the-longest-valid-substring/
 */
/**
 * Implementation of Longest Valid Substring algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestValidSubstring {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds length in the data structure.
	 *
	 * @param inputString the inputString parameter
	 * @return the computed integer result
	 */
	private static int findLength(String inputString) {
		Stack<Character> charStack=new Stack<Character>();
		int count=0,maxCount=0;
		// Iterate through all elements
		for (int i = 0; i < inputString.length(); i++) {
			char element=inputString.charAt(i);
			if(element=='(')
				charStack.push(element);
			else{
				if(!charStack.isEmpty() && charStack.pop()=='(')
				{
					count+=2;
				}
				else{
					charStack=new Stack<Character>();
					if(count>maxCount)
						maxCount=count;
					count=0;
				}
			}
			
		}
		return count>maxCount?count:maxCount;
	}
}

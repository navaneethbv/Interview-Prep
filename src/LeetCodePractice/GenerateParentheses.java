package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Generate Parentheses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GenerateParentheses {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	static List<String> ls;

	/**
	 * Performs generateParenthesis operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static List<String> generateParenthesis(int n) {
		ls=new ArrayList<>();
		parenthesesGenerator("",n,n);
		return ls;
	}


	/**
	 * Performs parenthesesGenerator operation.
	 *
	 * @param str the str parameter
	 * @param forward the forward parameter
	 * @param backward the backward parameter
	 */
	private static void parenthesesGenerator(String str,int forward, int backward) {
		// Check for null/base case
		if(forward==0 && backward==0 )
		{	
			ls.add(str);
			return ;
		}
		if(backward>forward || forward<0 || backward<0)
			return;
		parenthesesGenerator(str+")", forward-1, backward);
		parenthesesGenerator(str+"(", forward, backward-1);
	}
}

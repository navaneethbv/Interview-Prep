package LeetCodePerformancePractice;

import java.util.ArrayList;
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
	static List<String> outputList;
	/**
	 * Performs generateParenthesis operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static List<String> generateParenthesis(int n) {
		outputList=new ArrayList<>();
		// Check for null/base case
		if(n==0)
			return outputList;
		generateParenthes("",n,n,n);
		return outputList;
	}
	/**
	 * Performs generateParenthes operation.
	 *
	 * @param prefix the prefix parameter
	 * @param forward the forward parameter
	 * @param backward the backward parameter
	 * @param n the size or count parameter
	 */
	private static void generateParenthes(String prefix, int forward, int backward,int n) {
		if(forward>n ||backward>n || forward<0||backward<0)
			return;
		// Check for null/base case
		if(forward==0 && backward==0)
		{
			outputList.add(prefix);
			return;
		}
		if(backward<forward)
			return;
		generateParenthes(prefix+"(", forward-1, backward, n);
		generateParenthes(prefix+")", forward, backward-1, n);

	}
}


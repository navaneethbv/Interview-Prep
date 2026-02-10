package eBayPrep;

import java.util.Arrays;
import java.util.HashSet;
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

	}
	static HashSet<String> set=new HashSet<>();
	/**
	 * Performs generateParenthesis operation.
	 *
	 * @param N the size or count parameter
	 * @return the list of results
	 */
	private static List<String> generateParenthesis(int N) {
		printParentheses("",N,N);
		System.out.println(Arrays.toString(set.toArray()));
		return null;
	}

	/**
	 * Performs printParentheses operation.
	 *
	 * @param string the string parameter
	 * @param forward the forward parameter
	 * @param backward the backward parameter
	 */
	private static void printParentheses(String string, int forward,int backward) {
		if(backward>forward || forward<0 ||backward<0)
		{
			return;
		}
		// Check for null/base case
		else if(forward==0 && backward==0)
			set.add(string);

		for (int i = 0; i < forward; i++) {
			printParentheses(string+"(", forward,backward-1);
			printParentheses(string+")", forward-1,backward);
		}
	}
}

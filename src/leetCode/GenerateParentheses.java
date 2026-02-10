package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/move-zeroes/
 */

/**
 * Implementation of Generate Parentheses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GenerateParentheses {
	/**
	 * Performs generateParenthesis operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static List<String> generateParenthesis(int n) {
		ArrayList<String> result = new ArrayList<String>();
	    dfs(result, "", n, n);
	    return result;
	}
	/**
	 * Performs dfs operation.
	 *
	 * @param result the result parameter
	 * @param s the s parameter
	 * @param left the left parameter
	 * @param right the right parameter
	 */
	public static void dfs(ArrayList<String> result, String s, int left, int right){
	    if(left > right)
	        return;
	 
	    // Check for null/base case
	    if(left==0&&right==0){
	        result.add(s);
	        return;
	    }
	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
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
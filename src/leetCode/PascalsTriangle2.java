package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/pascals-triangle-ii/
 */

/**
 * Implementation of Pascals Triangle2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PascalsTriangle2 {
	/**
	 * Retrieves row from the data structure.
	 *
	 * @param rowIndex the rowIndex parameter
	 * @return the list of results
	 */
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> outputList=new ArrayList<>();
		for (int i = 0; i <=rowIndex; i++) {
			outputList.add((int) calculateCombination(rowIndex,i));
		}
		return outputList;
	}

	/**
	 * Performs calculateCombination operation.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 * @return the computed integer result
	 */
	private static long calculateCombination(int n, int k) {	
		long ans=1;
	    k=k>n-k?n-k:k;
	    int j=1;
	    for(;j<=k;j++,n--)
	    {
	        // Check for null/base case
	        if(n%j==0)
	        {
	            ans*=n/j;
	        }else
	        // Check for null/base case
	        if(ans%j==0)
	        {
	            ans=ans/j*n;
	        }else
	        {
	            ans=(ans*n)/j;
	        }
	    }
	    return ans;
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
package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 */
/**
 * Implementation of Longest Common Subsequence DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestCommonSubsequenceDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds lcs in the data structure.
	 *
	 * @param x the x parameter
	 * @param y the y parameter
	 */
	private static void findLCS(String x, String y) {
		int[][] LCS=new int[x.length()+1][y.length()+1];
		// Iterate through all elements
		for (int i = 0; i <= x.length(); i++) {
			for (int j = 0; j <= y.length(); j++) {
				// Check for null/base case
				if(i==0||j==0)
					LCS[i][j]=0;
				else if(x.charAt(i-1)==y.charAt(j-1))
					LCS[i][j]=LCS[i-1][j-1]+1;
				else
					LCS[i][j]=Math.max(LCS[i-1][j],LCS[i][j-1]);
			}
		}
		System.out.println(LCS[x.length()][y.length()]);
	}

}

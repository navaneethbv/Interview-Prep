package GeeksforGeeksPractice;

/*
 * Link: http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
 */
/**
 * Implementation of Edit Distance Algo DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class EditDistanceAlgoDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds edit distance in the data structure.
	 *
	 * @param str1 the str1 parameter
	 * @param str2 the str2 parameter
	 */
	private static void findEditDistance(String str1, String str2) {
		int m=str1.length();
		int n=str2.length();
		int dp[][]=new int[m+1][n+1];
		for (int i = 0; i <=m; i++) {
			// Inner loop to check combinations
			for (int j = 0; j <=n; j++) {
				// Check for null/base case
				if(i==0)
					dp[i][j]=j;
				// Check for null/base case
				else if(j==0)
					dp[i][j]=i;
				else if(str1.charAt(i-1)==str2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				else
					dp[i][j]=Math.min(dp[i][j-1], Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
			}
		}
		System.out.println(dp[m][n]);
	}






}

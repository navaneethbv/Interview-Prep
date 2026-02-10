package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
 */
/**
 * Implementation of Edit Distance DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class EditDistanceDP {
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
	 * @param x the x parameter
	 * @param y the y parameter
	 */
	private static void findEditDistance(String x, String y) {
		int m=x.length();
		int n=y.length();
		int[][] dp=new int[m+1][n+1];
		for (int i = 0; i <=m; i++) {
			// Inner loop to check combinations
			for (int j = 0; j <=n; j++) {
				// Check for null/base case
				if(i==0)
					dp[i][j]=j;
				// Check for null/base case
				else if(j==0)
					dp[i][j]=i;
				else if(x.charAt(i-1)==y.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				else
					dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1]));
			}
		}

		System.out.println(dp[m][n]);

	}

}

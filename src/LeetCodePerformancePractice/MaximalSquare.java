package LeetCodePerformancePractice;

/**
 * Implementation of Maximal Square algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximalSquare {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(maximalSquare(new char[][]{
			{'1','0','1','0','0'},
			{'1','0','1','1','1'},
			{'1','1','1','1','1'},
			{'1','0','0','1','0'}
		}));
	}

	/**
	 * Performs maximalSquare operation.
	 *
	 * @param matrix the array to process
	 * @return the computed integer result
	 */
	public static int maximalSquare(char[][] matrix) {
		// Check for null/base case
		if(matrix==null||matrix.length==0)
			return 0;
		int s[][]=new int[matrix.length][matrix[0].length];
		int max=0;
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			s[i][0]=Integer.parseInt(""+matrix[i][0]);
			max=Math.max(max,s[i][0]);
		}
		// Iterate through all elements
		for (int i = 0; i < s[0].length; i++) {
			s[0][i]=Integer.parseInt(""+matrix[0][i]);
			max=Math.max(max,s[0][i]);
		}

		for (int i = 1; i < s.length; i++) {
			for (int j = 1; j < s[0].length; j++) {
				if(matrix[i][j]=='1')
					s[i][j]=1+Math.min(s[i-1][j-1], Math.min(s[i-1][j], s[i][j-1]));
				else
					s[i][j]=0;
				max=Math.max(max,s[i][j]);
			}	
		}
		return max*max;
	}
}

package servicenowPrep;

/**
 * Implementation of Max Length Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaxLengthMatrix
{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds max length in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findMaxLength(int[][] mat) {
		int max=Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				visited=new boolean[mat.length][mat[0].length];
				max=Math.max(max, getCount(mat,i,j));
			}
		}
		return max+1;
	}
	static boolean[][] visited;
	/**
	 * Retrieves count from the data structure.
	 *
	 * @param mat the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the computed integer result
	 */
	private static int getCount(int[][] mat, int i, int j) {
		if(i<0||j<0||i>mat.length-1||j>mat[0].length-1||visited[i][j])
			return 0;
		visited[i][j]=true;
		int count1=0,count2=0,count3=0,count4=0;
		// Check for null/base case
		if(i-1>=0 && mat[i-1][j]==mat[i][j]+1)
		{
			count1= 1+getCount(mat, i-1, j);
		}
		// Check for null/base case
		if(j-1>=0 && mat[i][j-1]==mat[i][j]+1)
		{
			count2= 1+getCount(mat, i, j-1);
		}
		if(i+1<mat.length && mat[i+1][j]==mat[i][j]+1)
		{
			count3= 1+getCount(mat, i+1, j);
		}
		// Check for null/base case
		if(j+1<mat[0].length && mat[i][j+1]==mat[i][j]+1)
		{
			count4= 1+getCount(mat, i, j+1);
		}
		return Math.max(count1, Math.max(count2, Math.max(count3, count4)));
	}

	

}
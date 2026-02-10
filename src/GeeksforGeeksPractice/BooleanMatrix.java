package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/a-boolean-matrix-question/
 */
/**
 * Implementation of Boolean Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BooleanMatrix {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int mat[][] = { {1, 0, 0, 1},
				{0, 0, 1, 0},
				{0, 0, 0, 0}};
		convertMatrix(mat);
		mat=new int[][]{{1,0},
			{0,0}};
			convertMatrix(mat);

			mat=new int[][]{{0,0,0},
				{0,0,1}};
				convertMatrix(mat);
	}

	/**
	 * Performs convertMatrix operation.
	 *
	 * @param mat the array to process
	 */
	private static void convertMatrix(int[][] mat) {
		boolean rows[]=new boolean[mat.length];
		boolean cols[]=new boolean[mat[0].length];
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(mat[i][j]==1)
				{
					rows[i]=true;
					cols[j]=true;
				}
			}
		}
		// Iterate through all elements
		for (int i = 0; i < rows.length; i++) {
			if(rows[i]==true)
			{
				Arrays.fill(mat[i],1);
			}
		}
		// Iterate through all elements
		for (int i = 0; i < cols.length; i++) {
			if(cols[i]==true)
			{
				// Inner loop to check combinations
				for (int j = 0; j < rows.length; j++) {
					mat[j][i]=1;
				}
			}
		}
		
		// Iterate through all elements
		for (int i = 0; i < rows.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		

	}

}

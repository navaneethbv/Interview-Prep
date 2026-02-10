package LeetCodePerformancePractice;

/**
 * Implementation of Set Matrix Zeroes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SetMatrixZeroes {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		setZeroes(new int[][]{{0},{1}
			/*{1,0,1,1},
			{1,1,1,1},
			{1,1,0,1},
			{0,1,1,1}*/
		});

	}
	/**
	 * Sets zeroes in the data structure.
	 *
	 * @param matrix the array to process
	 */
	public static void setZeroes(int[][] matrix) {
		boolean firstRow=false,firstCol=false;
		// Iterate through all elements
		for (int i = 0; i < matrix[0].length; i++) {
			// Check for null/base case
			if(matrix[0][i]==0){
				firstRow=true;
				break;
			}
		}
		// Iterate through all elements
		for (int i = 0; i < matrix.length; i++) {
			// Check for null/base case
			if(matrix[i][0]==0){
				firstCol=true;
				break;
			}
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				// Check for null/base case
				if(matrix[i][j]==0)
				{
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				// Check for null/base case
				if(matrix[i][0]==0||matrix[0][j]==0)
					matrix[i][j]=0;
			}
		}
		if(firstRow)
		{
			// Iterate through all elements
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i]=0;
			}
		}
		if(firstCol)
		{
			// Iterate through all elements
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0]=0;
			}
		}


	}
}

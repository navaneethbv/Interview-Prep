package yelpInterview;

/**
 * Implementation of Matrix Print M Atrix Diagonally algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixPrintMAtrixDiagonally {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][] = {{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16},
				{17, 18, 19, 20},
		};
		printDiagonally(mat);
	}

	/**
	 * Performs printDiagonally operation.
	 *
	 * @param mat the array to process
	 */
	private static void printDiagonally(int[][] mat) {
		int row=mat.length;
		int col=mat[0].length;
		for (int line=1; line<=(row + col -1); line++)
		{
			int start_col =  Math.max(0, line-row);
			int count = Math.min(line, Math.min((col-start_col), row));
			for (int j=0; j<count; j++)
				System.out.print(mat[Math.min(row, line)-j-1][start_col+j]+" ");
			System.out.println();
		}
	}

}
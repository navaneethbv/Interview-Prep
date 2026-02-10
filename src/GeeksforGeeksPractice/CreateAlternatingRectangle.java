package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/create-a-matrix-with-alternating-rectangles-of-0-and-x/
 */
/**
 * Implementation of Create Alternating Rectangle algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CreateAlternatingRectangle {
	static char[][] mat;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}






	/**
	 * Performs createAlternatingRectangles operation.
	 *
	 * @param noOfRows the noOfRows parameter
	 * @param noOfCols the noOfCols parameter
	 */
	private static void createAlternatingRectangles(int noOfRows, int noOfCols) {
		mat=new char[noOfRows][noOfCols];
		int k=0,l=noOfRows,m=0,n=noOfCols;
		char x='X';
		while(k<l && m<n)
		{
			//first row
			for (int i = m; i <n; i++) {
				mat[k][i]=x;
			}
			k++;
			//last column
			for (int i = k; i < l; i++) {
				mat[i][n-1]=x;
			}
			n--;


			//last row-under condition
			if(m<n)
				for (int i = n-1; i >=m; i--) {
					mat[l-1][i]=x;
				}
			l--;


			//first column-under condition
			if(k<l)
				for (int i = l-1; i >=k; i--) {
					mat[i][m]=x;
				}
			m++;

			x=x=='X'?'O':'X';





		}
		printMatrix(mat);
	}






	/**
	 * Performs printMatrix operation.
	 *
	 * @param s the array to process
	 */
	private static void printMatrix(char[][] s) {
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}

	}


}

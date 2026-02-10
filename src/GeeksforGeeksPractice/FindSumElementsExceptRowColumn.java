package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/find-sum-of-all-elements-in-a-matrix-except-the-elements-in-given-row-andor-column-2/
 */
/**
 * Implementation of Find Sum Elements Except Row Column algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindSumElementsExceptRowColumn {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}
	static int sum;
	static int[] rowSum,colSum; 
	

	/**
	 * Finds sum in the data structure.
	 *
	 * @param mat the array to process
	 * @param arr the array to process
	 */
	private static void findSum(int[][] mat,String[] arr) {
		rowSum=new int[mat.length];
		colSum=new int[mat[0].length];
		sum=0;
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				sum+=mat[i][j];
				rowSum[i]+=mat[i][j];
				colSum[j]+=mat[i][j];
			}
		}
		printMatrix(mat);
		System.out.println(sum);
		System.out.println(Arrays.toString(rowSum));
		System.out.println(Arrays.toString(colSum));
		for (int k = 0; k < arr.length; k++) {
			String str[]=arr[k].split("->");
			int i=Integer.parseInt(str[0]),j=Integer.parseInt(str[1]);
			int indexSum=sum-rowSum[i]-colSum[j]+mat[i][j];
			System.out.println(indexSum);
		}
		
	}

	/**
	 * Performs printMatrix operation.
	 *
	 * @param s the array to process
	 */
	private static void printMatrix(int[][] s) {
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}

	}

}

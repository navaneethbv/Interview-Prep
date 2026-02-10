package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;



/*
 * http://www.geeksforgeeks.org/amazon-interview-set-20/
 *  Find jth element in ith row of a pascal triangle
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1 and so on. pascal(4,2) should return 6.
 */;
/**
 * Implementation of Amazon Interview_20_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_20_04 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 int m=Integer.parseInt(scanner.nextLine());
		 int n=Integer.parseInt(scanner.nextLine());
		 scanner.close();
		 System.out.println(computePascal(m,n));
		 buildPascal(m);
	 }

	/**
	 * Performs buildPascal operation.
	 *
	 * @param m the m parameter
	 */
	private static void buildPascal(int m) {
		int pascalMatrix[][]=new int[m+1][m+1];
		for (int i = 0; i < m+1; i++) {

			// Inner loop to check combinations
			for (int j = 0; j < i+1; j++) {
				// Check for null/base case
				if(j==0)
					pascalMatrix[i][j]=1;
				else if(j==i+1)
					pascalMatrix[i][j]=1;
				else{
					pascalMatrix[i][j]=pascalMatrix[i-1][j-1]+pascalMatrix[i-1][j];
				}
			}
		}
		// Iterate through all elements
		for (int i = 0; i < pascalMatrix.length; i++) {
			System.out.println(Arrays.toString(pascalMatrix[i]));
		}
		
	}

	/**
	 * Performs computePascal operation.
	 *
	 * @param m the m parameter
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int computePascal(int m, int n) {
		//mCn
		int numerator=1;
		for (int i = 1; i <=m ; i++) {
			numerator*=i;
		}
		for (int i = 1; i <=n ; i++) {
			numerator/=i;
		}
		for (int i = 1; i <=(m-n) ; i++) {
			numerator/=i;
		}
		return numerator;
	}
	
	

 }
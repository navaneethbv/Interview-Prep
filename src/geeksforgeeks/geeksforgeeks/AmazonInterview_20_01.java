package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-20/
 * In matrix A[m][n] each row is sorted and each column is sorted,
 * write a function which checks whether a number exists in this matrix or not.
 */;
/**
 * Implementation of Amazon Interview_20_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_20_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		int inputMatrix[][]={{1,4,5,9},
							{10,14,19,27},
							{12,16,21,30},
							{19,45,91,99}};
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int elementCheck=Integer.parseInt(scanner.nextLine());
		scanner.close();
		System.out.println("Element found : "+checkElement(inputMatrix,elementCheck));
	 }

	/**
	 * Performs checkElement operation.
	 *
	 * @param inputMatrix the array to process
	 * @param elementCheck the elementCheck parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkElement(int[][] inputMatrix, int elementCheck) {
		// TODO Auto-generated method stub
		int rowIndex=-1,colIndex=-1;
		
		// Iterate through all elements
		for (int i = 0; i < inputMatrix.length; i++) {
			//get the row number
			if(inputMatrix[i][0]<=elementCheck && elementCheck<=inputMatrix[i][inputMatrix[0].length-1]){
				rowIndex=i;
				break;
			}
		}
		// Iterate through all elements
		for (int i = 0; i < inputMatrix[0].length; i++) {
			//get the col number
			if(inputMatrix[0][i]<=elementCheck && elementCheck<=inputMatrix[inputMatrix.length-1][i]){
				colIndex=i;
				break;
			}
		}
		if(rowIndex!=-1 && colIndex!=-1 && inputMatrix[rowIndex][colIndex]==elementCheck){
			return true;
		}
		return false;
	}

 }
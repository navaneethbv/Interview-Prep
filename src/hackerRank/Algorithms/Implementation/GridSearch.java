package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/the-grid-search
 */
/**
 * Implementation of Grid Search algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GridSearch {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		String[] inputMatrix = null,testMatrix = null;
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			String rowCols[]=scanner.nextLine().split(" ");
			inputMatrix=extractMatrix(inputMatrix,rowCols,scanner);
			rowCols=scanner.nextLine().split(" ");
			testMatrix=extractMatrix(testMatrix,rowCols,scanner);
			System.out.println(checkTestInInput(inputMatrix,testMatrix)==true?"YES":"NO");

		}
	}

	/**
	 * Performs checkTestInInput operation.
	 *
	 * @param inputMatrix the array to process
	 * @param testMatrix the array to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkTestInInput(String[] inputMatrix, String[] testMatrix) {
		// Iterate through all elements
		for (int i = 0; i <=(inputMatrix.length-testMatrix.length); i++) {
			int prevIndex=inputMatrix[i].indexOf(testMatrix[0],0);
			
			while(prevIndex!=-1)
			{	
				int counter=0;
				int k=i;
				// Inner loop to check combinations
				for (int j = 0; j < testMatrix.length; j++) {
					if(inputMatrix[k].substring(prevIndex,prevIndex+testMatrix[0].length()).contentEquals(testMatrix[j]))
					{
						counter++;
					}
					else{
						break;
					}
					k++;
				}
				if(counter==testMatrix.length)
					return true;
				else
					prevIndex=inputMatrix[i].indexOf(testMatrix[0],prevIndex+1);
			}
		}
		return false;
	}

	/**
	 * Performs extractMatrix operation.
	 *
	 * @param inputMatrix the array to process
	 * @param rowCols the array to process
	 * @param scanner the scanner parameter
	 * @return the resulting array
	 */
	private static String[] extractMatrix(String[] inputMatrix, String[] rowCols,Scanner scanner) {
		inputMatrix=new String[Integer.parseInt(rowCols[0])];
		for (int i = 0; i < Integer.parseInt(rowCols[0]); i++) {
			inputMatrix[i]=scanner.nextLine();	
		}
		return inputMatrix;
	}
}

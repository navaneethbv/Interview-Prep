package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Spiral Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SpiralMatrix {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(spiralOrder(new int[][]{
			{2,5,8},
			{4,0,-1}}));
		System.out.println(spiralOrder(new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}}));
	}
	/**
	 * Performs spiralOrder operation.
	 *
	 * @param matrix the array to process
	 * @return the list of results
	 */
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> outputList=new ArrayList<Integer>();
		// Check for null/base case
		if(matrix==null ||matrix.length==0)
			return outputList;
		int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
		while(top<=bottom && left<=right)
		{
			for (int i = left; i <=right; i++) {
				outputList.add(matrix[top][i]);
			}
			top++;
			for (int i = top; i <=bottom; i++) {
				outputList.add(matrix[i][right]);
			}
			right--;
			if(top>bottom)
				continue;
			for (int i = right; i >=left; i--) {
				outputList.add(matrix[bottom][i]);
			}
			bottom--;
			if(left>right)
				continue;
			for (int i = bottom; i >=top; i--) {
				outputList.add(matrix[i][left]);
			}	
			left++;
		}
		return outputList;
	}
}


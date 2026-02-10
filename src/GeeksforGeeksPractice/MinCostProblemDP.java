package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link: http://www.geeksforgeeks.org/dynamic-programming-set-5-edit-distance/
 */
/**
 * Implementation of Min Cost Problem DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinCostProblemDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds min cost in the data structure.
	 *
	 * @param cost the array to process
	 */
	private static void findMinCost(int[][] cost) {
		int newCost[][]=new int[cost.length-1][cost[0].length-1];
		newCost[0][0]=cost[0][0];
		for (int i = 1; i < newCost.length; i++) {
			newCost[0][i]=newCost[0][i-1]+cost[0][i];
		}
		for (int i = 1; i < newCost[0].length; i++) {
			newCost[i][0]=newCost[i-1][0]+cost[i][0];
		}
		
		for (int i = 1; i < newCost.length; i++) {
			for (int j = 1; j < newCost[0].length; j++) {
				newCost[i][j]=Math.min(newCost[i][j-1],Math.max(newCost[i-1][j], newCost[i-1][j-1]))+cost[i][j];
			}
		}
		System.out.println(Arrays.toString(newCost[newCost.length-1]));
	}

}

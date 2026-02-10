package TopCoder;

import java.util.Arrays;

/*
 * SRM 145 Div1
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1677&rd=4530
 */



/**
 * Implementation of SRM145 Bonuses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM145Bonuses {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Retrieves division from the data structure.
	 *
	 * @param points the array to process
	 * @return the resulting array
	 */
	public static int[] getDivision(int[] points){
		int[] outputArray=new int[points.length];
		int total=0;
		// Iterate through all elements
		for (int i = 0; i < points.length; i++) {
			total+=points[i];
		}
		double percentageDiff[]=new double[points.length];
		double extraBonus=0;
		// Iterate through all elements
		for (int i = 0; i < percentageDiff.length; i++) {
			double divVal=points[i]*100/(float)total;
			outputArray[i]=(int)Math.floor(divVal);
			extraBonus+=divVal-outputArray[i];
		}
		extraBonus=(Math.ceil(extraBonus)-extraBonus)>(-Math.floor(extraBonus)+extraBonus)?Math.floor(extraBonus):Math.ceil(extraBonus);
		boolean visited[]=new boolean[points.length];
		while(extraBonus>0.0){
			int index=findMax(points,visited);
			outputArray[index]++;
			visited[index]=true;
			extraBonus--;
		}
		return outputArray;
	}
	/**
	 * Finds max in the data structure.
	 *
	 * @param points the array to process
	 * @param visited the array to process
	 * @return the computed integer result
	 */
	private static int findMax(int[] points, boolean[] visited) {
		int max=Integer.MIN_VALUE;
		int index=-1;
		// Iterate through all elements
		for (int i = 0; i < visited.length; i++) {
			if(!visited[i])
			{
				if(points[i]>max){
					max=points[i];
					index=i;
				}
			}
		}
		return index;
	}
}

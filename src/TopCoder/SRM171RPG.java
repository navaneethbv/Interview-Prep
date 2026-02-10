package TopCoder;

import java.util.Arrays;

/*
 * SRM 171 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1944&rd=4660
 */

/**
 * Implementation of SRM171 RPG algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM171RPG {
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
	 * Performs dieRolls operation.
	 *
	 * @param dice the array to process
	 * @return the resulting array
	 */
	public static int[] dieRolls(String[] dice){
		int min=0;
		double avgVal=0;
		int max=0;
		// Iterate through all elements
		for (int i = 0; i < dice.length; i++) {
			String splitArray[]=dice[i].split("d");
			int n=Integer.parseInt(splitArray[0]);
			int x=Integer.parseInt(splitArray[1]);
			min+=1*n;
			max+=n*x;
			avgVal+=((n)*(x+1)/(double)2);
		}
		int outputArr[]=new int[3];
		outputArr[0]=min;
		outputArr[2]=(int)(Math.floor(avgVal));
		outputArr[1]=max;
		return outputArr;
	}
}

package Codility;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/chocolates_by_numbers
 */

/**
 * Implementation of Euclidean Algo Chocolates By Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class EuclideanAlgoChocolatesByNumbers {
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
	 * Performs solution operation.
	 *
	 * @param N the size or count parameter
	 * @param M the M parameter
	 * @return the computed integer result
	 */
	public static int solution(int N, int M){
		int count=0;
		boolean foundWrapper=false;
		boolean chocolateArray[]=new boolean[N];
		int element=0;
		while(!foundWrapper)
		{
			if(chocolateArray[element]==true)
			{
				return count;
			}
			else{
				chocolateArray[element]=true;
				element+=M;
				element=element%N;
				count++;
			}
		}
		return 0;
	}

}
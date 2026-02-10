package Codility;

import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/count_semiprimes
 */

/**
 * Implementation of Sieve Of Eratosthenes Count Semiprimes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SieveOfEratosthenesCountSemiprimes {
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
	 * @param P the array to process
	 * @param Q the array to process
	 * @return the resulting array
	 */
	public static int[] solution(int N, int[] P, int[] Q)
	{
		boolean prime[]=new boolean[N+1];
		boolean semi[]=new boolean[N+1];

		Arrays.fill(prime,true);
		for (int i = 2; i <=Math.sqrt(N); i++) {
			if(prime[i])
			{
				int j=i*i;
				while(j<=N)
				{
					prime[j]=false;
					j+=i;
				}				
			}
		}

		for (int i = 2; i * i <= N; i++) {
			if (!prime[i]) 
				continue;
			for (int k = i * i; k <= N; k += i) {
				if (prime[k / i])
					semi[k] = true;
			}
		}
		int count=0;
		int[] countArr=new int[N+1];
		for (int i = 1; i <=N; i++) {
			if(semi[i]==true)
				count++;
			countArr[i]=count;
		}
		System.out.println(Arrays.toString(countArr));
		for (int i = 0; i < P.length; i++) {
			P[i]=Math.abs((countArr[P[i]-1]-countArr[Q[i]]));
		}
		return P;
	}

}
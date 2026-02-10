package Codility;

import java.util.ArrayList;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/common_prime_divisors
 */

/**
 * Implementation of Euclidean Algo Common Prime Divisors algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class EuclideanAlgoCommonPrimeDivisors {
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
	 * @param A the array to process
	 * @param B the array to process
	 * @return the computed integer result
	 */
	public static int solution(int[] A, int[] B){
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			int M=A[i],N=B[i];
			if(M<N)
			{
				M=M^N;
				N=M^N;
				M=M^N;
			}
			ArrayList<Integer> longPrimeList=findPrimeFactors(M);
			ArrayList<Integer> shortPrimeList=findPrimeFactors(N);
			// Check for null/base case
			if(!(longPrimeList.size()!=shortPrimeList.size() || longPrimeList.size()==0||shortPrimeList.size()==0))
			{	
				boolean flag=true;
				// Inner loop to check combinations
				for (int j = 0; j <shortPrimeList.size(); j++) {
					if(shortPrimeList.get(j)!=longPrimeList.get(j))
					{
						flag=false;
					}
				}
				if(flag)
					count++;
			}
		}
		return count;
	}
	/**
	 * Finds prime factors in the data structure.
	 *
	 * @param M the M parameter
	 * @return the list of results
	 */
	private static ArrayList<Integer> findPrimeFactors(int M) {
		boolean b[]=new boolean[M+1];
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 2; i <Math.sqrt(M); i++) {
			if(!b[i])
			{
				int j=i*i;
				while(j<=M)
				{
					b[j]=true;
					j+=i;
				}	
			}
		}
		for (int i = 2; i<M; i++) {
			// Check for null/base case
			if(b[i]==false && M%i==0)
				list.add(i);
		}
		return list;
	}



}
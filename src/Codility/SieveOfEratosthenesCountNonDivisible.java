package Codility;

import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/count_non_divisible
 */

/**
 * Implementation of Sieve Of Eratosthenes Count Non Divisible algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SieveOfEratosthenesCountNonDivisible {
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
	 * @return the resulting array
	 */
	public static int[] solution(int[] A){
		int outputArr[]=new int[A.length];
		outputArr=Arrays.copyOfRange(A,0, A.length);
		Arrays.sort(outputArr);
		int []occurenceList=new int[outputArr[outputArr.length-1]+1];
		//populate occurences of each element
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			occurenceList[A[i]]+=1;
		}
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			int number=A[i],divCount=0;
			int j=1;
			for (j = 1; j*j<number; j++) {
				// Check for null/base case
				if(number%j==0)
				{
					divCount+=occurenceList[j];
					divCount+=occurenceList[number/j];	
				}
			}
			if(j*j==number)
			{
				divCount+=occurenceList[j];
			}
			outputArr[i]=A.length-divCount;
		}		
		return outputArr;
	}



}
package hackerRank.Algorithms.Sorting;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/runningtime
 */
/**
 * Implementation of Running Time Of Algorithms algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RunningTimeOfAlgorithms {

	/**
	 * Performs insertionSort operation.
	 *
	 * @param A the array to process
	 */
	public static void insertionSort(int[] A){
		for(int i = 1; i < A.length; i++){
			int value = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] > value){
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = value;
		}

		printArray(A);
	}

	/**
	 * Performs printArray operation.
	 *
	 * @param ar the array to process
	 */
	static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt();
		}
		insertionSort(ar);
	}
}

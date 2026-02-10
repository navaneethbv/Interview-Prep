package Codility;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/peaks
 */

/**
 * Implementation of Prime Nos Peaks algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrimeNosPeaks {
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
	 * @return the computed integer result
	 */
	public static int solution(int[] A){
		//find the number of peaks
		ArrayList<Integer> peakIndexList=new ArrayList<>();
		for (int i = 1; i < A.length-1; i++) {
			if(A[i]>A[i-1] && A[i]>A[i+1])
			{
				peakIndexList.add(i);
			}
		}
		System.out.println(Arrays.toString(peakIndexList.toArray()));
		int arraySize=A.length;
		for (int size = 1; size <=A.length; size++) {
			//check if the blocks of equal length can be divided or not
			if(arraySize%size!=0)
				continue;
			//blocks can be divided
			int noOfBlocks=arraySize/size;
			int elementCount=0;
			//now check if each of the block contains atleast one peak element or not
			for (int i = 0; i < peakIndexList.size(); i++) {
				if(peakIndexList.get(i)/size>elementCount)
					break;
				if(peakIndexList.get(i)/size==elementCount)
					elementCount++;
			}
			if(elementCount==noOfBlocks)
				return noOfBlocks;	
		}
		return 0;
	}
}
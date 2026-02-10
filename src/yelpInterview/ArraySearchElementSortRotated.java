package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Search Element Sort Rotated algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySearchElementSortRotated {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs mergeTwoSortedArrays operation.
	 *
	 * @param mPlusN the array to process
	 * @param N the array to process
	 * @return the resulting array
	 */
	private static  int[] mergeTwoSortedArrays(int[] mPlusN, int[] N) {
		int swapIndex=mPlusN.length-1;
		for (int i = mPlusN.length-1; i >=0; i--) {
			if(mPlusN[i]!=-1)
			{
				mPlusN=swap(mPlusN,i,swapIndex);
				swapIndex--;
			}
		}
		int mPlusNIndex=swapIndex+1;
		int nIndex=0;
		// Iterate through all elements
		for (int i = 0; i < mPlusN.length; i++) {
			if(mPlusNIndex>mPlusN.length-1){
				mPlusN[i]=N[nIndex];
				nIndex++;
				continue;
			}
			if(nIndex>N.length-1){
				mPlusN[i]=mPlusN[mPlusNIndex];
				mPlusNIndex++;
				continue;
			}
			if(mPlusN[mPlusNIndex]>N[nIndex])
			{
				mPlusN[i]=N[nIndex];
				nIndex++;
			}
			else
			{
				mPlusN[i]=mPlusN[mPlusNIndex];
				mPlusNIndex++;
			}
		}
		return mPlusN;
	}

	/**
	 * Performs swap operation.
	 *
	 * @param mPlusN the array to process
	 * @param i the i parameter
	 * @param swapIndex the swapIndex parameter
	 * @return the resulting array
	 */
	private static int[] swap(int[] mPlusN, int i, int swapIndex) {
		mPlusN[i]=mPlusN[i]^mPlusN[swapIndex];
		mPlusN[swapIndex]=mPlusN[i]^mPlusN[swapIndex];
		mPlusN[i]=mPlusN[i]^mPlusN[swapIndex];
		return mPlusN;
	}
}
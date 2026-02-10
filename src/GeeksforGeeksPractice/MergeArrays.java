package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/merge-one-array-of-size-n-into-another-one-of-size-mn/
 */
/**
 * Implementation of Merge Arrays algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MergeArrays {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs mergeArrays operation.
	 *
	 * @param mPlusN the array to process
	 * @param n the array to process
	 */
	private static void mergeArrays(int[] mPlusN, int[] n) {
		int mn=mPlusN.length;
		Arrays.sort(mPlusN);
		int mIndex=0;
		for (int i = 0; i < mn; i++) {
			if(mPlusN[i]==Integer.MAX_VALUE){
				mIndex=i-1;
				break;
			}
		}
		int nIndex=n.length-1;
		for (int i = mPlusN.length-1; i>=0; i--) {
			if(mIndex>-1 && nIndex>-1)
				if(mPlusN[mIndex]>n[nIndex])
				{
					mPlusN[i]=mPlusN[mIndex];
					mIndex--;
				}
				else{
					mPlusN[i]=n[nIndex];
					nIndex--;
				}
			else
				if(mIndex==-1){
					mPlusN[i]=n[nIndex];
					nIndex--;
				}
				else
				{
					mPlusN[i]=mPlusN[mIndex];
					mIndex--;
				}
		}

	}

}

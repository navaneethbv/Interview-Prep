package yelpInterview;

/**
 * Implementation of Matrix Row With Max Ones algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixRowWithMaxOnes {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][]={ {0, 0, 0, 1},
				{0, 1, 1, 1},
				{1, 1, 1, 1},
				{0, 0, 0, 0}
		};
		System.out.println(findRowMaxOnes(mat));
	}

	/**
	 * Finds row max ones in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findRowMaxOnes(int[][] mat) {
		int index=-1,onesCount=0;
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			int startIndex=getIndex(mat[i],0,mat[i].length-1,1);
			if(startIndex!=-1 && mat[0].length-1-startIndex>onesCount )
			{
				onesCount=mat[0].length-1-startIndex;
				index=i;
			}	
		}
		return index;
	}

	/**
	 * Retrieves index from the data structure.
	 *
	 * @param mat the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param value the value value
	 * @return the computed integer result
	 */
	private static int getIndex(int[] mat,int low,int high,int value) {
		if(low<=high)
		{
			int mid=(low+high)/2;
			// Check for null/base case
			if((mid==0||mat[mid]>mat[mid-1]) && mat[mid]==value)
			{
				return mid;
			}
			if(mat[mid]<value)
				// Recursively process left and right subtrees
				return getIndex(mat, mid+1, high, value);
			else
				// Recursively process left and right subtrees
				return getIndex(mat, low, mid-1, value);
		}
		return -1;
	}

}
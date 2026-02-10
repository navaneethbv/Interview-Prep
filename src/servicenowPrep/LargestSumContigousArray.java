package servicenowPrep;

/**
 * Implementation of Largest Sum Contigous Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LargestSumContigousArray
{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds largest sum in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findLargestSum(int[] arr) {
		int currSum=0,max=0;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(currSum+arr[i]<0)
				currSum=0;
			else{
				currSum+=arr[i];
				max=Math.max(max, currSum);
			}
		}
		return max;
	}

	

}
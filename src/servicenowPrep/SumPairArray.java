package servicenowPrep;

/**
 * Implementation of Sum Pair Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SumPairArray
{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds sum in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param outputSum the outputSum parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findSum(int[] inputArray, int outputSum) {
		int left=0,right=inputArray.length-1;
		while(left<right)
		{
			int sum=inputArray[left]+inputArray[right];
			if(sum==outputSum)
				return true;
			else if(sum>outputSum)
				right--;
			else
				left++;
		}
		return false;
	}
}
package Practice;

/**
 * Implementation of Print Pairs Equal To Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintPairsEqualToSum {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs printPairsEqualToSum operation.
	 *
	 * @param array the array to process
	 * @param sum the sum parameter
	 */
	private static void printPairsEqualToSum(int[] array, int sum) {
		int size = array.length;
		int i = 0, k = size - 1;
		int curSum;
		while(i < k)
		{
			curSum = array[i] + array[k];
			if(curSum == sum)
			{
				System.out.println("The numbers are "+array[i]+" and "+array[k]);
				i++;k--;
			}
			else if(curSum < sum)
			{
				i++;
			}
			else
			{
				k--;
			}
		}

	}

}

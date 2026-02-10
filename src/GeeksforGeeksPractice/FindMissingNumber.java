package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/find-the-missing-number/
 */
/**
 * Implementation of Find Missing Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindMissingNumber {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds missing number in the data structure.
	 *
	 * @param a the array to process
	 * @return the computed integer result
	 */
	private static int findMissingNumber(int[] a) {
		int max=Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max=a[i];
		}
		int sum=max*(max+1)/2;
		// Iterate through all elements
		for (int i = 0; i < a.length; i++) {
			sum-=a[i];
		}
		return sum;
	}


}

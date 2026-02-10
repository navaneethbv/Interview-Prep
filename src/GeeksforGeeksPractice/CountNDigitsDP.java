package GeeksforGeeksPractice;

/*
 * Link: http://www.geeksforgeeks.org/count-of-n-digit-numbers-whose-sum-of-digits-equals-to-given-sum/
 */
/**
 * Implementation of Count N Digits DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountNDigitsDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs finalCount operation.
	 *
	 * @param n the size or count parameter
	 * @param sum the sum parameter
	 * @return the computed integer result
	 */
	private static int finalCount(int n, int sum) {
		int ans=0;
		for (int i = 1; i <= 9; i++)
			if (sum-i >= 0)
				ans += countRec(n-1, sum-i);

		return ans;
	}

	/**
	 * Counts the number of rec.
	 *
	 * @param n the size or count parameter
	 * @param sum the sum parameter
	 * @return the computed integer result
	 */
	private static int countRec(int n, int sum) {
		// Check for null/base case
		if (n == 0)
			return sum;

		int ans = 0;

		for (int i=0; i<=9; i++)
			if (sum-i >= 0)
				ans += countRec(n-1, sum-i);

		return ans;
	}

}

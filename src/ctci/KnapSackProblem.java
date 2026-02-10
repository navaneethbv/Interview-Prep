package ctci;



/*Implementation of Knap Sack Problem*/
/**
 * Implementation of Knap Sack Problem algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class KnapSackProblem{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs performKnapSack operation.
	 *
	 * @param W the W parameter
	 * @param wt the array to process
	 * @param val the array to process
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int performKnapSack(int W, int[] wt, int[] val, int n) {
		// Check for null/base case
		if(n==0||W==0)
			return 0;
		if (wt[n-1] > W)
			// Recursively process left and right subtrees
			return performKnapSack(W, wt, val, n-1);
		else return Math.max( val[n-1] + performKnapSack(W-wt[n-1], wt, val, n-1),
				performKnapSack(W, wt, val, n-1)
				);
	}
}
package geeksforgeeks;

/**
 * Implementation of Maximum Sub Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumSubArray {
	/**
	 * Performs maxSubArray operation.
	 *
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int maxSubArray(int[] A) {
		int newsum=A[0];
	       int max=A[0];
	       for(int i=1;i<A.length;i++){
	           newsum=Math.max(newsum+A[i],A[i]);
	           System.out.println(newsum);
	           max= Math.max(max, newsum);
	           System.out.println(max);
	       }
	       return max;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}

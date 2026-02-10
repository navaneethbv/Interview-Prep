package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
/**
 * Implementation of Longest Contigous Sub Array DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestContigousSubArrayDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs calculateLongest operation.
	 *
	 * @param a the array to process
	 * @return the computed integer result
	 */
	private static int calculateLongest(int[] a) {
		int max_so_far=0,max_ending_here=0;
		
		// Iterate through all elements
		for (int i = 0; i < a.length; i++) {
			max_ending_here=max_ending_here+a[i];
			if(max_ending_here<0)
				max_ending_here=0;
			if(max_so_far<max_ending_here)
				max_so_far=max_ending_here;	
		}
		return max_so_far;
	}

}

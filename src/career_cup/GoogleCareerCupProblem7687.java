package careerCup;

/*
 * Link: http://www.careercup.com/question?id=277687
 * Program solution for 'game of life' (3X's in an nXn grid. Initial stage - 3 x's horizontal next to each other.
 * Next step - alternate to vertical 3 x's center one stays at the same position.
 * Stages repeat. I coded using arrays, interviewer was interested in a solution without the use of arrays.
 * http://www.geeksforgeeks.org/dynamic-programming-set-31-optimal-strategy-for-a-game/
 */
/**
 * Implementation of Google Career Cup Problem7687 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem7687 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds maximum in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findMaximum(int[] arr) {
		int n=arr.length, gap, i, j, x, y, z;
		int table[][]=new int[n][n];
		
		for (gap = 0; gap < n; ++gap)
	    {
	        for (i = 0, j = gap; j < n; ++i, ++j)
	        {
	            x = ((i+2) <= j) ? table[i+2][j] : 0;
	            y = ((i+1) <= (j-1)) ? table[i+1][j-1] : 0;
	            z = (i <= (j-2))? table[i][j-2]: 0;
	            table[i][j] = Math.max(arr[i] + Math.min(x, y), arr[j] + Math.min(y, z));
	        }
	    }
	    return table[0][n-1];
	}


}

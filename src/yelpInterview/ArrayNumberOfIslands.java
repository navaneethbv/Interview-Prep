package yelpInterview;

/**
 * Implementation of Array Number Of Islands algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayNumberOfIslands {
	static boolean[][] visited;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int inputArray[][]= {   {1, 1, 0, 0, 0},
				{0, 1, 0, 0, 1},
				{1, 0, 0, 1, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1}
		};

		System.out.println(findIslandsCount(inputArray));
	}
	/**
	 * Finds islands count in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findIslandsCount(int[][] inputArray) {
		int count=0;
		visited=new boolean[inputArray.length][inputArray[0].length];
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray[0].length; j++) {
				if(!visited[i][j] && inputArray[i][j]!=0)
				{
					count+=performDfs(inputArray,i,j)>0?1:0;
				}
			}
		}
		return count;
	}

	/**
	 * Performs performDfs operation.
	 *
	 * @param inputArray the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the computed integer result
	 */
	private static int performDfs(int[][] inputArray, int i, int j) {
		if(!(i>=0 && i<=inputArray.length-1 && j>=0 && j<=inputArray[0].length-1))
			return 0;
		if(visited[i][j])
			return 0;
		visited[i][j]=true;
		// Check for null/base case
		if(inputArray[i][j]==0){
			return 0;
		}
		else
			// Recursively process left and right subtrees
			return 1+performDfs(inputArray, i-1, j-1)
			+performDfs(inputArray, i-1, j)+performDfs(inputArray, i-1, j+1)
			+performDfs(inputArray, i+1, j-1)+performDfs(inputArray, i+1, j)
			+performDfs(inputArray, i+1, j+1);
	}

}
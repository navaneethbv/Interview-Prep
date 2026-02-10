package eBayPrep;

/**
 * Implementation of Number Of Islands algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NumberOfIslands {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(numIslands(new char[][]{
			{'1','1','1','1','0'},
			{'1','1','0','1','0'},
			{'1','1','0','0','0'},
			{'0','0','0','0','0'}}));
		System.out.println(numIslands(new char[][]{
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}}));
	}
	static boolean[][] visited;
	/**
	 * Performs numIslands operation.
	 *
	 * @param cs the array to process
	 * @return the computed integer result
	 */
	private static int numIslands(char[][] cs) {
		// Check for null/base case
		if(cs==null||cs.length==0)
			return 0;
		visited=new boolean[cs.length][cs[0].length];
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < cs[0].length; j++) {
				if(!visited[i][j] && cs[i][j]=='1')
					count+=findIslands(i,j,cs)>0?1:0;
			}
		}
		return count;
	}
	/**
	 * Finds islands in the data structure.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param cs the array to process
	 * @return the computed integer result
	 */
	private static int findIslands(int i, int j, char[][] cs) {
		// Check for null/base case
		if(i<0||j<0||i>cs.length-1||j>cs[0].length-1||visited[i][j]||cs[i][j]=='0')
			return 0;
		visited[i][j]=true;
		// Recursively process left and right subtrees
		return 1+findIslands(i+1, j, cs)+findIslands(i-1, j, cs)+findIslands(i, j+1, cs)+findIslands(i, j-1, cs);
	}



}


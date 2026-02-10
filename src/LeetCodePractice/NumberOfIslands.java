package LeetCodePractice;

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
		System.out.println(numIslands(new char[][]{{'1','1','1','1','0'},
												{'1','1','0','1','0'},
												{'1','1','0','0','0'},
												{'0','0','0','0','0'}}));
		System.out.println(numIslands(new char[][]{{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}}));
	}
	static boolean[][] visited;
	/**
	 * Performs numIslands operation.
	 *
	 * @param grid the array to process
	 * @return the computed integer result
	 */
	public static int numIslands(char[][] grid) {
		int count=0;
		// Check for null/base case
		if(grid.length==0)
			return 0;
		visited=new boolean[grid.length][grid[0].length];
		// Iterate through all elements
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(!visited[i][j] && grid[i][j]=='1'){
					captureGrid(grid,i,j);
					count++;
				}
			}
		}
		return count;
	}
	/**
	 * Performs captureGrid operation.
	 *
	 * @param grid the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 */
	private static  void captureGrid(char[][] grid, int i, int j) {
		if(i<0||i>grid.length-1||j<0||j>grid[0].length-1)
			return;
		// Check for null/base case
		if(grid[i][j]=='0' || visited[i][j])return;
		visited[i][j]=true;
		captureGrid(grid, i-1, j);
		captureGrid(grid, i+1, j);
		captureGrid(grid, i, j-1);
		captureGrid(grid, i, j+1);
	}
}


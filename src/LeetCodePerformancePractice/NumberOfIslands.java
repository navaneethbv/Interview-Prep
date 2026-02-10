package LeetCodePerformancePractice;

/**
 * Implementation of Number Of Islands algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NumberOfIslands {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
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
	static boolean[][] visited;
	/**
	 * Performs numIslands operation.
	 *
	 * @param grid the array to process
	 * @return the computed integer result
	 */
	public int numIslands(char[][] grid) {
		// Check for null/base case
		if(grid==null||grid.length==0)
			return 0;
		int count=0;
		visited=new boolean[grid.length][grid[0].length];
		// Iterate through all elements
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(!visited[i][j] && grid[i][j]=='1')
					count+=findIsland(i,j,grid)+1;
			}
		}
		return count;
	}
	/**
	 * Finds island in the data structure.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param grid the array to process
	 * @return the computed integer result
	 */
	private int findIsland(int i, int j, char[][] grid) {
		// Check for null/base case
		if(i<0||j<0||i>grid.length-1||j>grid[0].length-1||visited[i][j]||grid[i][j]=='0')
			return 0;
		visited[i][j]=true;
		// Recursively process left and right subtrees
		return findIsland(i-1, j, grid)+findIsland(i+1, j, grid)+findIsland(i, j+1, grid)+findIsland(i, j-1, grid);
	}
}

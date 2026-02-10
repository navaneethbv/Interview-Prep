package LeetCodePerformancePractice;

/**
 * Implementation of Rotate Image algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RotateImage {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7};
		int k1 = 3;
		System.out.println("Input: " + Arrays.toString(array1) + ", k: " + k1);
		System.out.println("Output: " + Arrays.toString(rotate(array1, k1)));
		System.out.println();
		
		// Test Case 2: Edge case - rotate by 0
		System.out.println("Test 2: Rotate by 0");
		int[] array2 = new int[]{1, 2, 3};
		int k2 = 0;
		System.out.println("Input: " + Arrays.toString(array2) + ", k: " + k2);
		System.out.println("Output: " + Arrays.toString(rotate(array2, k2)));
		System.out.println();
		
		// Test Case 3: Edge case - single element
		System.out.println("Test 3: Single element");
		int[] array3 = new int[]{1};
		int k3 = 1;
		System.out.println("Input: " + Arrays.toString(array3) + ", k: " + k3);
		System.out.println("Output: " + Arrays.toString(rotate(array3, k3)));
	}
	/**
	 * Rotates the .
	 *
	 * @param matrix the array to process
	 */
	public static void rotate(int[][] matrix) {
		int n=matrix.length;
		for (int i = 0; i < n/2; i++) {
			// Inner loop to check combinations
			for (int j = 0; j <Math.ceil(n/(double)2); j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[n-1-j][i];
				matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
				matrix[j][n-1-i]=temp;
			}
		}
	}
}


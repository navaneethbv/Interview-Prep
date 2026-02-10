package LeetCodePerformancePractice;

/**
 * Implementation of Unique BST algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UniqueBST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
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
	/**
	 * Performs numTrees operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int numTrees(int n) {
		if(n<=1)
			return 1;
		int[] count=new int[n+1];
		count[0]=1;
		count[1]=1;
		for (int i = 2; i < count.length; i++) {
			for (int j = i-1; j >=0; j--) {
				count[i]+=count[j]*count[i-j-1];
			}
		}
		return count[n];
	}

}

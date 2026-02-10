package LeetCodePerformancePractice;

/**
 * Implementation of Kth Smallest BST algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class KthSmallestBST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	static int count=1,element=0;
	/**
	 * Performs kthSmallest operation.
	 *
	 * @param root the tree node to process
	 * @param k the k value
	 * @return the computed integer result
	 */
	public int kthSmallest(TreeNode root, int k) {
		count=1;
		preOrder(root,k);
		return element;
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param root the tree node to process
	 * @param k the k value
	 */
	private void preOrder(TreeNode root,int k) {
		// Check for null/base case
		if(root==null||count>k)
			return;
		preOrder(root.left, k);
		if(count==k)
		{
			element=root.val;
			count++;
			return;
		}
		count++;
		preOrder(root.right,k);
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println("Tree with 2 leaf nodes: " + kthSmallest(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + kthSmallest(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + kthSmallest(root3));
	}

}

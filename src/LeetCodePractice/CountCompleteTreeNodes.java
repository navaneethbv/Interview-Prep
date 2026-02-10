package LeetCodePractice;

/**
 * Implementation of Count Complete Tree Nodes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountCompleteTreeNodes{
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	/**
	 * Counts the number of nodes.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	public int countNodes(TreeNode root) {
		// Check for null/base case
		if(root==null)
			return 0;
		int leftHeight=getLeftHeight(root);
		int rightHeight=getRightHeight(root);

		if(leftHeight==rightHeight)
		{
			return (2<<(leftHeight-1))-1;
		}
		// Recursively process left and right subtrees
		return countNodes(root.left) + countNodes(root.right)+1;

	}

	/**
	 * Retrieves left height from the data structure.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private int getLeftHeight(TreeNode root) {
		// Check for null/base case
		if(root==null)
			return 0;
		int count=0;
		while(root.left!=null)
		{
			count++;
			root=root.left;
		}
		return 1+count;
	}
	/**
	 * Retrieves right height from the data structure.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private int getRightHeight(TreeNode root) {
		// Check for null/base case
		if(root==null)
			return 0;
		int count=0;
		while(root.right!=null)
		{
			count++;
			root=root.right;
		}
		return 1+count;
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
		System.out.println("Tree with 2 leaf nodes: " + countNodes(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + countNodes(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + countNodes(root3));
	}

}


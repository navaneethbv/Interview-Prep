package LeetCodePerformancePractice;

/**
 * Implementation of Sum Root To Leaf Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SumRootToLeafNumbers {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
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
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println("Tree with 2 leaf nodes: " + sumNumbers(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + sumNumbers(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + sumNumbers(root3));
	}
	static int sum=0;
	/**
	 * Performs sumNumbers operation.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	public int sumNumbers(TreeNode root) {
		sum=0;
		findSum(root,"");
		return sum;
	}
	/**
	 * Finds sum in the data structure.
	 *
	 * @param root the tree node to process
	 * @param string the string parameter
	 */
	private void findSum(TreeNode root, String string) {
		// Check for null/base case
		if(root==null)
			return;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null){
			string+=root.val;
			sum+=string.length()>0?Integer.parseInt(string):0;
			return;
		}
		findSum(root.left, string+root.val);
		findSum(root.right, string+root.val);
	}
}

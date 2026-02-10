package LeetCodePerformancePractice;

/**
 * Implementation of Lowest Common Ancestor algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LowestCommonAncestor {
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
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println("Tree with 2 leaf nodes: " + lowestCommonAncestor(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + lowestCommonAncestor(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + lowestCommonAncestor(root3));
	}
	/**
	 * Performs lowestCommonAncestor operation.
	 *
	 * @param root the tree node to process
	 * @param p the p parameter
	 * @param q the q parameter
	 * @return the TreeNode result
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// Check for null/base case
		if(root==null||p==null||q==null)
			return null;
		if(root==p||root==q)
			return root;
		TreeNode left=lowestCommonAncestor(root.left, p, q);
		TreeNode right=lowestCommonAncestor(root.right, p, q);
		// Check if node is a leaf (no children)
		if(left!=null && right!=null)
			return root;
		// Check if node is a leaf (no children)
		else if(left==null&&right==null)
			return null;
		return left!=null?left:right;
	}
}

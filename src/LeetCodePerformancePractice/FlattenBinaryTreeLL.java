package LeetCodePerformancePractice;

import java.util.Stack;

/**
 * Implementation of Flatten Binary Tree LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FlattenBinaryTreeLL {
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
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(6);
		tn.right.right=new TreeNode(7);
		flatten(tn);
	}
	/**
	 * Performs flatten operation.
	 *
	 * @param root1 the root1 parameter
	 */
	public static void flatten(TreeNode root1) {
		Stack<TreeNode> stack=new Stack<TreeNode>();

		TreeNode root=root1;
		while(root!=null ||!stack.isEmpty())
		{
			// Check for null/base case
			if(root.right!=null)
				stack.push(root.right);
			// Check for null/base case
			if(root.left!=null){
				root.right=root.left;
				root.left=null;
			}
			else{
				if(!stack.isEmpty())
					root.right=stack.pop();

			}
			root=root.right;
		}



	}
}

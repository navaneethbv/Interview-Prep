package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Iterative Pre Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IterativePreOrderTraversal
{
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		int value;
		TreeNode left,right;
		public TreeNode( int value) {
			this.value=value;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(20);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(22);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(12);
		tn.right.right=new TreeNode(25);
		tn.left.right.left=new TreeNode(10);
		tn.left.right.right=new TreeNode(14);	
		iterativeTraversal(tn);
		System.out.println();
		preOrder(tn);
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			preOrder(tn.left);
			System.out.print(tn.value+"/");
			preOrder(tn.right);
		}		
	}
	/**
	 * Performs iterativeTraversal operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void iterativeTraversal(TreeNode tn) {
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(tn);
		while(!stack.isEmpty())
		{
			TreeNode tn1=stack.pop();
			System.out.print(tn1.value+"/");
			// Check for null/base case
			if(tn1.right!=null)
				stack.push(tn1.right);
			// Check for null/base case
			if(tn1.left!=null)
				stack.push(tn1.left);
			
		}
		
	}

	
}
package servicenowPrep;

import java.util.HashMap;

/**
 * Implementation of Boundary Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BoundaryTraversal
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
		boundaryTraversal(tn);
	}

	/**
	 * Performs boundaryTraversal operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void boundaryTraversal(TreeNode tn) {
		printLeftNodes(tn);System.out.println();
		printLeafNodes(tn);System.out.println();
		printRightNodes(tn);
	}

	/**
	 * Performs printRightNodes operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void printRightNodes(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			printLeftNodes(tn.right);
			System.out.print(tn.value+"/");
		}
	}

	/**
	 * Performs printLeafNodes operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void printLeafNodes(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
				System.out.print(tn.value+"/");
			printLeafNodes(tn.left);
			printLeafNodes(tn.right);			
		}
	}

	/**
	 * Performs printLeftNodes operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void printLeftNodes(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			System.out.print(tn.value+"/");
			printLeftNodes(tn.left);
		}
	}

}
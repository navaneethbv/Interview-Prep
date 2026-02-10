package GeeksforGeeksPractice;

import GeeksforGeeksPractice._0022VerticalSumInTree.TreeNode;

/**
 * Implementation of Size Of Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SizeOfTree {

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
		System.out.println(sizeOfTree(tn));

	}

	/**
	 * Performs sizeOfTree operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int sizeOfTree(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return 1+sizeOfTree(tn.left)+sizeOfTree(tn.right);
			
		}
		return 0;
	}

	
}

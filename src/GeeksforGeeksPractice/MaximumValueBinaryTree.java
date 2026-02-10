package GeeksforGeeksPractice;

/*
 * Link : http://geeksquiz.com/find-maximum-or-minimum-in-binary-tree/
 */
/**
 * Implementation of Maximum Value Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumValueBinaryTree {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(2);
		tn.left=new TreeNode(7);
		tn.right=new TreeNode(5);
		tn.left.right=new TreeNode(6);
		tn.left.right.left=new TreeNode(1);
		tn.left.right.right=new TreeNode(11);
		tn.right.right=new TreeNode(9);
		tn.right.right.left=new TreeNode(4);
		System.out.println(findMax(tn));
		System.out.println(findMin(tn));
		
	}

	

	/**
	 * Finds min in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int findMin(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return Math.min(tn.value,Math.min(findMin(tn.left),findMin(tn.right)));
		}
		return Integer.MAX_VALUE;
	}



	/**
	 * Finds max in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int findMax(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return Math.max(tn.value,Math.max(findMax(tn.left),findMax(tn.right)));
		}
		return Integer.MIN_VALUE;
	}



	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		TreeNode left,right;
		int value;
		public TreeNode(int value) {
			this.value=value;
		}		
	}


}

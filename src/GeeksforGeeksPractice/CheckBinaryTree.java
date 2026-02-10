package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/check-whether-binary-tree-full-binary-tree-not/
 */
/**
 * Implementation of Check Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckBinaryTree {
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
		System.out.println(checkBinaryTree(tn));
		
		TreeNode tn1=new TreeNode(1);
		tn1.left=new TreeNode(2);
		tn1.right=new TreeNode(3);
		tn1.left.left=new TreeNode(4);
		System.out.println(checkBinaryTree(tn1));
	}
	
	/**
	 * Performs checkBinaryTree operation.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkBinaryTree(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
				return true;
			// Check if node is a leaf (no children)
			if(tn.left==null|| tn.right==null)
				return false;
			// Recursively process left and right subtrees
			return checkBinaryTree(tn.left) && checkBinaryTree(tn.right);
		}
		return false;
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

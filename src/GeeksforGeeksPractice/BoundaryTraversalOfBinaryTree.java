package GeeksforGeeksPractice;

/**
 * Implementation of Boundary Traversal Of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BoundaryTraversalOfBinaryTree {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode next;
		TreeNode(int x) { val = x; }
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		TreeNode tn=new TreeNode(20);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(22);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(12);
		tn.left.right.left=new TreeNode(10);
		tn.left.right.right=new TreeNode(14);
		tn.right.right=new TreeNode(25);
		boundaryTraversal(tn);
		//20//8//4//
		//4//10//14//25//
		//20//22//25//
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
				System.out.print(tn.val+"//");
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
			System.out.print(tn.val+"//");
			printLeftNodes(tn.left);
		}
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
			printRightNodes(tn.right);
			System.out.print(tn.val+"//");
		}
	}
	

}

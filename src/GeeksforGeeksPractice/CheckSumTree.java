package GeeksforGeeksPractice;

/**
 * Implementation of Check Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckSumTree {
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
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		TreeNode tn=new TreeNode(26);
		tn.left=new TreeNode(10);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(6);
		tn.left.right=new TreeNode(4);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(2);
		System.out.println(checkSumTree(tn));
	}
	/**
	 * Performs checkSumTree operation.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean checkSumTree(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
				return true;
			if (tn.val==(sum(tn.left)+sum(tn.right)) && checkSumTree(tn.left) && checkSumTree(tn.right))
				return true;
			return false;
		}
		return true;
	}
	/**
	 * Performs sum operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int sum(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return tn.val+sum(tn.left)+sum(tn.right);
		}
		return 0;
	}

}

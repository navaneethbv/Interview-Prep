package GeeksforGeeksPractice;

/**
 * Implementation of Size Of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SizeOfBinaryTree {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.right=new TreeNode(4);
		tn.left.left=new TreeNode(5);
		tn.left.left.left=new TreeNode(6);
		tn.left.left.left.left=new TreeNode(7);
		System.out.println(findSize(tn));//should get 5 as output
	}

	/**
	 * Finds size in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	public static int findSize(TreeNode tn){
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return 1+Math.max(findSize(tn.left), findSize(tn.right));
		}	
		return 0;
	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}

package GeeksforGeeksPractice;

/**
 * Implementation of Reverse Level Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseLevelOrderTraversal {
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
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(5);
		reverseLevelOrderTraversal(tn);
	}
	/**
	 * Performs reverseLevelOrderTraversal operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void reverseLevelOrderTraversal(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = height; i >=0; i--) {
			printNodes(tn,i);
		}
	}
	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 */
	private static void printNodes(TreeNode tn, int i) {
		// Check for null/base case
		if(tn!=null)
		{
			if(i==1)
			{
				System.out.println(tn.val);
			}
			printNodes(tn.left, i-1);
			printNodes(tn.right, i-1);
		}

	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(tn.left), getHeight(tn.right));

		}
		return 0;
	}

}

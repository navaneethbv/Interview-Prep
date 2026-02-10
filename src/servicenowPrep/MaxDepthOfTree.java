package servicenowPrep;
/**
 * Implementation of Max Depth Of Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaxDepthOfTree
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
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(6);
		tn.right.right=new TreeNode(7);
		System.out.println(maxDepth(tn));
	}

	/**
	 * Performs maxDepth operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int maxDepth(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return 0;
		// Recursively process left and right subtrees
		return 1+Math.max(maxDepth(tn.left), maxDepth(tn.right));
	}

	
}
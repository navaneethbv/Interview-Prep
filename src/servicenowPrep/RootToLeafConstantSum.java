package servicenowPrep;
/**
 * Implementation of Root To Leaf Constant Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RootToLeafConstantSum
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
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(2);
		System.out.println(rootSum(tn,114));
	}

	/**
	 * Performs rootSum operation.
	 *
	 * @param tn the tree node to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean rootSum(TreeNode tn, int sum) {
		// Check for null/base case
		if(tn==null)
			return false;
		sum-=tn.value;
		// Check if node is a leaf (no children)
		if(sum==0 && tn.right==null && tn.left==null)
			return true;
		// Recursively process left and right subtrees
		return rootSum(tn.left, sum)||rootSum(tn.right, sum);
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param left the left parameter
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode left) {
		// Recursively process left and right subtrees
		return left==null?0:1+Math.max(getHeight(left.left), getHeight(left.right));
	}

}
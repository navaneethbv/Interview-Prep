package servicenowPrep;
/**
 * Implementation of Is Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IsSumTree
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
		TreeNode tn=new TreeNode(26);
		tn.left=new TreeNode(10);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(6);
		//tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(31);
		System.out.println(isSumTree(tn));
	}

	/**
	 * Checks if sum tree.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isSumTree(TreeNode tn) {
		// Check if node is a leaf (no children)
		if(tn==null||tn.left==null && tn.right==null)
			return true;
		int leftSum=getSum(tn.left);
		int rightSum=getSum(tn.right);
		// Recursively process left and right subtrees
		return tn.value==leftSum+rightSum && isSumTree(tn.left) && isSumTree(tn.right);
	}

	/**
	 * Retrieves sum from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getSum(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return 0;
		// Recursively process left and right subtrees
		return tn.value+getSum(tn.left)+getSum(tn.right);
	}

	
	


}
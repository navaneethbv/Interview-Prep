package servicenowPrep;
/**
 * Implementation of Foldable Binary Trees algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FoldableBinaryTrees
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
		tn.left=new TreeNode(7);
		tn.right=new TreeNode(15);
		tn.left.left=new TreeNode(9);
		//tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(11);
		System.out.println(isFoldable(tn));
	}

	/**
	 * Checks if foldable.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isFoldable(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return true;
		mirror(tn.left);
		boolean res=isFoldableTrees(tn.left,tn.right);
		mirror(tn.left);
		return res;
	}

	/**
	 * Checks if foldable trees.
	 *
	 * @param tn1 the tn1 parameter
	 * @param tn2 the tn2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isFoldableTrees(TreeNode tn1, TreeNode tn2) {
		// Check for null/base case
		if(tn1==null && tn2==null)
			return true;
		// Check for null/base case
		if(tn1==null||tn2==null)
			return false;
		// Recursively process left and right subtrees
		return isFoldableTrees(tn1.left,tn2.left) && isFoldableTrees(tn1.right,tn2.right);
	}

	/**
	 * Performs mirror operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void mirror(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return;
		mirror(tn.left);
		mirror(tn.right);
		TreeNode temp=tn.left;
		tn.left=tn.right;
		tn.right=temp;
	}

	

}
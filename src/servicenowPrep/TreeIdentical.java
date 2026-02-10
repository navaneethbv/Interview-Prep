package servicenowPrep;
/**
 * Implementation of Tree Identical algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TreeIdentical
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
		TreeNode tn1=new TreeNode(1);
		tn1.left=new TreeNode(2);
		tn1.right=new TreeNode(3);
		tn1.left.left=new TreeNode(4);
		tn1.left.right=new TreeNode(5);
		tn1.right.left=new TreeNode(6);
		tn1.right.right=new TreeNode(7);
		System.out.println(isIdentical(tn,tn1));
	}

	/**
	 * Checks if identical.
	 *
	 * @param tn the tree node to process
	 * @param tn1 the tn1 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isIdentical(TreeNode tn, TreeNode tn1) {
		// Check for null/base case
		if(tn==null && tn1==null)
			return true;
		// Check for null/base case
		if(tn==null||tn1==null)
			return false;
		// Recursively process left and right subtrees
		return tn.value==tn1.value && isIdentical(tn.left, tn1.left) && isIdentical(tn.right, tn1.right);
	}
	
}
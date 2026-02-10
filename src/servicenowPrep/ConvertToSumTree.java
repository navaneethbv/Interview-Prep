package servicenowPrep;
/**
 * Implementation of Convert To Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ConvertToSumTree
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
		tn.left=new TreeNode(-2);
		tn.right=new TreeNode(6);
		tn.left.left=new TreeNode(8);
		tn.left.right=new TreeNode(-4);
		tn.right.left=new TreeNode(7);
		tn.right.right=new TreeNode(5);
		System.out.println(convertTree(tn));
		preOrder(tn);
	}

	/**
	 * Performs convertTree operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int convertTree(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return 0;
		int old_val=tn.value;
		tn.value=convertTree(tn.left)+convertTree(tn.right);
		return tn.value+old_val;
	}

	/**
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			preOrder(tn.left);
			System.out.println(tn.value);
			preOrder(tn.right);
		}
	}

	


}
package servicenowPrep;
/**
 * Implementation of Double Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DoubleTree
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
		tn=(doubleTree(tn));
		preOrder(tn);
	}

	/**
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return;
		preOrder(tn.left);
		preOrder(tn.right);
		System.out.println(tn.value);
	}

	/**
	 * Performs doubleTree operation.
	 *
	 * @param tn the tree node to process
	 * @return the TreeNode result
	 */
	private static TreeNode doubleTree(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return tn;
		doubleTree(tn.left);
		doubleTree(tn.right);
		TreeNode oldLeft=tn.left;
		tn.left=new TreeNode(tn.value);
		tn.left.left=oldLeft;
		return tn;
	}

}
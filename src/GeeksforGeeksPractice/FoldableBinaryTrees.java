package GeeksforGeeksPractice;

/**
 * Implementation of Foldable Binary Trees algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FoldableBinaryTrees {
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
		TreeNode tn=new TreeNode(50);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		//tn.left.right=new TreeNode(5);
		//tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(30);
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
		if(tn!=null)
		{
			mirror(tn.left);
			if(isStructureSame(tn.left,tn.right))
			{
				mirror(tn.left);
				return true;
			}
			
		}
		return false;
	}
	/**
	 * Checks if structure same.
	 *
	 * @param left the left parameter
	 * @param right the right parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isStructureSame(TreeNode left, TreeNode right) {
		// Check if node is a leaf (no children)
		if(left==null && right==null)
		{
			return true;
		}
		// Check if node is a leaf (no children)
		else if(left==null||right==null)
		{
			return false;
		}
		else{
			// Recursively process left and right subtrees
			return isStructureSame(left.left, right.left) && isStructureSame(left.right, right.right);
		}
	}
	/**
	 * Performs mirror operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void mirror(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			mirror(tn.left);
			mirror(tn.right);
			TreeNode temp=tn.left;
			tn.left=tn.right;
			tn.right=temp;
		}
		
	}
}

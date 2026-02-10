package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/check-given-binary-tree-follows-height-property-red-black-tree/
 */
/**
 * Implementation of Left Right To Down Right algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LeftRightToDownRight {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		tn.right.left = new TreeNode(4);
		tn.right.right = new TreeNode(5);
		tn.right.left.left = new TreeNode(6);
		tn.right.right.left = new TreeNode(7);
		tn.right.right.right = new TreeNode(8);
		convertRepresentation(tn);
		downRightTraversal(tn);
	}

	/**
	 * Performs downRightTraversal operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void downRightTraversal(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			System.out.print(tn.value+"//");
			downRightTraversal(tn.right);
			downRightTraversal(tn.left);
		}
	}

	/**
	 * Performs convertRepresentation operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void convertRepresentation(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			convertRepresentation(tn.left);
			convertRepresentation(tn.right);
			// Check for null/base case
			if(tn.left==null)
				tn.left=tn.right;
			else
				tn.left.right=tn.right;
			tn.right=null;
		}

	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		TreeNode left,right;
		int value;
		public TreeNode(int value) {
			this.value=value;
		}		
	}

}

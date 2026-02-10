package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/remove-all-nodes-which-lie-on-a-path-having-sum-less-than-k/
 */
/**
 * Implementation of Remove Nodes Sum Path algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveNodesSumPath {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		tn.left.left = new TreeNode(4);
		tn.left.right = new TreeNode(5);
		tn.right.left = new TreeNode(6);
		tn.right.right = new TreeNode(7);
		tn.left.left.left = new TreeNode(8);
		tn.left.left.right = new TreeNode(9);
		tn.left.right.left = new TreeNode(12);
		tn.right.right.left = new TreeNode(10);
		tn.right.right.left.right = new TreeNode(11);
		tn.left.left.right.left = new TreeNode(13);
		tn.left.left.right.right = new TreeNode(14);
		tn.left.left.right.right.left = new TreeNode(15);
		preOrder(tn);System.out.println();
		tn=pruneTree(tn,20);
		preOrder(tn);

	}



	/**
	 * Performs pruneTree operation.
	 *
	 * @param tn the tree node to process
	 * @param k the k value
	 * @return the TreeNode result
	 */
	private static TreeNode pruneTree(TreeNode tn, int k) {
		// Recursively process left and right subtrees
		return pruneTreeUtil(tn,k);
	}

	/**
	 * Performs pruneTreeUtil operation.
	 *
	 * @param tn the tree node to process
	 * @param sum the sum parameter
	 * @return the TreeNode result
	 */
	private static TreeNode pruneTreeUtil(TreeNode tn,int sum) {
		// Check for null/base case
		if(tn!=null)
		{
			tn.left=pruneTreeUtil(tn.left,sum-tn.value);
			tn.right=pruneTreeUtil(tn.right,sum-tn.value);
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
			{
				if(tn.value<sum)
				{
					tn=null;
				}
			}			
		}
		return tn;
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
			System.out.print(tn.value+"->");
			preOrder(tn.left);
			preOrder(tn.right);
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

package servicenowPrep;
/**
 * Implementation of Binary Tree To Mirror Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreeToMirrorTree
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
		tn=getMirrorTree(tn);
		levelOrderTraversal(tn);
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
	/**
	 * Performs levelOrderTraversal operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void levelOrderTraversal(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = 0; i < height; i++) {
			printNodes(tn,i);
			System.out.println();
		}
	}

	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 */
	private static void printNodes(TreeNode tn, int i) {
		// Check for null/base case
		if(tn==null||i<0)return;
		if(i==0)
			System.out.print(tn.value+"/");
		printNodes(tn.left, i-1);
		printNodes(tn.right, i-1);
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Check for null/base case
		if(tn==null)	
			return 0;
		// Recursively process left and right subtrees
		return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
	}
	/**
	 * Retrieves mirror tree from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the TreeNode result
	 */
	private static TreeNode getMirrorTree(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return tn;
		else
		{
			getMirrorTree(tn.left);
			getMirrorTree(tn.right);			
			TreeNode tn1=tn.left;
			tn.left=tn.right;
			tn.right=tn1;
			return tn;
		}
	}


	
}
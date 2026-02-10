package GeeksforGeeksPractice;

/**
 * Implementation of Binary Mirror Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryMirrorTree {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.right=new TreeNode(4);
		tn.left.left=new TreeNode(5);
		tn.left.left.left=new TreeNode(6);
		tn.left.left.left.left=new TreeNode(7);
		preOrder(tn);System.out.println();
		mirrorTree(tn);
		preOrder(tn);System.out.println();
		//1/2/5/6/7/4/3/
		//1/3/2/4/5/6/7/
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
			System.out.print(tn.val+"/");
			preOrder(tn.left);
			preOrder(tn.right);
		}
	}

	/**
	 * Performs mirrorTree operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void mirrorTree(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			mirrorTree(tn.left);
			mirrorTree(tn.right);
			TreeNode tnNew=tn.left;
			tn.left=tn.right;
			tn.right=tnNew;
		}
	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	
}

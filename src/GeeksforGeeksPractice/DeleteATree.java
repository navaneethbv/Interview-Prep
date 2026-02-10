package GeeksforGeeksPractice;

/**
 * Implementation of Delete A Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DeleteATree {
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
		deleteTree(tn);
		preOrder(tn);System.out.println();	//-1/-1/-1/-1/-1/-1/-1/
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
	 * Performs deleteTree operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void deleteTree(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			deleteTree(tn.left);
			deleteTree(tn.right);
			//make tn as null,but to check output make value as -1
			tn.val=-1;
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

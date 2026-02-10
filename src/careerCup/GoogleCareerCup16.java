package careerCup;

/*
 * Link: http://www.careercup.com/question?id=83696
 * Write code to print out a binary tree so that each depth is printed on its own line.
 * The spacing doesn't need to be correct, but the items within a depth must be in order and on a single line.
 *         1
 *       /   \
 *     2       3
 *            / \
 *           4   5
 *                \ 
 *                 7
 * 1
 * 2 3
 * 4 5
 * 7
 */
/**
 * Implementation of Google Career Cup16 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCup16 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.right.left=new TreeNode(4);
		tn.right.right=new TreeNode(5);
		tn.right.right.right=new TreeNode(7);
		int height=getHeight(tn);
		for (int i = 0; i <=height; i++) {
			printElements(tn,i);
			System.out.println();
		}
	}
	/**
	 * Performs printElements operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 */
	private static void printElements(TreeNode tn,int i) {
		// Check for null/base case
		if(tn!=null)
		{
			if(i==1)
				System.out.print(tn.val);
			printElements(tn.left, i-1);
			printElements(tn.right, i-1);			
		}
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(tn.left),getHeight(tn.right));
		}
		return 0;
	}
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		TreeNode left,right;
		int val;
		public TreeNode(int val) {
			this.val=val;
		}

	}

}

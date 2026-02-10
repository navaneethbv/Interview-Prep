package GeeksforGeeksPractice;

/**
 * Implementation of Diameter Of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DiameterOfBinaryTree {
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
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(30);
		System.out.println(diameter(tn));
		//5
	}
	/**
	 * Performs diameter operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int diameter(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			int leftHeight=getHeight(tn.left);
			int rightHeight=getHeight(tn.right);
			int leftDiameter=diameter(tn.left);
			int rightDiameter=diameter(tn.right);
			return Math.max(leftHeight+rightHeight+1,Math.max(leftDiameter, rightDiameter));
			
		}
		return 0;
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
			return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
		}
		return 0;
	}


}

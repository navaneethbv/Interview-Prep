package GeeksforGeeksPractice;

/**
 * Implementation of Binary Tree Sub Tree Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreeSubTreeCheck {
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
		TreeNode tn1=new TreeNode(10);
		tn1.left=new TreeNode(8);
		tn1.right=new TreeNode(2);
		tn1.left.left=new TreeNode(3);
		tn1.left.right=new TreeNode(5);
		tn1.right.left=new TreeNode(1);
		tn1.right.right=new TreeNode(30);
		TreeNode tn2=new TreeNode(2);
		tn2.left=new TreeNode(1);
		tn2.right=new TreeNode(30);
		System.out.println(checkBinarySubTree(tn1, tn2));

	}
	/**
	 * Performs checkBinarySubTree operation.
	 *
	 * @param tn1 the tn1 parameter
	 * @param tn2 the tn2 parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean checkBinarySubTree(TreeNode tn1,TreeNode tn2){
		tn1=getNode(tn1,tn2);
		return isSubTree(tn1,tn2);
	}
	/**
	 * Checks if sub tree.
	 *
	 * @param tn1 the tn1 parameter
	 * @param tn2 the tn2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isSubTree(TreeNode tn1, TreeNode tn2) {
		// Check for null/base case
		if(tn1!=null && tn2!=null)
		{
			// Recursively process left and right subtrees
			return tn1.val==tn2.val && isSubTree(tn1.left, tn2.left) && isSubTree(tn1.right, tn2.right);
		}
		return (tn1!=null ||tn2!=null)?false:true;
	}
	/**
	 * Retrieves node from the data structure.
	 *
	 * @param tn1 the tn1 parameter
	 * @param tn2 the tn2 parameter
	 * @return the TreeNode result
	 */
	private static TreeNode getNode(TreeNode tn1, TreeNode tn2) {
		// Check for null/base case
		if(tn1!=null){
			if(tn1.val==tn2.val)
				return tn1;
			else
			{
				// Check for null/base case
				if(getNode(tn1.left, tn2)!=null)
				{
					// Recursively process left and right subtrees
					return getNode(tn1.left, tn2);
				}
				else
					// Recursively process left and right subtrees
					return getNode(tn1.right, tn2);
			}
		}
		return null;
	}

}

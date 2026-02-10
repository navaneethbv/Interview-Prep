package GeeksforGeeksPractice;

/**
 * Implementation of Children Sum Property Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ChildrenSumPropertyCheck {
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
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(20);
		tn.right.right=new TreeNode(0);
		System.out.println(checkChildrenSumProperty(tn));//false
	}
	/**
	 * Performs checkChildrenSumProperty operation.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkChildrenSumProperty(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
				return true;
			int leftVal=0,rightVal=0;
			// Check for null/base case
			if(tn.left!=null)
				leftVal=tn.left.val;
			// Check for null/base case
			if(tn.right!=null)
				rightVal=tn.right.val;
			// Recursively process left and right subtrees
			return (tn.val==leftVal+rightVal) && checkChildrenSumProperty(tn.left) && checkChildrenSumProperty(tn.right);
		}
		return true;
	}
}

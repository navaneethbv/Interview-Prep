package GeeksforGeeksPractice;

/**
 * Implementation of Trees Are Identical algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TreesAreIdentical {
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
		TreeNode tn1=new TreeNode(1);
		tn1.left=new TreeNode(2);
		tn1.right=new TreeNode(3);
		tn1.left.right=new TreeNode(4);
		tn1.left.left=new TreeNode(5);
		tn1.left.left.left=new TreeNode(6);
		tn1.left.left.left.left=new TreeNode(8);
		System.out.println(isIdentical(tn,tn1));//returns false
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

	/**
	 * Checks if identical.
	 *
	 * @param tn the tree node to process
	 * @param tn1 the tn1 parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isIdentical(TreeNode tn,TreeNode tn1)
	public static boolean isIdentical(TreeNode tn,TreeNode tn1)
	{	
		if(tn!=null || tn1!=null)
		{
			if(tn!=null && tn1!=null)
			{
				return tn.val==tn1.val && isIdentical(tn.left, tn1.left) && isIdentical(tn.right, tn1.right);
			}
			return false;
		}
		return true;
	}
}

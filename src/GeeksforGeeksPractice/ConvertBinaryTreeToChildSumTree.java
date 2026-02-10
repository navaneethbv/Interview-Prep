package GeeksforGeeksPractice;

/**
 * Implementation of Convert Binary Tree To Child Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ConvertBinaryTreeToChildSumTree {
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
		preOrder(tn);System.out.println();
		modifyChildSumProperty(tn);
		preOrder(tn);
		System.out.println();
		//50/8/3/5/2/1/30/
		//50/19/14/5/31/1/30/

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
	 * Performs modifyChildSumProperty operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void modifyChildSumProperty(TreeNode tn) 
	private static void modifyChildSumProperty(TreeNode tn) 
	{
		if(tn!=null)
		{
			modifyChildSumProperty(tn.left);
			modifyChildSumProperty(tn.right);
			int leftVal=0,rightVal=0;
			if(tn.left!=null)
				leftVal=tn.left.val;
			if(tn.right!=null)
				rightVal=tn.right.val;
			int diff=leftVal+rightVal-tn.val;
			if(diff>0)
			{
				tn.val=tn.val+diff;
			}
			if(diff<0)
			{
				increment(tn,-diff);
			}
		}

	}
	/**
	 * Performs increment operation.
	 *
	 * @param tn the tree node to process
	 * @param diff the diff parameter
	 */
	private static void increment(TreeNode tn, int diff) {
		// Check for null/base case
		if(tn.left!=null)
		{
			tn.left.val+=diff;
			increment(tn.left, diff);
		// Check for null/base case
		}else if(tn.right!=null)
		{
			tn.right.val+=diff;
			increment(tn.right, diff);
		}
		
	}

}

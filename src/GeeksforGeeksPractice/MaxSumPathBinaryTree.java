package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/
 */
/**
 * Implementation of Max Sum Path Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaxSumPathBinaryTree {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(10);
		tn.left.left=new TreeNode(20);
		tn.left.right=new TreeNode(1);
		tn.right.right=new TreeNode(-25);
		tn.right.right.left=new TreeNode(3);
		tn.right.right.right=new TreeNode(4);
		System.out.println(findMaxPath(tn));
	}
	static int res=Integer.MIN_VALUE;
	/**
	 * Finds max path in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int findMaxPath(TreeNode tn) {
		findMaxPathUtil(tn);
		return tn!=null?res:0;
	}

	/**
	 * Finds max path util in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int findMaxPathUtil(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			int left=findMaxPathUtil(tn.left);
			int right=findMaxPathUtil(tn.right);
			int maxSingleVal=Math.max(Math.max(left, right)+tn.value,tn.value);
			int maxTop=Math.max(maxSingleVal, left+right+tn.value);
			res=Math.max(res, maxTop);
			return maxSingleVal;
		}
		return 0;
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

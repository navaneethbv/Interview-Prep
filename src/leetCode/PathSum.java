package leetCode;

/*
 * Link : https://leetcode.com/problems/path-sum/
 */

/**
 * Implementation of Path Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PathSum {
	static int path[]=new int[1000];
	static boolean found=false;
	/**
	 * Checks if path sum.
	 *
	 * @param root the tree node to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean hasPathSum(TreeNode root, int sum) {
		found=false;
		printPaths(root,path,0,sum);		
		return found;
	}
	/**
	 * Performs printPaths operation.
	 *
	 * @param root the tree node to process
	 * @param path2 the array to process
	 * @param pathLen the pathLen parameter
	 * @param sum the sum parameter
	 */
	private static void printPaths(TreeNode root, int[] path2, int pathLen,int sum) {

		// Check for null/base case
		if(root==null)
			return;
		path[pathLen]=root.val;
		pathLen++;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null)
		{
			printArray(path,pathLen,sum);
		}
		else{
			printPaths(root.left, path, pathLen,sum);
			printPaths(root.right, path, pathLen,sum);
		}
	}
	/**
	 * Performs printArray operation.
	 *
	 * @param path2 the array to process
	 * @param pathLen the pathLen parameter
	 * @param sum the sum parameter
	 */
	private static void printArray(int[] path2, int pathLen,int sum) {
		int resultSum=0;
		for (int i = 0; i < pathLen; i++) {
			resultSum+=path2[i];
		}
		if(resultSum==sum)
			found=true;

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
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(1);
		/*tn.left=new TreeNode(4);
		tn.right=new TreeNode(8);
		tn.right.left=new TreeNode(13);
		tn.right.right=new TreeNode(4);
		tn.right.right.right=new TreeNode(1);
		tn.left.left=new TreeNode(11);
		tn.left.left.left=new TreeNode(7);
		tn.left.left.right=new TreeNode(2);*/
		System.out.println(hasPathSum(tn,0));
	}
}
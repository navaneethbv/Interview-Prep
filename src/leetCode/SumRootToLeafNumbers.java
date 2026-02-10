package leetCode;

/*
 * Link : https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */

/**
 * Implementation of Sum Root To Leaf Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SumRootToLeafNumbers {
	static int paths[]=new int[1000];
	static int sum=0;
	/**
	 * Performs sumNumbers operation.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	public static int sumNumbers(TreeNode root) {
		paths=new int[1000];
		sum=0;
		printPaths(root,paths,0);
		return sum;
	}

	/**
	 * Performs printPaths operation.
	 *
	 * @param root the tree node to process
	 * @param paths the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void printPaths(TreeNode root, int[] paths, int pathLen) {
		// Check for null/base case
		if(root==null)
			return;
		paths[pathLen]=root.val;
		pathLen++;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null)
		{
			printElements(paths,pathLen);
		}
		else{
			printPaths(root.left, paths, pathLen);
			printPaths(root.right, paths, pathLen);
		}
	}

	/**
	 * Performs printElements operation.
	 *
	 * @param paths the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void printElements(int[] paths, int pathLen) {
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < pathLen; i++) {
			sb.append(paths[i]);
		}
		System.out.println(sb.toString());
		sum+=Integer.parseInt(sb.toString());
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
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.right=new TreeNode(5);
		tn.left.left=new TreeNode(4);
		tn.right.left=new TreeNode(6);
		tn.right.right=new TreeNode(7);
		
		System.out.println(sumNumbers(tn));
	}
}
package GeeksforGeeksPractice;

import java.util.Arrays;

/**
 * Implementation of Maximum Sum Leaf To Root Path algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumSumLeafToRootPath {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode next;
		TreeNode(int x) { val = x; }
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(-2);
		tn.right=new TreeNode(7);
		tn.left.left=new TreeNode(8);
		tn.left.right=new TreeNode(-4);
		System.out.println(maxSumPath(tn));//17
	}
	static int[]path=new int[1000];
	static int sum=Integer.MIN_VALUE;
	/**
	 * Performs maxSumPath operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int maxSumPath(TreeNode tn) {
		printPath(tn,path,0);
		return sum;
	}
	/**
	 * Performs printPath operation.
	 *
	 * @param tn the tree node to process
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void printPath(TreeNode tn, int[] path, int pathLen) {
		// Check for null/base case
		if(tn!=null)
		{
			path[pathLen]=tn.val;
			pathLen++;
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
			{	
				System.out.println(Arrays.toString(Arrays.copyOfRange(path,0,pathLen)));
				int newSum=0;
				for (int i = 0; i <pathLen; i++) {
					newSum+=path[i];
				}
				if(newSum>sum)
					sum=newSum;				
			}
			printPath(tn.left, path, pathLen);
			printPath(tn.right, path, pathLen);	
		}

	}

}

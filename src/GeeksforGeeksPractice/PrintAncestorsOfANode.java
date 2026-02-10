package GeeksforGeeksPractice;

import java.util.Arrays;

/**
 * Implementation of Print Ancestors Of A Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintAncestorsOfANode {
	static int[] path;
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
		path=new int[1000];
		TreeNode tn=new TreeNode(50);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(30);
		getAncestorsOfANode(tn,path,0,30);
	}
	/**
	 * Retrieves ancestors of a node from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 * @param val the val parameter
	 */
	public static void getAncestorsOfANode(TreeNode tn,int[] path,int pathLen,int val) {
		// Check for null/base case
		if(tn!=null)
		{	
			path[pathLen]=tn.val;
			pathLen++;
			if(tn.val==val)
			{
				System.out.println(Arrays.toString(Arrays.copyOfRange(path,0,pathLen)));
				return ;
			}
			getAncestorsOfANode(tn.left, path, pathLen, val);
			getAncestorsOfANode(tn.right, path, pathLen, val);
		}
	}

}

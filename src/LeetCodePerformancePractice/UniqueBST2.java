package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Unique BST2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UniqueBST2 {
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
		List<TreeNode> outputList=generateTrees(3);
		for (int i = 0; i < outputList.size(); i++) {
			TreeNode tn=outputList.get(i);
			preOrder(tn);
			System.out.println();
		}
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
			preOrder(tn.left);
			System.out.print(tn.val+"/");
			preOrder(tn.right);
		}
	}
	/**
	 * Performs generateTrees operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static List<TreeNode> generateTrees(int n) {
		List<TreeNode> outputList=new ArrayList<>();
		// Check for null/base case
		if(n==0)
			return outputList;
		return treeHelper(1,n);	
	}
	/**
	 * Performs treeHelper operation.
	 *
	 * @param m the m parameter
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	private static List<TreeNode> treeHelper(int m, int n) {
		List<TreeNode> result=new ArrayList<>();
		if(m>n)
		{
			result.add(null);
			return result;
		}
		for (int i = m; i <=n; i++) {
			List<TreeNode> left=treeHelper(m, i-1);
			List<TreeNode> right=treeHelper(i+1, n);
			// Inner loop to check combinations
			for (int j = 0; j < left.size(); j++) {
				for (int j2 = 0; j2 < right.size(); j2++) {
					TreeNode curr=new TreeNode(i);
					curr.left=left.get(j);
					curr.right=right.get(j2);
					result.add(curr);
				}
			}
		}
		return result;
	}


}

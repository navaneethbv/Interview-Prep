package GeeksforGeeksPractice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of Binary Tree Complete Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTreeCompleteCheck {
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
		System.out.println(checkBinaryTree(tn));//true
	}
	/**
	 * Performs checkBinaryTree operation.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkBinaryTree(TreeNode tn) {
		Queue<TreeNode> q=new LinkedList<>();
		// Check for null/base case
		if(tn!=null)
		{
			q.add(tn);
		}
		boolean flag=false;
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			System.out.println(temp.val);
			// Check for null/base case
			if(temp.left!=null){
				if(flag==true)
					return false;
				q.add(temp.left);
			}
			else
				flag=true;
			// Check for null/base case
			if(temp.right!=null){
				if(flag==true)
					return false;
				q.add(temp.right);
			}
			else
				flag=true;
		}
		return true;
	}

}

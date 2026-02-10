package LeetCodePerformancePractice;

import java.util.Stack;

/**
 * Implementation of BST Iterator algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTIterator {
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
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(5);
		tn.right=new TreeNode(15);
		tn.left.left=new TreeNode(2);
		tn.left.right=new TreeNode(8);
		tn.right.left=new TreeNode(12);
		tn.right.right=new TreeNode(18);
		BSTIterator b=new BSTIterator(tn);
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
	}
	/**
	 * Inner class BSTIterator for supporting operations.
	 */
	public static class BSTIterator {
		TreeNode node=null;
		Stack<TreeNode> stack=new Stack<>();
		public BSTIterator(TreeNode root) {
			if(root==null)
				return;
			while(root!=null)
			{
				stack.push(root);
				root=root.left;
			}
		}

		/** @return whether we have a next smallest number */
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		/** @return the next smallest number */
		public int next() {
			if(hasNext())
			{
				TreeNode tn=stack.pop();
				if(tn.right!=null)
				{
					TreeNode tn1=tn.right;
					while(tn1!=null)
					{
						stack.push(tn1);
						tn1=tn1.left;
					}
				}
				return tn.val;
			}
			return -1;
		}
	}

}
package GeeksforGeeksPractice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of Level Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LevelOrderTraversal {
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
		levelOrderTraversal(tn);
		//1/2/3/5/4/6/7/
	}
	/**
	 * Performs levelOrderTraversal operation.
	 *
	 * @param tn the tree node to process
	 */
	public static void levelOrderTraversal(TreeNode tn)
	{	
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		if(tn!=null)
		{
			q.add(tn);
		}
		while(!q.isEmpty())
		{
			TreeNode tnNew=q.poll();
			System.out.print(tnNew.val+"/");
			if(tnNew.left!=null)
				q.add(tnNew.left);
			if(tnNew.right!=null)
				q.add(tnNew.right);
		}
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

}

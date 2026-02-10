package GeeksforGeeksPractice;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Link : http://www.geeksforgeeks.org/find-sum-left-leaves-given-binary-tree/
 */
/**
 * Implementation of Sum Of Left Leaves algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SumOfLeftLeaves {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(20);
		tn.left=new TreeNode(9);
		tn.right=new TreeNode(49);
		tn.left.left=new TreeNode(5);
		tn.left.right=new TreeNode(12);
		tn.left.right.right=new TreeNode(15);
		tn.right.left=new TreeNode(23);
		tn.right.right=new TreeNode(52);
		tn.right.right.left=new TreeNode(50);
		System.out.println(findLeftLeafSum(tn));
	}

	/**
	 * Finds left leaf sum in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int findLeftLeafSum(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			return  (findSum(tn.left,true)+findSum(tn.right,false));
		}
		return 0;
	}

	/**
	 * Finds sum in the data structure.
	 *
	 * @param tn the tree node to process
	 * @param isLeftFlag the isLeftFlag parameter
	 * @return the computed integer result
	 */
	private static int findSum(TreeNode tn, boolean isLeftFlag) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null && isLeftFlag)
			{
				return tn.value;
			}
			// Recursively process left and right subtrees
			return findSum(tn.left, true) + findSum(tn.right, false);
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

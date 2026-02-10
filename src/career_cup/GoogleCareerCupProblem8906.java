package careerCup;

import java.util.HashSet;
import java.util.Set;

/*
 * Link: http://www.careercup.com/question?id=208906
 * Given a tree in which each node is an integer and an array with a set of integers.
 * Determine if all the elements of the array are present in the tree by visiting each node in the tree at most once.
 */
/**
 * Implementation of Google Career Cup Problem8906 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem8906 {
	static  Set<Integer> elementSet=new HashSet<Integer>();
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(6);
		tn.right.right=new TreeNode(7);
		tn.left.left.left=new TreeNode(8);
		int[] inputArray=new int[]{1,2,3,4,5,6,7,8,9};
		System.out.println(checkElements(tn,inputArray));
	}
	/**
	 * Performs checkElements operation.
	 *
	 * @param tn the tree node to process
	 * @param inputArray the array to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkElements(TreeNode tn, int[] inputArray) {
		inorder(tn);
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(!elementSet.contains(inputArray[i]))
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * Performs inorder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void inorder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null){
			inorder(tn.left);
			inorder(tn.right);
			elementSet.add(tn.val);
		}
	}
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		int val;
		TreeNode left,right;
		public TreeNode(int val) {
			this.val=val;
		}
	}
}

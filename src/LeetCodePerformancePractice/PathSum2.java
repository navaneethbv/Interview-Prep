package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Path Sum2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PathSum2 {
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
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println("Tree with 2 leaf nodes: " + pathSum(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + pathSum(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + pathSum(root3));
	}
	static List<List<Integer>> outputList;
	static List<Integer> list;
	/**
	 * Performs pathSum operation.
	 *
	 * @param root the tree node to process
	 * @param sum the sum parameter
	 * @return the list of results
	 */
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		outputList=new ArrayList<>();
		list=new ArrayList<>();
		// Check for null/base case
		if(root==null)
			return outputList;
		list.add(root.val);
		findPaths(root,0,sum,list);
		return outputList;
	}

	/**
	 * Finds paths in the data structure.
	 *
	 * @param root the tree node to process
	 * @param currSum the currSum parameter
	 * @param target the target value
	 * @param list the list parameter
	 */
	private static void findPaths(TreeNode root, int currSum,int target, List<Integer> list) {
		// Check for null/base case
		if(root==null)
			return;
		// Check if node is a leaf (no children)
		if(root.left==null && root.right==null && currSum+root.val==target)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.addAll(list);
			outputList.add(temp);
			return;
		}
		// Check for null/base case
		if(root.left!=null){
			list.add(root.left.val);
			findPaths(root.left, currSum+root.val, target,list);
			list.remove(list.size()-1);
		}
		// Check for null/base case
		if(root.right!=null){
			list.add(root.right.val);
			findPaths(root.right, currSum+root.val, target,list);
			list.remove(list.size()-1);
		}
	}
}

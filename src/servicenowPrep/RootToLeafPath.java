package servicenowPrep;

import java.util.Arrays;

/**
 * Implementation of Root To Leaf Path algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RootToLeafPath
{
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		int value;
		TreeNode left,right;
		public TreeNode( int value) {
			this.value=value;
		}
	}
	static int[] path=new int[1000];
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
		printPaths(tn,path,0);
	}

	/**
	 * Performs printPaths operation.
	 *
	 * @param tn the tree node to process
	 * @param path the array to process
	 * @param level the level parameter
	 */
	private static void printPaths(TreeNode tn,int[] path,int level) {
		// Check for null/base case
		if(tn==null)
			return;
		path[level]=tn.value;
		// Check if node is a leaf (no children)
		if(tn.left==null && tn.right==null)
			System.out.println(Arrays.toString(path));
		printPaths(tn.left, path, level+1);
		printPaths(tn.right, path, level+1);
	}
}
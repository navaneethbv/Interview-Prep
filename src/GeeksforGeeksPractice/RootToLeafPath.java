package GeeksforGeeksPractice;

import java.util.Arrays;

/**
 * Implementation of Root To Leaf Path algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RootToLeafPath {
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
		rootToLeafPath(tn);
		//[1, 2, 5, 6, 7
		//[1, 2, 4, 6, 7
		//[1, 3, 4, 6, 7
	}
	static int path[];
	/**
	 * Performs rootToLeafPath operation.
	 *
	 * @param tn the tree node to process
	 */
	public static void rootToLeafPath(TreeNode tn){
		path=new int[100];
		printNodes(tn,path,0);
	}
	
	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void printNodes(TreeNode tn, int[] path, int pathLen) {
		// Check for null/base case
		if(tn!=null)
		{
			path[pathLen]=tn.val;
			pathLen++;
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
			{
				System.out.println(Arrays.toString(path));
			}
			else{
				printNodes(tn.left, path, pathLen);
				printNodes(tn.right, path, pathLen);
			}
			
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

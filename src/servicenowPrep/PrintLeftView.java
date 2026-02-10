package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Print Left View algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintLeftView
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
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(20);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(22);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(12);
		tn.right.right=new TreeNode(25);
		tn.left.right.left=new TreeNode(10);
		tn.left.right.right=new TreeNode(14);	
		printLeftView(tn);
	}
	static boolean printed=false;
	/**
	 * Performs printLeftView operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void printLeftView(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = 0; i < height; i++) {
			printed=false;
			printNodes(tn,i);
		}
	}
	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 */
	private static void printNodes(TreeNode tn, int i) {
		// Check for null/base case
		if(tn==null||printed)
			return;
		// Check for null/base case
		if(i==0 && !printed){
			System.out.println(tn.value);
			printed=true;
		}
		printNodes(tn.left, i-1);
		printNodes(tn.right, i-1);
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Recursively process left and right subtrees
		return tn==null?0:1+Math.max(getHeight(tn.left), getHeight(tn.right));
	}

}
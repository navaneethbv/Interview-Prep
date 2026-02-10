package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/print-left-view-binary-tree/
 */
/**
 * Implementation of Left View Of A Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LeftViewOfABinaryTree {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(12);
		tn.left=new TreeNode(10);
		tn.right=new TreeNode(30);
		tn.right.left=new TreeNode(25);
		tn.right.right=new TreeNode(40);
		printLeftView(tn);
	}

	static boolean flag=true;
	/**
	 * Performs printLeftView operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void printLeftView(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = 0; i <=height; i++) {
			flag=true;
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
		if(tn!=null)
		{
			if(i==1 && flag){
				System.out.println(tn.value);
				flag=false;
			}
			printNodes(tn.left,i-1);
			printNodes(tn.right,i-1);
		}
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Recursively process left and right subtrees
		return tn!=null?1+Math.max(getHeight(tn.left), getHeight(tn.right)):0;
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

package GeeksforGeeksPractice;

import GeeksforGeeksPractice._0022VerticalSumInTree.TreeNode;

/**
 * Implementation of Maximum Width Of Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumWidthOfTree {

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
		System.out.println(width(tn));

	}

	/**
	 * Performs width operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int width(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			int max=0;
			int height=getHeight(tn);
			for (int i = 0; i <=height; i++) {
				int result=getCount(tn,i);
				System.out.println(i+"//"+result);
				if(result>max)
					max=result;
			}
			return max;
		}
		return 0;
	}

	/**
	 * Retrieves count from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int getCount(TreeNode tn, int i) {
		// Check for null/base case
		if(tn!=null)
		{
			if(i==1){
				System.out.print("<-"+tn.val+"->");
				return 1;
			}
			// Recursively process left and right subtrees
			return getCount(tn.left, i-1)+getCount(tn.right, i-1);
		}
		return 0;
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Check for null/base case
		if(tn!=null){
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
		}
		return 0;
	}

	

	
}

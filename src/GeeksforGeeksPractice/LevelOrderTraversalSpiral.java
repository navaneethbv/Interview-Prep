package GeeksforGeeksPractice;

/**
 * Implementation of Level Order Traversal Spiral algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LevelOrderTraversalSpiral {
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
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(7);
		tn.left.right=new TreeNode(6);
		tn.right.left=new TreeNode(5);
		tn.right.right=new TreeNode(4);
		levelOrderTraversalSpiral(tn);
		//1/
		//2/3/
		//4/5/6/7/
	}
	
	/**
	 * Performs levelOrderTraversalSpiral operation.
	 *
	 * @param tn the tree node to process
	 */
	public static void levelOrderTraversalSpiral(TreeNode tn)
	public static void levelOrderTraversalSpiral(TreeNode tn)
	{
		int height=getHeight(tn);
		boolean flag=false;
		for (int i = 1; i <=height; i++) {
			if(flag)
				getNodes(tn,flag,i);
			else
				getNodes(tn,flag,i);
			flag=!flag;		
			System.out.println();
		}
	}

	/**
	 * Retrieves nodes from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param flag the flag parameter
	 * @param i the i parameter
	 */
	private static void getNodes(TreeNode tn, boolean flag, int i) {
		// Check for null/base case
		if(tn!=null)
		{
			if(i==1){
				System.out.print(tn.val+"/");
			}
			if(flag)
			{
				getNodes(tn.left, flag, i-1);
				getNodes(tn.right, flag, i-1);
			}
			else{
				getNodes(tn.right, flag, i-1);
				getNodes(tn.left, flag, i-1);
			}
		}
		
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(tn.left),getHeight(tn.right));
		}
		return 0;
	}
}

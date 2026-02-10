package GeeksforGeeksPractice;

/**
 * Implementation of Depth Of Deepest Odd Level Leaf Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DepthOfDeepestOddLevelLeafNode {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode next;
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
		tn.left.left=new TreeNode(4);
		tn.right.left=new TreeNode(5);
		tn.right.left.right=new TreeNode(7);
		tn.right.left.right.left=new TreeNode(9);
		tn.right.right=new TreeNode(6);
		tn.right.right.right=new TreeNode(8);
		tn.right.right.right.right=new TreeNode(10);
		tn.right.right.right.right.left=new TreeNode(11);
		findDepthOfDeepestOddLevelLeaf(tn);//4->9
	}
	/**
	 * Finds depth of deepest odd level leaf in the data structure.
	 *
	 * @param tn the tree node to process
	 */
	private static void findDepthOfDeepestOddLevelLeaf(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = height;i>=0; i--) {
			if(i%2!=0){
				printNodes(tn,i);
				break;
			}
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
			// Check if node is a leaf (no children)
			if(i==1 && tn.left==null && tn.right==null)
				System.out.println(tn.val);
			printNodes(tn.left, i-1);
			printNodes(tn.right, i-1);
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
			return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
		}
		return 0;
	}

}

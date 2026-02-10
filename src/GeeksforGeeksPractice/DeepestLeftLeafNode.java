package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/deepest-left-leaf-node-in-a-binary-tree/
 */
/**
 * Implementation of Deepest Left Leaf Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DeepestLeftLeafNode {
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
		tn.right.left=new TreeNode(5);
		tn.right.right=new TreeNode(6);
		tn.right.left.right=new TreeNode(7);
		tn.right.right.right=new TreeNode(8);
		//tn.right.left.right.left=new TreeNode(9);
		tn.right.right.right.right=new TreeNode(10);	
		getDeepestLeftNode(tn);
	}

	static boolean flag=false;
	/**
	 * Retrieves deepest left node from the data structure.
	 *
	 * @param tn the tree node to process
	 */
	private static void getDeepestLeftNode(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = height; i >=0; i--) {
			getLeafNode(tn,i,false);
			if(flag)
				break;
		}
	}

	/**
	 * Retrieves leaf node from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 * @param isLeft the isLeft parameter
	 */
	private static void getLeafNode(TreeNode tn, int i,boolean isLeft) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check if node is a leaf (no children)
			if(i==1 && isLeft && tn.left==null && tn.right==null){
				flag=true;
				System.out.println(tn.value);
			}
			getLeafNode(tn.left, i-1, true);
			getLeafNode(tn.right, i-1, false);
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

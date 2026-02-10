package GeeksforGeeksPractice;

/**
 * Implementation of Convert Tree To Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ConvertTreeToSumTree {
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
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(-2);
		tn.right=new TreeNode(6);
		tn.left.left=new TreeNode(8);
		tn.left.right=new TreeNode(-4);
		tn.right.left=new TreeNode(7);
		tn.right.right=new TreeNode(5);
		preOrder(tn);
		System.out.println();
		getSum(tn);
		preOrder(tn);
		//10//-2//8//-4//6//7//5//
		//20//4//0//0//12//0//0//
	}
	/**
	 * Retrieves sum from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getSum(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			int val=tn.val;
			tn.val=getSum(tn.left)+getSum(tn.right);
			return val+tn.val;
		}
		return 0;
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			System.out.print(tn.val+"//");
			preOrder(tn.left);
			preOrder(tn.right);
		}

	}

}

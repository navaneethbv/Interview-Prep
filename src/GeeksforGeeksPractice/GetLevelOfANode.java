package GeeksforGeeksPractice;

/**
 * Implementation of Get Level Of A Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GetLevelOfANode {
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
		TreeNode tn=new TreeNode(50);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		//tn.left.right=new TreeNode(5);
		//tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(30);
		getLevelOfANode(tn,30,0);
	}
	/**
	 * Retrieves level of a node from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param val the val parameter
	 * @param level the level parameter
	 */
	public static void getLevelOfANode(TreeNode tn,int val, int level) {
		// Check for null/base case
		if(tn!=null)
		{
			if(tn.val==val)
				System.out.println(level);
			else{
				getLevelOfANode(tn.left, val, level+1);
				getLevelOfANode(tn.right, val, level+1);

			}
		}
	}

}

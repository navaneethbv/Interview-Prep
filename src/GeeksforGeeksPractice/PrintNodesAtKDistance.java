package GeeksforGeeksPractice;

/**
 * Implementation of Print Nodes At K Distance algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintNodesAtKDistance {
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
		printAtDistance(tn,2);
	}
	/**
	 * Performs printAtDistance operation.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 */
	public static void printAtDistance(TreeNode tn, int level) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check for null/base case
			if(level==0)
			{
				System.out.println(tn.val);
			}
			else
			{
				printAtDistance(tn.left, level-1);
				printAtDistance(tn.right, level-1);
			}			
		}
		
	}

}

package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/check-leaves-level/
 */
/**
 * Implementation of Leaves At Same Level algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LeavesAtSameLevel {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(12);
		tn.left=new TreeNode(5);
		tn.left.left=new TreeNode(3);
		tn.right=new TreeNode(7);
		tn.right.right=new TreeNode(1);
		System.out.println(checkLevels(tn));
		TreeNode tn1=new TreeNode(12);
		tn1.left=new TreeNode(5);
		tn1.left.left=new TreeNode(3);
		tn1.right=new TreeNode(7);
		System.out.println(checkLevels(tn1));
		TreeNode tn2=new TreeNode(12);
		tn2.left=new TreeNode(5);
		tn2.left.left=new TreeNode(3);
		tn2.left.left.left=new TreeNode(1);
		tn2.left.right=new TreeNode(9);
		tn2.left.right.left=new TreeNode(2);
		System.out.println(checkLevels(tn2));

	}

	static int height=-1;
	static boolean flag=true;
	/**
	 * Performs checkLevels operation.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkLevels(TreeNode tn) {
		height=-1;
		flag=true;
		for (int i = 0; i <=getHeight(tn); i++) {
			getLevel(tn,i,i);
			if(!flag)
				return false;
		}
		return true;
	}

	/**
	 * Retrieves level from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param currLevel the currLevel parameter
	 * @param level the level parameter
	 */
	private static void getLevel(TreeNode tn, int currLevel,int level) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check if node is a leaf (no children)
			if(currLevel==1 && tn.left==null && tn.right==null)
			{
				if(height==-1)
					height=level;
				else if(height!=level)
				{
					flag=false;
				}
			}
			getLevel(tn.left, currLevel-1, level);
			getLevel(tn.right, currLevel-1, level);
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

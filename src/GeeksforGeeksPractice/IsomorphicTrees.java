package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/tree-isomorphism-problem/
 */
/**
 * Implementation of Isomorphic Trees algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IsomorphicTrees {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn1=new TreeNode(1);
		tn1.left=new TreeNode(2);
		tn1.right=new TreeNode(3);
		tn1.left.left=new TreeNode(4);
		tn1.left.right=new TreeNode(5);
		tn1.left.right.left=new TreeNode(7);
		tn1.left.right.right=new TreeNode(8);
		tn1.right.left=new TreeNode(6);

		TreeNode tn2=new TreeNode(1);
		tn2.right=new TreeNode(2);
		tn2.left=new TreeNode(3);
		tn2.right.right=new TreeNode(5);
		tn2.right.left=new TreeNode(4);
		tn2.right.right.right=new TreeNode(7);
		tn2.right.right.left=new TreeNode(8);
		tn2.left.right=new TreeNode(6);
		System.out.println(compareTrees(tn1,tn2));
	}

	/**
	 * Performs compareTrees operation.
	 *
	 * @param tn1 the tn1 parameter
	 * @param tn2 the tn2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean compareTrees(TreeNode tn1, TreeNode tn2) {
		// Check for null/base case
		if(tn1!=null && tn2!=null)
		{
			// Recursively process left and right subtrees
			return tn1.value==tn2.value && (compareTrees(tn1.left, tn2.right) && compareTrees(tn1.right, tn2.left)||
					compareTrees(tn1.left, tn2.left) && compareTrees(tn1.right, tn2.right));
		}
		// Check for null/base case
		else if(tn1!=null || tn2!=null)
		{
			return false;
		}
		return true;
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

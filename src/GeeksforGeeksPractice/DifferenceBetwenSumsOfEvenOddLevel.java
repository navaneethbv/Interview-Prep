package GeeksforGeeksPractice;

/**
 * Implementation of Difference Betwen Sums Of Even Odd Level algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DifferenceBetwenSumsOfEvenOddLevel {
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
		TreeNode tn=new TreeNode(5);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(6);
		tn.left.left=new TreeNode(1);
		tn.left.right=new TreeNode(4);
		tn.left.right.left=new TreeNode(3);
		tn.right.right=new TreeNode(8);
		tn.right.right.right=new TreeNode(9);
		tn.right.right.left=new TreeNode(7);
		System.out.println(findDifference(tn));
	}
	static int evenSum=0,oddSum=0;
	/**
	 * Finds difference in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int findDifference(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = 0; i <=height; i++) {
			sumNodes(tn,i,i%2==0);
		}
		return evenSum-oddSum;
	}

	/**
	 * Performs sumNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 * @param flag the flag parameter
	 */
	private static void sumNodes(TreeNode tn, int i,boolean flag) {
		// Check for null/base case
		if(tn!=null)
		{
			if(i==1){
				System.out.println(tn.val);
				if(flag)
					evenSum+=tn.val;
				else
					oddSum+=tn.val;
			}
			sumNodes(tn.left, i-1,flag);
			sumNodes(tn.right, i-1,flag);
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

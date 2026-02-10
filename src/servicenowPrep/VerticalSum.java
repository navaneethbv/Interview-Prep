package servicenowPrep;

import java.util.HashMap;

/**
 * Implementation of Vertical Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class VerticalSum
{
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		int value;
		TreeNode left,right;
		public TreeNode( int value) {
			this.value=value;
		}
	}
	static HashMap<Integer, Integer> levelCount=new HashMap<>();
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(26);
		tn.left=new TreeNode(10);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(6);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(31);
		verticalSum(tn);
		System.out.println(levelCount);
	}

	/**
	 * Performs verticalSum operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void verticalSum(TreeNode tn) {
		getVerticalSum(tn,0);
	}

	/**
	 * Retrieves vertical sum from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param currLevel the currLevel parameter
	 */
	private static void getVerticalSum(TreeNode tn, int currLevel) {
		// Check for null/base case
		if(tn==null)
			return;
		if(levelCount.containsKey(currLevel))
		{
			levelCount.put(currLevel, levelCount.get(currLevel)+tn.value);
		}
		else{
			levelCount.put(currLevel,tn.value);
		}
		getVerticalSum(tn.left, currLevel-1);
		getVerticalSum(tn.right, currLevel+1);		
	}

}
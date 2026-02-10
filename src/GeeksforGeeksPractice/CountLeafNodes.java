package GeeksforGeeksPractice;

/**
 * Implementation of Count Leaf Nodes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountLeafNodes {
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
		tn.left.right=new TreeNode(4);
		tn.left.left=new TreeNode(5);
		System.out.println(countLeafNodes(tn));//3
	}
	
	/**
	 * Counts the number of leaf nodes.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	public static int countLeafNodes(TreeNode tn)
	public static int countLeafNodes(TreeNode tn)
	{	
		if(tn!=null)
		{
			if(tn.left==null && tn.right==null)
				return 1;
			return countLeafNodes(tn.left)+countLeafNodes(tn.right);
		}
		return 0;
	}
	

}

package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/given-a-binary-tree-how-do-you-remove-all-the-half-nodes/
 */
/**
 * Implementation of Remove All Half Nodes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveAllHalfNodes {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(2);
		tn.left=new TreeNode(7);
		tn.right=new TreeNode(5);
		tn.left.right=new TreeNode(6);
		tn.left.right.left=new TreeNode(1);
		tn.left.right.right=new TreeNode(11);
		tn.right.right=new TreeNode(9);
		tn.right.right.left=new TreeNode(4);
		preOrder(tn);System.out.println();
		tn=removeAllHalfNodes(tn);
		preOrder(tn);
	}
	



	/**
	 * Removes all half nodes from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the TreeNode result
	 */
	private static TreeNode removeAllHalfNodes(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			tn.left=removeAllHalfNodes(tn.left);
			tn.right=removeAllHalfNodes(tn.right);
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
				return tn;
			// Check for null/base case
			if(tn.left==null)
			{
				TreeNode temp=tn.right;
				tn=null;
				return temp;
			}
			
			// Check for null/base case
			if(tn.right==null)
			{
				TreeNode temp=tn.left;
				tn=null;
				return temp;
			}			
		}
		return tn;
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
			System.out.print(tn.value+"->");
			preOrder(tn.left);
			preOrder(tn.right);
		}		
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

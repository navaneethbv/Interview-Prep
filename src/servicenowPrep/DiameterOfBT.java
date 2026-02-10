package servicenowPrep;
/**
 * Implementation of Diameter Of BT algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DiameterOfBT
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

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(2);
		System.out.println(diameter(tn));
	}

	/**
	 * Performs diameter operation.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int diameter(TreeNode tn) {
		// Check for null/base case
		if(tn==null)
			return 0;
		int ld=diameter(tn.left);
		int rd=diameter(tn.right);
		return Math.max(getHeight(tn.left)+getHeight(tn.right)+1,Math.max(ld, rd));
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param left the left parameter
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode left) {
		// Recursively process left and right subtrees
		return left==null?0:1+Math.max(getHeight(left.left), getHeight(left.right));
	}



}
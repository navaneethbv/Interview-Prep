package servicenowPrep;
/**
 * Implementation of Children Sum Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ChildrenSumCheck
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
		System.out.println(checkSum(tn));
	}

	/**
	 * Performs checkSum operation.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkSum(TreeNode tn) {
		// Check if node is a leaf (no children)
		if(tn==null||tn.left==null&&tn.right==null)
			return true;
		int leftValue=tn.left!=null?tn.left.value:0;
		int rightValue=tn.right!=null?tn.right.value:0;
		// Recursively process left and right subtrees
		return tn.value==leftValue+rightValue && checkSum(tn.left) && checkSum(tn.right);
	}

}
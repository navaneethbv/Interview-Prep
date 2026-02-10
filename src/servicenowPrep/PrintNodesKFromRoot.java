package servicenowPrep;
/**
 * Implementation of Print Nodes K From Root algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintNodesKFromRoot
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
		tn.left=new TreeNode(7);
		tn.right=new TreeNode(15);
		tn.left.left=new TreeNode(9);
		//tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(11);
		printNodes(tn,3,1);
	}

	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param k the k value
	 * @param currLevel the currLevel parameter
	 */
	private static void printNodes(TreeNode tn, int k, int currLevel) {
		// Check for null/base case
		if(tn==null)return;
		if(k==currLevel)
		{
			System.out.println(tn.value);
			return;
		}
		printNodes(tn.left, k, currLevel+1);
		printNodes(tn.right, k, currLevel+1);
	}

	

}
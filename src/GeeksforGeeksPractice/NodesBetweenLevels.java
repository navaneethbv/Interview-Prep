package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/given-binary-tree-print-nodes-two-given-level-numbers/ 
 */
/**
 * Implementation of Nodes Between Levels algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NodesBetweenLevels {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(20);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(22);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(12);
		tn.left.right.left=new TreeNode(10);
		tn.left.right.right=new TreeNode(14);
		printNodes(tn,2,4);		
	}
	
	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param low the low parameter
	 * @param high the high parameter
	 */
	private static void printNodes(TreeNode tn,int low, int high) {
		for (int i = low-1; i <=high; i++) {
			findNodes(tn,i);
		}
	}

	/**
	 * Finds nodes in the data structure.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 */
	private static void findNodes(TreeNode tn, int level) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check for null/base case
			if(level==0)
			{
				System.out.println(tn.value);
			}
			findNodes(tn.left, level-1);
			findNodes(tn.right, level-1);
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

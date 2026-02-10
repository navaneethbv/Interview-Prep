package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/segment-tree-set-1-sum-of-given-range/
*/
/**
 * Implementation of Segment Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SegmentTree {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		System.out.println("Tree with 2 leaf nodes: " + insert(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + insert(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + insert(root3));
	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		char value;
		TreeNode left,right,middle;
		public TreeNode(char value) {
			this.value=value;
		}
		
		
		/**
		 * Performs insert operation.
		 *
		 * @param tn the tree node to process
		 * @param value the value value
		 */
		public void insert(TreeNode tn,char value)
		public void insert(TreeNode tn,char value)
		{
			if(tn==null)
			{
				TreeNode tnNew=new TreeNode(value);
			}
			
			if((int)value<tn.value)
			{
				insert(tn.left, value);
			}
			else if((int)value>tn.value)
			{
				insert(tn.right, value);
			}
			else{
				
				
				
			}
			
			
			
		}
		
		
	}

	

	
}

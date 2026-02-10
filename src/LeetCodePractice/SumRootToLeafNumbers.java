package LeetCodePractice;

/**
 * Implementation of Sum Root To Leaf Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SumRootToLeafNumbers {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static  class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
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
		System.out.println("Tree with 2 leaf nodes: " + sumNumbers(root1));
		System.out.println();
		
		// Test Case 2: Edge case - single node (is itself a leaf)
		System.out.println("Test 2: Single node");
		TreeNode root2 = new TreeNode(1);
		System.out.println("Single node tree: " + sumNumbers(root2));
		System.out.println();
		
		// Test Case 3: Edge case - null tree
		System.out.println("Test 3: Null tree");
		TreeNode root3 = null;
		System.out.println("Null tree: " + sumNumbers(root3));
	}
	static int[] path=new int[100];
	static int sum=0;
	/**
	 * Performs sumNumbers operation.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	public static int sumNumbers(TreeNode root) {
		sum=0;
		printNodes(root,"",0);
		return sum;
	}
	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param str the str parameter
	 * @param i the i parameter
	 */
	private static void printNodes(TreeNode tn, String str, int i) {
		// Check for null/base case
		if(tn==null)
			return;
		// Check if node is a leaf (no children)
		if(tn.left==null && tn.right==null)
		{	
			path[i]=tn.val;
			str+=tn.val;
			//sum+=Integer.parseInt(str);
			String s="";
			// Inner loop to check combinations
			for (int j = 0; j <=i; j++) {
				s+=path[j];
			}
			sum+=Integer.parseInt(s);
			return;
		}
		str+=tn.val;
		path[i]=tn.val;
		printNodes(tn.left, str, i+1);
		printNodes(tn.right, str, i+1);

	}
}


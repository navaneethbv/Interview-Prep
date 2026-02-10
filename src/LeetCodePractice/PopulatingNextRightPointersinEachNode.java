package LeetCodePractice;

/**
 * Implementation of Populating Next Right Pointersin Each Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PopulatingNextRightPointersinEachNode {

	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;
		TreeLinkNode(int x) { val = x; }
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeLinkNode tn=new TreeLinkNode(1);
		tn.left=new TreeLinkNode(2);
		tn.right=new TreeLinkNode(3);
		tn.left.left=new TreeLinkNode(4);
		tn.left.right=new TreeLinkNode(5);
		tn.right.left=new TreeLinkNode(6);
		tn.right.right=new TreeLinkNode(7);
		connect(tn);
	}

	/**
	 * Performs connect operation.
	 *
	 * @param root the tree node to process
	 */
	public static void connect(TreeLinkNode root) {
		reverseLevelOrderTraversal(root);
		preOrder(root);
	}

	/**
	 * Performs preOrder operation.
	 *
	 * @param root the tree node to process
	 */
	private static void preOrder(TreeLinkNode root) {
		// Check for null/base case
		if(root!=null)
		{
			preOrder(root.left);
			// Check for null/base case
			if(root.next==null)
			{
				System.out.println(root.val+"/null");
			}
			else{
				System.out.println(root.val+"/"+root.next.val);
			}
			preOrder(root.right);
		}
	}

	/**
	 * Performs reverseLevelOrderTraversal operation.
	 *
	 * @param root the tree node to process
	 */
	private static void reverseLevelOrderTraversal(TreeLinkNode root) {
		int height=getHeight(root);
		for (int i = 0; i < height; i++) {
			present=null;
			printNodes(root,i);
			System.out.println();
		}
	}

	static TreeLinkNode present=null;

	/**
	 * Performs printNodes operation.
	 *
	 * @param root the tree node to process
	 * @param i the i parameter
	 */
	private static void printNodes(TreeLinkNode root, int i) {
		// Check for null/base case
		if(root==null)return;
		if(i==0)
		{
			// Check for null/base case
			if(present==null){
				root.next=null;
				present=root;
			}
			else{
				root.next=present;
				present=root;
			}
		}
		printNodes(root.right, i-1);
		printNodes(root.left, i-1);
	}

	/**
	 * Retrieves height from the data structure.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeLinkNode root) {
		// Recursively process left and right subtrees
		return root==null?0:1+Math.max(getHeight(root.left), getHeight(root.right));
	}

}


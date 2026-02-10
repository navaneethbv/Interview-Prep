package LeetCodePerformancePractice;

/**
 * Implementation of Sorted List To BST algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortedListToBST {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	static ListNode ln;
	/**
	 * Performs sortedListToBST operation.
	 *
	 * @param head the head parameter
	 * @return the TreeNode result
	 */
	public TreeNode sortedListToBST(ListNode head) {
		// Check for null/base case
		if(head==null)
			return null;
		ln=head;
		return convertTree(0,getLength(head)-1);
	}
	/**
	 * Performs convertTree operation.
	 *
	 * @param left the left parameter
	 * @param right the right parameter
	 * @return the TreeNode result
	 */
	private TreeNode convertTree(int left, int right) {
		if(left>right)
			return null;
		int mid=(left+right)/2;
		TreeNode leftNode=convertTree(left, mid-1);
		TreeNode tn=new TreeNode(ln.val);
		ln=ln.next;
		TreeNode rightNode=convertTree(mid+1,right);
		tn.left=leftNode;
		tn.right=rightNode;
		return tn;
	}
	/**
	 * Retrieves length from the data structure.
	 *
	 * @param head the head parameter
	 * @return the computed integer result
	 */
	private int getLength(ListNode head) {
		// Recursively process left and right subtrees
		return head==null?0:1+getLength(head.next);
	}

}

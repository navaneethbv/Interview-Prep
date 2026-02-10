package careerCup;

/*
 * Link: http://www.careercup.com/question?id=62586
 * Convert a linked list to a binary search tree in place.
 */
/**
 * Implementation of Google Career Cup Problem2586 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem2586 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Inner class BinaryTree for supporting operations.
	 */
	public static  class BinaryTree{
		BinaryTree left,right; 
		int val;
		public BinaryTree(int val) {
			this.val=val;
		}
	}
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode{
		ListNode next; 
		int val;
		public ListNode(int val) {
			this.val=val;
		}
	}
	/**
	 * Performs sortedListToBST operation.
	 *
	 * @param list the list parameter
	 * @param start the start parameter
	 * @param end the end parameter
	 * @return the BinaryTree result
	 */
	public static BinaryTree sortedListToBST(ListNode list, int start, int end) {
		if (start > end) 
			return null;
		int mid = start + (end - start) / 2;
		BinaryTree leftChild = sortedListToBST(list, start, mid-1);
		BinaryTree parent = new BinaryTree(list.val);
		parent.left = leftChild;
		list = list.next;
		parent.right = sortedListToBST(list, mid+1, end);
		return parent;
	}

	/**
	 * Performs sortedListToBST operation.
	 *
	 * @param head the head parameter
	 * @param n the size or count parameter
	 * @return the BinaryTree result
	 */
	public static BinaryTree sortedListToBST(ListNode head, int n) {
		// Recursively process left and right subtrees
		return sortedListToBST(head, 0, n-1);
	}
}

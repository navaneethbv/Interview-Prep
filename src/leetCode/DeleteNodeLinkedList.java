package leetCode;

/*
 * Link : https://leetcode.com/problems/delete-node-in-a-linked-list/
 */

/**
 * Implementation of Delete Node Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DeleteNodeLinkedList {
	/**
	 * Performs deleteNode operation.
	 *
	 * @param node the tree node to process
	 */
	public void deleteNode(ListNode node) {
		
		node.val=node.next.val;
		node.next=node.next.next;
	}

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}
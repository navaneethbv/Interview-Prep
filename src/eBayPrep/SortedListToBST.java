package eBayPrep;

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
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode {
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
		ListNode ln=new ListNode(1);
		ln.next=new ListNode(2);
		ln.next.next=new ListNode(3);
		ln.next.next.next=new ListNode(4);
		ln.next.next.next.next=new ListNode(5);
		ln.next.next.next.next.next=new ListNode(6);
		ln.next.next.next.next.next.next=new ListNode(7);
		ln.next.next.next.next.next.next.next=new ListNode(8);
		ln.next.next.next.next.next.next.next.next=new ListNode(9);		
		TreeNode tn=sortedListToBST(ln);
		preOrder(tn);
	}

	/**
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			preOrder(tn.left);
			System.out.println(tn.val);
			preOrder(tn.right);
		}
	}
	/**
	 * Performs sortedListToBST operation.
	 *
	 * @param head the head parameter
	 * @return the TreeNode result
	 */
	public static TreeNode sortedListToBST(ListNode head) {
		// Check for null/base case
		if(head==null)
			return null;
		int length=getLength(head);
		int value=length/2;
		TreeNode tn=new TreeNode(getValue(head,value));
		tn.left=populateNode(head,0,value-1);
		tn.right=populateNode(head,value+1,length-1);		
		return tn;
	}

	/**
	 * Performs populateNode operation.
	 *
	 * @param head the head parameter
	 * @param left the left parameter
	 * @param right the right parameter
	 * @return the TreeNode result
	 */
	private static TreeNode populateNode(ListNode head, int left, int right) {
		if(left>right)
			return null;
		else{
			int mid=(left+right)/2;
			TreeNode tn=new TreeNode(getValue(head, mid));
			tn.left=populateNode(head, left, mid-1);
			tn.right=populateNode(head, mid+1,right);
			return tn;
		}
	}

	/**
	 * Retrieves value from the data structure.
	 *
	 * @param head the head parameter
	 * @param value the value value
	 * @return the computed integer result
	 */
	private static int getValue(ListNode head, int value) {
		int counter=0;
		while(counter<value){
			head=head.next;
			counter++;
		}
		return head.val;
	}

	/**
	 * Retrieves length from the data structure.
	 *
	 * @param ln the ln parameter
	 * @return the computed integer result
	 */
	private static int getLength(ListNode ln) {
		// Check for null/base case
		if(ln==null)
			return 0;
		// Recursively process left and right subtrees
		return 1+getLength(ln.next);
	}


}


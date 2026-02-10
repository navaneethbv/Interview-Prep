package eBayPrep;

/**
 * Implementation of Intersectionof Two Linked Lists algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntersectionofTwoLinkedLists {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
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

	/**
	 * Retrieves intersection node from the data structure.
	 *
	 * @param headA the headA parameter
	 * @param headB the headB parameter
	 * @return the list of results
	 */
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lengthA=getLength(headA);
		int lengthB=getLength(headB);
		if(lengthA>lengthB)
		{
			int diff=lengthA-lengthB;
			while(diff!=0)
			{
				headA=headA.next;diff--;
			}
			while(headA!=headB)
			{
				headA=headA.next;
				headB=headB.next;
			}
			return headA;		
		}
		else
		{
			int diff=lengthB-lengthA;
			while(diff!=0)
			{
				headB=headB.next;diff--;
			}
			while(headA!=headB)
			{
				headA=headA.next;
				headB=headB.next;
			}
			return headA;
		}
	}

	/**
	 * Retrieves length from the data structure.
	 *
	 * @param headA the headA parameter
	 * @return the computed integer result
	 */
	private static int getLength(ListNode headA) {
		// Check for null/base case
		if(headA==null)
			return 0;
		// Recursively process left and right subtrees
		return 1+getLength(headA.next);
	}
}


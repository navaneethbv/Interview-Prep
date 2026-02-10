package LeetCodePractice;

/**
 * Implementation of Intersectionof Two Linked Lists algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntersectionofTwoLinkedLists {
	
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

		int lengthA=0,lengthB=0;
		ListNode pointerA=headA,pointerB=headB;
		while(pointerA!=null)
		{
			pointerA=pointerA.next;
			lengthA++;
		}
		while(pointerB!=null)
		{
			pointerB=pointerB.next;
			lengthB++;
		}
		if(lengthA>lengthB)
		{
			int diff=lengthA-lengthB;
			for (int i = 0; i < diff; i++) {
				headA=headA.next;
			}
			while(headA!=null && headB!=null && headA!=headB )
			{
				headA=headA.next;
				headB=headB.next;
			}
		}
		else{
			int diff=lengthB-lengthA;
			for (int i = 0; i < diff; i++) {
				headB=headB.next;
			}
			while(headA!=null && headB!=null && headA!=headB)
			{
				headA=headA.next;
				headB=headB.next;
			}
		}		
		if(headA==headB)
			return headA;
		return null;

	}
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
}


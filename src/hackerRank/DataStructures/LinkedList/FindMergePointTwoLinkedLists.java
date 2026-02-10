package hackerRank.DataStructures.LinkedList;

/*
 * Link:https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists
 */

/**
 * Implementation of Find Merge Point Two Linked Lists algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindMergePointTwoLinkedLists {

	int FindMergeNode(Node headA, Node headB) {
		int lengthA=0,lengthB=0;
		Node headNodeA=headA;
		Node headNodeB=headB;
		while(headA!=null)
		{
			lengthA++;
			headA=headA.next;
		}
		while(headB!=null)
		{
			lengthB++;
			headB=headB.next;
		}
		if(lengthA>lengthB)
		{
			return findMerge(lengthA,lengthB,headNodeA,headNodeB);
		}
		else{
			return findMerge(lengthB,lengthA,headNodeB,headNodeA);
		}
	}

	/**
	 * Finds merge in the data structure.
	 *
	 * @param lengthA the lengthA parameter
	 * @param lengthB the lengthB parameter
	 * @param headA the headA parameter
	 * @param headB the headB parameter
	 * @return the computed integer result
	 */
	private int findMerge(int lengthA, int lengthB, Node headA, Node headB) {
		int diff=Math.abs(lengthA-lengthB);
		int count=0;
		while(count!=diff)
		{
			headA=headA.next;
			count++;
		}

		while(headA.data!=headB.data)
		{
			headA=headA.next;
			headB=headB.next;
		}
		return headA.data;
	}

	class Node{
		Node next;
		int data;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {

	}

}

package yelpInterview;

import java.util.Stack;

/**
 * Implementation of Check Palindrome LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckPalindromeLL {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value=value;
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(33);
		n.next.next.next.next=new Node(2);
		n.next.next.next.next.next=new Node(1);
		System.out.println(checkPalindrome(n));
	}

	/**
	 * Performs checkPalindrome operation.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkPalindrome(Node n) {
		Node pointer=n;
		Stack<Integer> stack=new Stack<>();
		while(n!=null){
			stack.push(n.value);
			n=n.next;
		}
		while(!stack.isEmpty()){
			if(pointer.value!=stack.pop())
				return false;
			pointer=pointer.next;
		}
		return true;
	}



}







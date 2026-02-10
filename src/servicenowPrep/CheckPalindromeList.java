package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Check Palindrome List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckPalindromeList {

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class ListNode{
		int value;
		ListNode next;
		public ListNode(int value) {
			this.value=value;
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode ln=new ListNode(2);
		ln.next=new ListNode(3);
		ln.next.next=new ListNode(5);
		ln.next.next.next=new ListNode(3);
		ln.next.next.next.next=new ListNode(2);
		System.out.println(isPalindrome(ln));
	}

	/**
	 * Checks if palindrome.
	 *
	 * @param ln the ln parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPalindrome(ListNode ln) {
		ListNode pointer=ln;
		Stack<Integer> stack=new Stack<>();
		while(pointer!=null)
		{
			stack.push(pointer.value);
			pointer=pointer.next;
		}
		while(ln!=null)
		{
			if(ln.value!=stack.pop())
				return false;
			ln=ln.next;
		}
		return true;
	}

	

}

package leetCode;

/*
 * Link : https://leetcode.com/problems/add-two-numbers/
 */

/**
 * Implementation of Add Two Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AddTwoNumbers {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * Adds two numbers to the data structure.
	 *
	 * @param l1 the l1 parameter
	 * @param l2 the l2 parameter
	 * @return the list of results
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuilder numberString1=new StringBuilder();
		StringBuilder numberString2=new StringBuilder();
		while(l1!=null){
			numberString1.append(l1.val+"");
			l1=l1.next;
		}
		while(l2!=null){
			numberString2.append(l2.val+"");
			l2=l2.next;
		}
		int outputValue=Integer.parseInt(numberString1.toString())+Integer.parseInt(numberString2.toString());
		String outputString=String.valueOf(outputValue);

		ListNode ln1 = null,ln2 = null,ln3 = null;
		for (int i = outputString.length()-1; i >=0; i--) {
			// Check for null/base case
			if(ln1==null){
				ln1=new ListNode(Integer.parseInt(outputString.charAt(i)+""));
			}
			// Check for null/base case
			else if(ln2==null){
				ln2=new ListNode(Integer.parseInt(outputString.charAt(i)+""));
			}
			// Check for null/base case
			else if(ln3==null){
				ln3=new ListNode(Integer.parseInt(outputString.charAt(i)+""));
			}
		}
		// Check for null/base case
		if(ln2!=null)
			ln2.next=ln3;
		// Check for null/base case
		if(ln1!=null)
			ln1.next=ln2;
		return ln1;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ListNode l1= new ListNode(0);
		/*l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);*/
		ListNode l2=new ListNode(0);
		/*l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);	*/
		ListNode l3=addTwoNumbers(l1, l2);

		while(l3!=null){
			System.out.println(l3.val);
			l3=l3.next;
		}
		/*while(l2!=null){
			System.out.println(l2.val);
			l2=l2.next;
		}*/

	}
}
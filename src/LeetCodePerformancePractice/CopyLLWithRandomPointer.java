package LeetCodePerformancePractice;

/**
 * Implementation of Copy LL With Random Pointer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CopyLLWithRandomPointer {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x; }
	};
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
	 * Performs copyRandomList operation.
	 *
	 * @param head the head parameter
	 * @return the list of results
	 */
	public RandomListNode copyRandomList(RandomListNode head) {
		   // Check for null/base case
		   if(head==null)
		    return head;
		RandomListNode headPointer=head;
		//copy node
		while(headPointer!=null)
		{
			RandomListNode temp=new RandomListNode(headPointer.label);
			temp.next=headPointer.next;
			headPointer.next=temp;
			headPointer=temp.next;
		}

		headPointer=head;
		//copy random pointers

		while(headPointer!=null)
		{
			// Check for null/base case
			if(headPointer.random!=null)
			{
				headPointer.next.random=headPointer.random.next;
			}
			headPointer=headPointer.next.next;
		}

		headPointer=head;
		//differentiate lists
		RandomListNode output=headPointer.next;
		while(headPointer!=null)
		{
			RandomListNode temp=headPointer.next;
			headPointer.next=temp.next;
			// Check for null/base case
			if(temp.next!=null)
			{
				temp.next=temp.next.next;
			}
			headPointer=headPointer.next;
		}
		return output;
	}
	
}

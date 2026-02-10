package appleInterview;

/**
 * Implementation of DSLL Reverse LL Recursive algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSLLReverseLLRecursive {
	static Node head;
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node next;
		int value;
		public Node(int value){
			this.value=value;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(3);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		print(n);
		n=reverseUtil(n,null);
		print(n);

	}

	/**
	 * Performs reverseUtil operation.
	 *
	 * @param curr the curr parameter
	 * @param prev the prev parameter
	 * @return the Node result
	 */
	static Node reverseUtil(Node curr, Node prev) {
		// Check for null/base case
		if (curr.next == null) {
			head = curr;
			curr.next = prev;
			return null;
		}
		Node nextNode = curr.next;
		curr.next = prev;
		reverseUtil(nextNode, curr);
		return head;
	}

	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null){
			System.out.print(n.value+"/");
			n=n.next;
		}
		System.out.println();
	}

}

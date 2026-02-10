package yelpInterview;

/**
 * Implementation of Merge Two Sorted LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MergeTwoSortedLL {
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
		n.next.next=new Node(4);
		n.next.next.next=new Node(8);
		n.next.next.next.next=new Node(12);
		n.next.next.next.next.next=new Node(16);
		Node n1=new Node(3);
		n1.next=new Node(6);
		n1.next.next=new Node(9);
		n1.next.next.next=new Node(12);
		n1.next.next.next.next=new Node(16);
		n1.next.next.next.next.next=new Node(20);
		n=(mergeLL(n,n1));
		while(n!=null){
			System.out.println(n.value);n=n.next;
		}
	}

	/**
	 * Performs mergeLL operation.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return the Node result
	 */
	private static Node mergeLL(Node n1, Node n2) {
		Node pointer=new Node(-1);
		Node returnPointer=pointer;
		while(n1!=null && n2!=null)
		{
			if(n1.value<n2.value)
			{
				returnPointer.next=n1;
				n1=n1.next;
			}else {
				returnPointer.next=n2;
				n2=n2.next;
			}
			returnPointer=returnPointer.next;
		}
		// Check for null/base case
		if(n1!=null){
			returnPointer.next=n1;
		}
		// Check for null/base case
		else if(n2!=null){
			returnPointer.next=n2;
		}
		
		return pointer.next;
	}

}


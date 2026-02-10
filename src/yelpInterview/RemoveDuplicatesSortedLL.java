package yelpInterview;

/**
 * Implementation of Remove Duplicates Sorted LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesSortedLL {
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
		Node n=new Node(11);
		n.next=new Node(11);
		n.next.next=new Node(11);
		n.next.next.next=new Node(21);
		n.next.next.next.next=new Node(43);
		n.next.next.next.next.next=new Node(43);
		n.next.next.next.next.next.next=new Node(60);
		n=removeDuplicates(n);
		print(n);
	}

	/**
	 * Removes duplicates from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node removeDuplicates(Node n) {
		Node outputNode=n;
		while(n!=null)
		{
			// Check for null/base case
			if(n.next!=null && n.value==n.next.value)
			{
				n.next=n.next.next;
			}
			else
				n=n.next;
		}
		return outputNode;
	}









	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null)
		{
			System.out.print(n.value+"/");
			n=n.next;
		}
	}

}







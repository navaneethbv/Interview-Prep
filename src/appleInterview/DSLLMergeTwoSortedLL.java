package appleInterview;

/**
 * Implementation of DSLL Merge Two Sorted LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSLLMergeTwoSortedLL {
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
		Node n1=new Node(5);
		n1.next=new Node(10);
		n1.next.next=new Node(15);
		Node n2=new Node(2);
		n2.next=new Node(3);
		n2.next.next=new Node(30);
		//n1=mergeLocal(n1,n2);
		//print(n1);

		/*
		 * Recursive code below
		 */
		head=new Node(0);
		Node pointer=head;
		mergeRecursive(n1,n2);
		print(pointer.next);
	}


	/**
	 * Performs mergeRecursive operation.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 */
	private static void mergeRecursive(Node n1, Node n2) {
		// Check for null/base case
		if(n1!=null && n2!=null)
		{
			if(n1.value>n2.value)
			{
				head.next=new Node(n2.value);
				head=head.next;
				mergeRecursive(n1, n2.next);
			}
			else{
				head.next=new Node(n1.value);
				head=head.next;
				mergeRecursive(n1.next, n2);
			}
		}
		else{
			head.next=(n1==null)?n2:n1;
		}
	}


	/**
	 * Performs mergeLocal operation.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return the Node result
	 */
	private static Node mergeLocal(Node n1, Node n2) {
		Node n=new Node(0);
		Node pointer=n;
		while(n1!=null && n2!=null)
		{
			if(n1.value>n2.value){
				pointer.next=new Node(n2.value);
				n2=n2.next;
			}
			else{
				pointer.next=new Node(n1.value);
				n1=n1.next;
			}
			pointer=pointer.next;
		}
		// Check for null/base case
		if(n1==null)
			pointer.next=n2;
		// Check for null/base case
		else if(n2==null)
			pointer.next=n1;
		return n.next;
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

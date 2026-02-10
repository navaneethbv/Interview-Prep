package appleInterview;

/**
 * Implementation of Prep Doc LL Delete Nthnode algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocLLDeleteNthnode {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{Node next;int value;public Node(int value){this.value=value;}}
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
		n.next.next.next.next.next.next=new Node(7);
		n.next.next.next.next.next.next.next=new Node(8);
		n.next.next.next.next.next.next.next.next=new Node(9);
		n.next.next.next.next.next.next.next.next.next=new Node(10);
		print(n);
		deleteNthNode(n,4);
		print(n);
		deleteNthNode(n,6);
		print(n);
		System.out.println();
	}
	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null){System.out.print(n.value+"/");n=n.next;}
		System.out.println();
	}
	/**
	 * Performs deleteNthNode operation.
	 *
	 * @param n the size or count parameter
	 * @param N the size or count parameter
	 */
	private static void deleteNthNode(Node n,int N) {
		int count=1;
		while(N!=count && n!=null)
		{
			n=n.next;N--;
		}
		// Check for null/base case
		if(n!=null && n.next!=null)
			n.next=n.next.next;
		// Check for null/base case
		else if(n!=null)
			n.next=null;
	}

}

package yelpInterview;

/**
 * Implementation of Identical LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IdenticalLL {
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

		Node n=new Node(0);
		n.next=new Node(1);
		n.next.next=new Node(2);
		n.next.next.next=new Node(3);
		n.next.next.next.next=new Node(4);
		Node n1=new Node(0);
		n1.next=new Node(1);
		n1.next.next=new Node(2);
		n1.next.next.next=new Node(3);
		n1.next.next.next.next=new Node(4);
		System.out.println(findIdenticalRecursive(n,n1));
		System.out.println(findIdentical(n,n1));

		print(n);
	}

	/**
	 * Finds identical recursive in the data structure.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findIdenticalRecursive(Node n1, Node n2) {
		// Check for null/base case
		if(n1==null && n2==null){
			return true;
		}
		// Check for null/base case
		if((n1==null || n2==null)){
			return false;
		}
		// Recursively process left and right subtrees
		return n1.value==n2.value && findIdenticalRecursive(n1.next, n2.next);
	}

	/**
	 * Finds identical in the data structure.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findIdentical(Node n1, Node n2) {
		while(n1!=null && n2!=null)
		{
			if(n1.value!=n2.value)
				return false;
			n1=n1.next;
			n2=n2.next;
		}
		// Check for null/base case
		if(n1!=null || n2!=null)
			return false;
		return true;
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


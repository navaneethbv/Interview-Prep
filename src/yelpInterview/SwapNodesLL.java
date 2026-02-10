package yelpInterview;

/**
 * Implementation of Swap Nodes LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SwapNodesLL {
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
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(5);
		n.next.next.next.next.next=new Node(6);
		swapNodes(n,3,5);
	}

	/**
	 * Performs swapNodes operation.
	 *
	 * @param n the size or count parameter
	 * @param value1 the value1 parameter
	 * @param value2 the value2 parameter
	 */
	private static void swapNodes(Node n,int value1,int value2) {
		Node t=n;
		Node n1=null,n2=null,prevN1=null,prevN2=null;
		while(n!=null){
			// Check for null/base case
			if(n.next!=null && n.next.value==value1)
			{	
				prevN1=n;
				n1=n.next;
			}
			// Check for null/base case
			if(n.next!=null && n.next.value==value2){
				prevN2=n;
				n2=n.next;
			}
			n=n.next;
		}
		Node temp=n2.next;
		prevN1.next=n2;
		n2.next=n1.next;
		prevN2.next=n1;
		n1.next=temp;
		while(t!=null)
		{
			System.out.println(t.value);
			t=t.next;
		}
	}


}







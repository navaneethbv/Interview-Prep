package yelpInterview;

/**
 * Implementation of Add Numbers LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AddNumbersLL {
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
		Node n=new Node(5);
		n.next=new Node(6);
		n.next.next=new Node(3);
		Node n1=new Node(8);
		n1.next=new Node(4);
		n1.next.next=new Node(2);
		n=addNos(n,n1);
		print(n);
		
		n=new Node(7);
		n.next=new Node(5);
		n.next.next=new Node(9);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(6);
		n1=new Node(8);
		n1.next=new Node(4);
		n=addNos(n,n1);
		print(n);
		
	}

	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null){
			System.out.print(n.value+"/");n=n.next;
		}
		System.out.println();
	}

	/**
	 * Adds nos to the data structure.
	 *
	 * @param n1 the n1 parameter
	 * @param n2 the n2 parameter
	 * @return the Node result
	 */
	private static Node addNos(Node n1, Node n2) {
		Node outputNode=new Node(-1);
		Node pointer=outputNode;
		int carry=0;
		while(n1!=null && n2!=null)
		{	
			int value=n1.value+n2.value+carry;
			if(value>=10)
			{
				carry=1;
			}
			else{
				carry=0;
			}
			outputNode.next=new Node(value%10);
			outputNode=outputNode.next;
			n1=n1.next;n2=n2.next;
		}
		// Check for null/base case
		if(n1==null){
			while(n2!=null)
			{	
				int value=n2.value+carry;
				if(value>=10)
				{
					carry=1;
				}
				else{
					carry=0;
				}
				outputNode.next=new Node(value%10);
				outputNode=outputNode.next;
				n2=n2.next;
			}
		}
		// Check for null/base case
		else if(n2==null){
			while(n1!=null)
			{	
				int value=n1.value+carry;
				if(value>=10)
				{
					carry=1;
				}
				else{
					carry=0;
				}
				outputNode.next=new Node(value%10);
				outputNode=outputNode.next;
				n1=n1.next;
			}
		}
		return pointer.next;
	}

}







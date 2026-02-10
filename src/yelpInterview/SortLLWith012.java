package yelpInterview;

/**
 * Implementation of Sort LL With012 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortLLWith012 {
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
		n.next.next=new Node(0);
		n.next.next.next=new Node(2);
		n.next.next.next.next=new Node(1);
		n.next.next.next.next.next=new Node(1);
		n.next.next.next.next.next.next=new Node(2);
		n.next.next.next.next.next.next.next=new Node(1);
		n.next.next.next.next.next.next.next.next=new Node(2);
		n=sort(n);
		print(n);
	}


	/**
	 * Performs sort operation.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node sort(Node n) {
		Node outputNode=n;

		int onesCount=0,twosCount=0,zeroesCount=0;
		while(n!=null){
			// Check for null/base case
			if(n.value==0)
			{
				zeroesCount++;
			}
			else if(n.value==1){
				onesCount++;
			}else{
				twosCount++;
			}
			n=n.next;
		}
		int counter=0;
		n=outputNode;
		while(n!=null)
		{
			if(zeroesCount>0)
			{
				n.value=0;
				zeroesCount--;
			}else if(onesCount>0)
			{
				n.value=1;
				onesCount--;
			}
			else if(twosCount>0){
				n.value=2;
				twosCount--;
			}
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
			System.out.println(n.value);
			n=n.next;
		}
	}

}







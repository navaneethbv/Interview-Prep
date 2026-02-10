package yelpInterview;

/**
 * Implementation of Intersection Of LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntersectionOfLL {
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
		Node head1=new Node(10);
		Node head2=new Node(3);
		Node newNode=new Node(6);
		head2.next = newNode;
		newNode.value = 9;
		head2.next.next = newNode;
		newNode.value = 15;
		head1.next = newNode;
		head2.next.next.next  = newNode;
		newNode.value = 30;
		head1.next.next= newNode;
		head1.next.next.next = null;
		System.out.println(getIntersectionNode(head1, head2).value);;
	}

	/**
	 * Retrieves intersection node from the data structure.
	 *
	 * @param head1 the head1 parameter
	 * @param head2 the head2 parameter
	 * @return the Node result
	 */
	private static Node getIntersectionNode(Node head1, Node head2) {
		Node headPointer1=head1;
		Node headPointer2=head2;
		int length1=0,length2=0;
		while(head1!=null){
			head1=head1.next;
			length1++;
		}
		while(head2!=null){
			head2=head2.next;
			length2++;
		}
		if(length1>length2){
			int diff=Math.abs(length1-length2);
			int count=0;
			while(count!=diff){
				headPointer1=headPointer1.next;
				count++;
			}
			while(headPointer1!=headPointer2){
				headPointer1=headPointer1.next;
				headPointer2=headPointer2.next;
			}
			return headPointer2;
		}
		else{
			int diff=Math.abs(length1-length2);
			int count=0;
			while(count!=diff){
				headPointer2=headPointer2.next;
				count++;
			}
			while(headPointer1!=headPointer2){
				headPointer1=headPointer1.next;
				headPointer2=headPointer2.next;
			}
			return headPointer2;

		}
	}



}







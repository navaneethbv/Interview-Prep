package appleInterview;

/**
 * Implementation of DSLL Length Of LL Iterative algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSLLLengthOfLLIterative {
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
		System.out.println(findLength(n));
	}
	/**
	 * Finds length in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	static int findLength(Node n){
		int count=0;
		while(n!=null){
			n=n.next;
			count++;
		}
		return count;
	}
}

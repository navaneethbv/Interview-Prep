package appleInterview;

/**
 * Implementation of DSLL Swap Nodes Data LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSLLSwapNodesDataLL {

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
		//n.next.next.next.next.next=new Node(6);
		print(n);
		swapNodes(n);
		print(n);

	}
	/**
	 * Performs swapNodes operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void swapNodes(Node n) {
		while(n!=null)
		{
			// Check for null/base case
			if(n.next!=null)
			{
				n.value=n.value^n.next.value;
				n.next.value=n.value^n.next.value;
				n.value=n.value^n.next.value;
				n=n.next.next;
			}
			else{
				return;
			}
		}
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

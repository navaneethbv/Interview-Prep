package appleInterview;

/**
 * Implementation of DSBT In Order Without Recursion Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTInOrderWithoutRecursionStack {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node left,right;
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
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		inOrderTraversal(n);
	}
	/**
	 * Performs inOrderTraversal operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrderTraversal(Node n) {
		Node current=n;
		Node curr;
		while(current!=null)
		{
			// Check for null/base case
			if(current.left==null)
			{
				System.out.println(current.value);
				current=current.right;
			}
			else{
				curr=current.left;
				while(curr!=curr.right && curr.right!=null)
				{
					curr=curr.right;
				}
				// Check for null/base case
				if(curr.right == null)
				{
					curr.right = current;
					current = current.left;
				}
				else 
				{
					curr.right = null;
					System.out.println(current.value);
					current = current.right;      
				} 
			}
		}




	}
}


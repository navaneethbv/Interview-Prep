package appleInterview;

import java.util.Stack;

/**
 * Implementation of DSBT In Order Without Recursion algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTInOrderWithoutRecursion {
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
		Stack<Node> stack=new Stack<>();
		while(n!=null)
		{
			stack.push(n);
			n=n.left;
		}
		
		while(!stack.isEmpty())
		{	
			Node n1=stack.pop();
			// Check for null/base case
			if(n1.right!=null){
				stack.push(n1.right);
				Node n2=n1.right;
				while(n2!=null && n2.left!=null)
				{
					stack.push(n2);
					n2=n2.left;
				}
			}
			System.out.println(n1.value);
		}
	}

}


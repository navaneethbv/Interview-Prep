package yelpInterview;

import java.util.Stack;

/**
 * Implementation of BT Inorder Without Recursion algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTInorderWithoutRecursion {
	static Stack<Node> nodeStack=new Stack<>();
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node left,right;
		int value;
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
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7);
		inOrder(n);System.out.println();
	}
	/**
	 * Performs inOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrder(Node n) {
		// Check for null/base case
		if(n!=null){
			addLeftNodes(n);
		}
		while(!nodeStack.isEmpty()){
			Node n1=(nodeStack.pop());
			System.out.println(n1.value);
			addLeftNodes(n1.right);
		}

	}
	/**
	 * Adds left nodes to the data structure.
	 *
	 * @param node the tree node to process
	 */
	private static void addLeftNodes(Node node) {
		// Check for null/base case
		if(node==null)
			return;
		while(node!=null)
		{
			nodeStack.push(node);
			node=node.left;
		}
	}

}


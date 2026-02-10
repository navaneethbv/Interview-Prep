package appleInterview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of DSBT Level Order Tree Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTLevelOrderTreeTraversal {
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
		levelOrderTraversal(n);
		System.out.println();
		levelOrderQueueTraversal(n);
	}
	/**
	 * Performs levelOrderQueueTraversal operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void levelOrderQueueTraversal(Node n) {
		Queue<Node> q=new LinkedList<>();
		q.add(n);
		while(!q.isEmpty())
		{
			Node n1=(q.poll());
			// Check for null/base case
			if(n1!=null)
			{
				System.out.print(n1.value+"->");
				q.add(n1.left);
				q.add(n1.right);
			}
		}
	}
	/**
	 * Performs levelOrderTraversal operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void levelOrderTraversal(Node n) {
		int height=getHeight(n);
		for (int i = 0; i < height; i++) {
			levelTraverse(n,i);
		}
	}
	/**
	 * Performs levelTraverse operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 */
	private static void levelTraverse(Node n, int i) {
		// Check for null/base case
		if(n==null)
			return;
		// Check for null/base case
		if(i==0)
		{
			System.out.print(n.value+"->");
		}
		else{
			levelTraverse(n.left,i-1);
			levelTraverse(n.right,i-1);
		}
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getHeight(Node n) {
		// Check for null/base case
		if(n!=null)
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(n.left),getHeight(n.right));
		return 0;
	}
}

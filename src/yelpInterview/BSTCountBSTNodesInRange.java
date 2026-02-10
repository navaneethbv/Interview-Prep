package yelpInterview;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implementation of BST Count BST Nodes In Range algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTCountBSTNodesInRange{
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node left,right;
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
		Node n=insert(null,10);
		insert(n,5);
		insert(n,1);
		insert(n,50);
		insert(n,40);
		insert(n,100);
		inOrderTraversal(n);
		System.out.println();
		System.out.println("value is "+findNodes(n,5,45));
	}

	/**
	 * Finds nodes in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param min the min parameter
	 * @param max the max parameter
	 * @return the computed integer result
	 */
	private static int findNodes(Node n,int min,int max) {
		// Check for null/base case
		if(n!=null)
		{
			if(n.value>=min && n.value<=max)
			{	
				System.out.print(n.value+" ");
				// Recursively process left and right subtrees
				return 1+findNodes(n.left, min, max)+findNodes(n.right, min, max);
			}
			else if(n.value>max)
				// Recursively process left and right subtrees
				return findNodes(n.left, min, max);
			else if(n.value<min)
				// Recursively process left and right subtrees
				return findNodes(n.right, min, max);
		}
		return 0;
	}

	/**
	 * Performs inOrderTraversal operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrderTraversal(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			inOrderTraversal(n.left);
			System.out.print(n.value+" ");
			inOrderTraversal(n.right);
		}
	}

	/**
	 * Performs insert operation.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the Node result
	 */
	private static Node insert(Node n, int value) {
		// Check for null/base case
		if(n==null)
			return new Node(value);
		if(n.value>value)
		{//move left
			n.left=insert(n.left,value);
		}
		else{//move right
			n.right=insert(n.right,value);			
		}
		return n;
	}

}
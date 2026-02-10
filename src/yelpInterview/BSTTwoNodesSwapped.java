package yelpInterview;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implementation of BST Two Nodes Swapped algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTTwoNodesSwapped {
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
		Node n=new Node(10);
		n.left=new Node(5);
		n.right=new Node(8);
		n.left.left=new Node(2);
		n.left.right=new Node(20);
		inOrderTraversal(n);
		System.out.println();
		correctBST(n);
		inOrderTraversal(n);
	}

	static ArrayList<Integer> aList;
	/**
	 * Performs correctBST operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void correctBST(Node n) {
		aList=new ArrayList<>();
		addToList(n);
		Object arr[]=aList.toArray();
		Arrays.sort(arr);
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(aList.get(i)!=arr[i])
			{
				if(first==Integer.MIN_VALUE){
					first=aList.get(i);
				}
				else{
					second=aList.get(i);
					break;
				}
			}
		}
		changeNodeVal(n,first,second);
	}

	/**
	 * Performs changeNodeVal operation.
	 *
	 * @param n the size or count parameter
	 * @param first the first parameter
	 * @param second the second parameter
	 */
	private static void changeNodeVal(Node n, int first, int second) {
		// Check for null/base case
		if(n!=null)
		{
			changeNodeVal(n.left, first, second);
			if(n.value==first)
				n.value=second;
			else if(n.value==second)
				n.value=first;
			changeNodeVal(n.right, first, second);
		}
	}

	/**
	 * Adds to list to the data structure.
	 *
	 * @param n the size or count parameter
	 */
	private static void addToList(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			addToList(n.left);
			aList.add(n.value);
			addToList(n.right);
		}
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
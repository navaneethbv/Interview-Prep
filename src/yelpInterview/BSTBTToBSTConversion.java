package yelpInterview;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implementation of BSTBT To BST Conversion algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTBTToBSTConversion{
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
		n.left=new Node(2);
		n.right=new Node(7);
		n.left.left=new Node(8);
		n.left.right=new Node(4);
		inOrderTraversal(n);
		System.out.println();
		convertTree(n);
		inOrderTraversal(n);
	}

	static ArrayList<Integer> aList;
	/**
	 * Performs convertTree operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void convertTree(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			aList=new ArrayList<>();
			populateList(n);
			Object[] arr=aList.toArray();
			Arrays.sort(arr);
			changeNodeVal(n,arr);
		}
	}

	static int counter=0;
	/**
	 * Performs changeNodeVal operation.
	 *
	 * @param n the size or count parameter
	 * @param arr the array to process
	 */
	private static void changeNodeVal(Node n, Object[] arr) {
		// Check for null/base case
		if(n!=null)
		{
			changeNodeVal(n.left,arr);
			n.value=(int) arr[counter];
			counter++;
			changeNodeVal(n.right,arr);
		}
	}

	/**
	 * Performs populateList operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void populateList(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			populateList(n.left);
			aList.add(n.value);
			populateList(n.right);
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
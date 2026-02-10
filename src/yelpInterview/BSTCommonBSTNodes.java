package yelpInterview;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Implementation of BST Common BST Nodes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTCommonBSTNodes {
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
		Node n=insert(null, 5);
		insert(n, 1);
		insert(n, 10);
		insert(n,  0);
		insert(n,  4);
		insert(n,  7);
		insert(n,  9);
		inOrderTraversal(n);
		System.out.println();
		Node n2=insert(null, 10);
		insert(n2, 7);
		insert(n2, 20);
		insert(n2, 4);
		insert(n2, 9);
		inOrderTraversal(n2);
		findCommonNodes(n,n2);
	}



	/**
	 * Finds common nodes in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param n2 the n2 parameter
	 */
	private static void findCommonNodes(Node n, Node n2) {
		aList=new ArrayList<>();
		populateList(n);
		Object arr1[]=aList.toArray();
		aList=new ArrayList<>();
		populateList(n2);
		Object arr2[]=aList.toArray();
		printIntersection(arr1,arr2);
	}



	/**
	 * Performs printIntersection operation.
	 *
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 */
	private static void printIntersection(Object[] arr1, Object[] arr2) {
		HashSet<Integer> set=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < arr1.length; i++) {
			set.add((int)arr1[i]);
		}
		System.out.println();
		// Iterate through all elements
		for (int i = 0; i < arr2.length; i++) {
			if(set.contains((int)arr2[i]))
			{
				System.out.print(arr2[i]+" ");
			}
		}
	}



	static ArrayList<Integer> aList;
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
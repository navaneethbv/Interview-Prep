package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of BSTBST Triplet algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTBSTTriplet {
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
		Node n=insert(null,6);
		insert(n,-13);
		insert(n,14);
		insert(n,-8);
		insert(n,13);
		insert(n,15);
		insert(n,7);
		inOrderTraversal(n);
		System.out.println();
		System.out.println(hasTriplet(n,0));
	}
	/**
	 * Checks if triplet.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean hasTriplet(Node n, int i) {
		// Check for null/base case
		if(n!=null)
		{
			int size=getSize(n);
			int []treeArr=new int[size];
			populateArr(n,treeArr);
			Arrays.sort(treeArr);
			return hasTripleZeroSum(treeArr);
		}
		return false;
	}
	/**
	 * Checks if triple zero sum.
	 *
	 * @param treeArr the array to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean hasTripleZeroSum(int[] treeArr) {
		// Iterate through all elements
		for (int i = 0; i < treeArr.length-2; i++) {
			int low=i+1;
			int high=treeArr.length-1;
			while(low<high)
			{
				int value=treeArr[low]+treeArr[high]+treeArr[i];
				// Check for null/base case
				if(value==0)
					return true;
				else if(value>0)
					high--;
				else
					low++;
			}
		}
		return false;
	}
	/**
	 * Performs populateArr operation.
	 *
	 * @param n the size or count parameter
	 * @param treeArr the array to process
	 */
	private static void populateArr(Node n,int[] treeArr) {
		// Check for null/base case
		if(n!=null)
		{
			treeArr[counter]=n.value;
			counter++;
			populateArr(n.left, treeArr);
			populateArr(n.right, treeArr);
		}
	}
	/**
	 * Retrieves size from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getSize(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return 1+getSize(n.left)+getSize(n.right);
		}
		return 0;
	}
	static int counter=0;

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
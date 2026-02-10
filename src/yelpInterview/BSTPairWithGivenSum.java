package yelpInterview;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implementation of BST Pair With Given Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTPairWithGivenSum {
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
		Node n=insert(null,15);
		insert(n,10);
		insert(n,20);
		insert(n,8);
		insert(n,12);
		insert(n,16);
		insert(n,25);
		inOrderTraversal(n);
		System.out.println();
		System.out.println(hasTargetNodes(n,33));
	}



	static ArrayList<Integer> aList;

	/**
	 * Checks if target nodes.
	 *
	 * @param n the size or count parameter
	 * @param target the target value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean hasTargetNodes(Node n, int target) {
		// Check for null/base case
		if(n!=null)
		{
			aList=new ArrayList<>();
			populateList(n);
			Object[] arr=aList.toArray();
			Arrays.sort(arr);
			return checkSum(arr,target);
		}
		return false;
	}





	/**
	 * Performs checkSum operation.
	 *
	 * @param arr the array to process
	 * @param target the target value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkSum(Object[] arr, int target) {
		int low=0,high=arr.length-1;
		while(low<high)
		{	
			int sum=(int)arr[low]+(int)arr[high];
			if(sum==target)
				return true;
			if(sum>target)
				high--;
			else
				low++;
		}
		return false;
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
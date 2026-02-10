package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of BT Sum Of All Nos algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTSumOfAllNos {
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
		Node n=new Node(5);
		n.left=new Node(7);
		n.right=new Node(2);
		n.left.left=new Node(3);
		n.left.right=new Node(5);
		n.right.left=new Node(1);
		n.right.right=new Node(3);
		findSum(n,path,0);
		System.out.println(sum);
	}
	static int sum=0;
	/**
	 * Finds sum in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param path the array to process
	 * @param i the i parameter
	 */
	private static  void findSum(Node n, int[] path, int i) {
		// Check for null/base case
		if(n!=null)
		{
			path[i]=n.value;
			// Check if node is a leaf (no children)
			if(n.left==null && n.right==null)
			{
				int arr[]=Arrays.copyOf(path, i+1);
				StringBuilder sb=new StringBuilder();
				// Inner loop to check combinations
				for (int j = 0; j < arr.length; j++) {
					sb.append(arr[j]);
				}
				sum+=Integer.parseInt(sb.toString());
			}
			findSum(n.left, path, i+1);
			findSum(n.right, path, i+1);
		}
	}
	static int[] path=new int[100];

}


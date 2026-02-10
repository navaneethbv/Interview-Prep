package yelpInterview;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Implementation of BT Vertical Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BTVerticalSum {
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
		printVerticalSum(n);
	}
	static TreeMap<Integer,Integer> levelMap=new TreeMap<>();
	/**
	 * Performs printVerticalSum operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void printVerticalSum(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			printVerticalSumUtil(n,0);
		}
		Map<Integer, Integer> map = levelMap;
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
	/**
	 * Performs printVerticalSumUtil operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 */
	private static void printVerticalSumUtil(Node n, int i) {//use queue and change Node class
		// Check for null/base case
		if(n!=null){
			if(levelMap.containsKey(i))
				levelMap.put(i, levelMap.get(i)+n.value);
			else
				levelMap.put(i, n.value);
			printVerticalSumUtil(n.left,i-1);
			printVerticalSumUtil(n.right,i+1);
		}
	}


}


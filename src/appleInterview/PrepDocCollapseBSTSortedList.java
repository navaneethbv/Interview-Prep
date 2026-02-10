package appleInterview;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Prep Doc Collapse BST Sorted List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocCollapseBSTSortedList {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{Node left,right;int value;
		public Node( int value){this.value=value;}
	}
	static List<Integer> l;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node n=new Node(5);
		n.left=new Node(3);
		n.right=new Node(7);
		n.left.left=new Node(1);
		n.left.right=new Node(4);
		n.right.left=new Node(6);
		n.right.right=new Node(8);
		l=convertSorted(n);
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+"/");
		}
	}
	/**
	 * Performs convertSorted operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	private static List<Integer> convertSorted(Node n) {
		l=new ArrayList<>();
		sortedOrder(n);
		return l;
	}
	/**
	 * Performs sortedOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void sortedOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			sortedOrder(n.left);
			l.add(n.value);
			sortedOrder(n.right);
		}
	}

}

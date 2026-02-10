package GeeksforGeeksPractice;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Link : http://www.geeksforgeeks.org/given-linked-list-representation-of-complete-tree-convert-it-to-linked-representation/
 */
/**
 * Implementation of Linked List To Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LinkedListToBinaryTree {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(12);
		ll.add(15);
		ll.add(25);
		ll.add(30);
		ll.add(36);
		convertTOBinaryTree(ll);



	}

	/**
	 * Performs convertTOBinaryTree operation.
	 *
	 * @param ll the ll parameter
	 */
	private static void convertTOBinaryTree(LinkedList<Integer> ll) {
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		int listSize=ll.size();
		int listPointer=0;
		TreeNode tn=new TreeNode(ll.get(listPointer));
		q.add(tn);
		while(listPointer<listSize)
		{
			TreeNode temp=q.poll();
			listPointer++;
			TreeNode left = null,right = null;
			if(listPointer<listSize){
				left=new TreeNode(ll.get(listPointer));
				q.add(left);
			}
			listPointer++;
			if(listPointer<listSize){
				right=new TreeNode(ll.get(listPointer));
				q.add(right);
			}
			temp.left=left;
			temp.right=right;
		}
		preOrder(tn);
	}

	/**
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			preOrder(tn.left);
			System.out.println(tn.value);
			preOrder(tn.right);
		}
		
	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		int value;
		TreeNode left,right;
		public TreeNode(int value) {
			this.value=value;
		}	
	}




}

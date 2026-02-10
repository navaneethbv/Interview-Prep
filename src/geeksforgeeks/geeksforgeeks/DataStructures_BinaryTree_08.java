package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/write-a-c-program-to-get-count-of-leaf-nodes-in-a-binary-tree/
 * Program to count leaf nodes in a binary tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_08 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_08 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,10);
		 binaryTree1.insert(10,"left",11);
		 binaryTree1.insert(10,"right",12);
		 binaryTree1.insert(11,"left",13);
		 binaryTree1.insert(11,"right",14);
		 binaryTree1.insert(12,"left",15);
		 binaryTree1.insert(12,"right",16);
		 binaryTree1.preOrder();
		 System.out.println(countLeafNodes(binaryTree1));
	 }

	/**
	 * Counts the number of leaf nodes.
	 *
	 * @param binaryTree1 the binaryTree1 parameter
	 * @return the computed integer result
	 */
	private static int countLeafNodes(_01DataStructures_BinaryTree_00 binaryTree1) {
		// Recursively process left and right subtrees
		return countLeafNodes(binaryTree1.rootNode);
	}

	/**
	 * Counts the number of leaf nodes.
	 *
	 * @param node the tree node to process
	 * @return the computed integer result
	 */
	private static int countLeafNodes(Node node) {
		// Check for null/base case
		if(node!=null){
			if(node.left==null && node.right==null){
				return 1;
			}
			else
				// Recursively process left and right subtrees
				return countLeafNodes(node.left)+countLeafNodes(node.right);
		}
		return 0;
	}


 }

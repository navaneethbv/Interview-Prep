package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/double-tree/
 * Double Tree
 * Write a program that converts a given tree to its Double tree.
 * To create Double tree of the given tree, create a new duplicate for each node,
 * and insert the duplicate as the left child of the original node.
 */;
/**
 * Implementation of Data Structures_ Binary Tree_20 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_20 {
	 static _01DataStructures_BinaryTree_00 tree=new _01DataStructures_BinaryTree_00();
			 
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,2);
		 binaryTree1.insert(2,"left",1);
		 binaryTree1.insert(2,"right",3);
		 binaryTree1.preOrder();
		 doubleTree(binaryTree1);
		 binaryTree1.preOrder();
	 }

	 /**
	  * Performs doubleTree operation.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  */
	 private static void doubleTree(_01DataStructures_BinaryTree_00 binaryTree1) {
		 doubleTree(binaryTree1.rootNode);
	 }

	 /**
	  * Performs doubleTree operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void doubleTree(Node node) {
		 Node oldLeft;
		 // Check for null/base case
		 if(node==null)
			 return;
		 doubleTree(node.left);
		 doubleTree(node.right);
		 oldLeft=node.left;
		 node.left=tree.new Node(node.data,null,null);
		 node.left.left=oldLeft;
	 }

 }

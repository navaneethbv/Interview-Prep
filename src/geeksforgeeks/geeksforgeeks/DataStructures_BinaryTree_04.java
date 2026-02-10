package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
 * Write a C Program to Find the Maximum Depth or Height of a Tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_04 {
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
		 binaryTree1.insert(16,"right",17);		
		 binaryTree1.insert(17,"right",18);
		 binaryTree1.preOrder();
		 deleteTree(binaryTree1);
		 binaryTree1.preOrder();
	 }

	 /**
	  * Performs deleteTree operation.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  */
	 private static void deleteTree(_01DataStructures_BinaryTree_00 binaryTree1) {
		 // Check for null/base case
		 if(binaryTree1.size()==0||binaryTree1.size()==1)
		 {
			 binaryTree1.rootNode=null;
		 }
		 else{
			 deleteTree(binaryTree1.rootNode);
		 }
	 }

	/**
	 * Performs deleteTree operation.
	 *
	 * @param node the tree node to process
	 */
	private static void deleteTree(Node node) {
		// Check for null/base case
		if(node!=null){
			deleteTree(node.left);
			deleteTree(node.right);
			node.data=null;//not needed,needed only in this case
			node=null;
		}
	}
 }

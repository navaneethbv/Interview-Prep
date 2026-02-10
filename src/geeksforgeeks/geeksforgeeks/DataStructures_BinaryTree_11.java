package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;




/*
 * http://www.geeksforgeeks.org/write-a-c-program-to-calculate-size-of-a-tree/
 * Write a C program to Calculate Size of a tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_11 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_11 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,10);
		 binaryTree1.insert(10,"left",8);
		 binaryTree1.insert(10,"right",2);
		 binaryTree1.insert(8,"left",3);
		 binaryTree1.insert(8,"right",5);
		 binaryTree1.insert(2,"left",2);
		 binaryTree1.preOrder();
		 System.out.println(findSize(binaryTree1));
	 }

	 /**
	  * Finds size in the data structure.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  * @return the computed integer result
	  */
	 private static int findSize(_01DataStructures_BinaryTree_00 binaryTree1) {
		 // Recursively process left and right subtrees
		 return findSize(binaryTree1.rootNode);
	 }

	 /**
	  * Finds size in the data structure.
	  *
	  * @param node the tree node to process
	  * @return the computed integer result
	  */
	 private static int findSize(Node node) {
		 // Check for null/base case
		 if(node!=null){
			 // Recursively process left and right subtrees
			 return findSize(node.left)+findSize(node.right)+1;
		 }
		 return 0;
	 }


 }
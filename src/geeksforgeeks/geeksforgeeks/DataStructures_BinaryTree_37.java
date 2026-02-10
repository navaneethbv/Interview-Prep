package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

import java.util.Stack;


/*
 * http://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/
 * Boundary Traversal of binary tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_37 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_37 {
	 static Stack<Integer> stack=new Stack<Integer>();
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,20);
		 binaryTree1.insert(20,"left",8);
		 binaryTree1.insert(8,"left",4);
		 binaryTree1.insert(8,"right",12);
		 binaryTree1.insert(12,"left",10);
		 binaryTree1.insert(12,"right",14);
		 binaryTree1.insert(20,"right",22);
		 binaryTree1.insert(22,"right",25);
		 binaryTree1.inOrder();
		 traverseBoundary(binaryTree1);
	 }

	 private static void traverseBoundary(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 traverseBoundary(binaryTree1.rootNode);
	 }

	 /**
	  * Performs traverseBoundary operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void traverseBoundary(Node node) {
		 // Check for null/base case
		 if(node!=null){
			 printBoundaryLeft(node);
			 printLeaves(node.left);
			 printLeaves(node.right);
			 printBoundaryRight(node.right);

		 }
	 }

	 /**
	  * Performs printBoundaryRight operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void printBoundaryRight(Node node) {
		 // Check for null/base case
		 if(node!=null){	
			 printBoundaryLeft(node.right);
			 // Check if node is a leaf (no children)
			 if(node.left!=null || node.right!=null)
				 System.out.print(node.data+",");
		 }

	 }

	 /**
	  * Performs printBoundaryLeft operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void printBoundaryLeft(Node node) {
		 // Check for null/base case
		 if(node!=null){	
			 if(node.left!=null || node.right!=null)
				 System.out.print(node.data+",");
			 printBoundaryLeft(node.left);
		 }
	 }

	 /**
	  * Performs printLeaves operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void printLeaves(Node node) {
		 // Check for null/base case
		 if(node!=null)
		 {
			 // Check if node is a leaf (no children)
			 if(node.left==null && node.right==null)
				 System.out.print(node.data+",");
			 printLeaves(node.left);
			 printLeaves(node.right);
		 }

	 }



 }

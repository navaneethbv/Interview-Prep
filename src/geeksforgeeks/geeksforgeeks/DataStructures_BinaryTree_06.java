package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/given-a-binary-tree-print-out-all-of-its-root-to-leaf-paths-one-per-line/
 * Given a binary tree, print out all of its root-to-leaf paths one per line.
 */;
/**
 * Implementation of Data Structures_ Binary Tree_06 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_06 {
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
		 printPaths(binaryTree1);
	 }
	 static int[] pathArray=new int[3];//set max height here
	 /**
	  * Performs printPaths operation.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  */
	 private static void printPaths(_01DataStructures_BinaryTree_00 binaryTree1) {
		 printPaths(binaryTree1.rootNode,pathArray,0);
	 }

	 /**
	  * Performs printPaths operation.
	  *
	  * @param node the tree node to process
	  * @param list the array to process
	  * @param pathLen the pathLen parameter
	  */
	 private static void printPaths(Node node,int[] list,int pathLen) {
		 // Check for null/base case
		 if(node!=null)
		 {
			list[pathLen]=node.data;
			pathLen++;
		 }
		 // Check if node is a leaf (no children)
		 if(node.left==null && node.right==null){
			 // Iterate through all elements
			 for (int i = 0; i < list.length; i++) {
				 System.out.print(list[i]+",");
			 }
			 System.out.println();
		 }else{
			 printPaths(node.left,list,pathLen);
			 printPaths(node.right,list,pathLen);

		 }
	 }


 }

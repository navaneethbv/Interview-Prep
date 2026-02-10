package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/maximum-width-of-a-binary-tree/
 * Maximum width of a binary tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_21 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_21 {
	 static _01DataStructures_BinaryTree_00 tree=new _01DataStructures_BinaryTree_00();

	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,1);
		 binaryTree1.insert(1,"left",2);
		 binaryTree1.insert(1,"right",3);
		 binaryTree1.insert(2,"left",4);
		 binaryTree1.insert(2,"right",5);
		 binaryTree1.insert(3,"right",8);
		 binaryTree1.insert(8,"left",6);
		 binaryTree1.insert(8,"right",7);
		 binaryTree1.preOrder();
		 System.out.println(getMaxWidthLevelOrder(binaryTree1));
	 }

	 /**
	  * Retrieves height from the data structure.
	  *
	  * @param node the tree node to process
	  * @return the computed integer result
	  */
	 private static int getHeight(Node node) {
		 // Check for null/base case
		 if(node==null)
			 return 0;
		 else
		 {
			 int leftHeight=getHeight(node.left);
			 int rightHeight=getHeight(node.right);
			 return 1+((leftHeight>rightHeight)?leftHeight:rightHeight);
		 }
	 }

	 /**
	  * Retrieves max width level order from the data structure.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  * @return the computed integer result
	  */
	 private static int getMaxWidthLevelOrder(_01DataStructures_BinaryTree_00 binaryTree1) {
		 // Recursively process left and right subtrees
		 return getMaxWidthLevelOrder(binaryTree1.rootNode);
	 }

	 /**
	  * Retrieves max width level order from the data structure.
	  *
	  * @param node the tree node to process
	  * @return the computed integer result
	  */
	 private static int getMaxWidthLevelOrder(Node node) {
		 int maxWidth=0;
		 for (int i = 1; i <= getHeight(node); i++) {
			 int width=getWidth(node,i);
			 if(width>maxWidth)
				 maxWidth=width;
		 }
		 return maxWidth;
	 }

	 /**
	  * Retrieves width from the data structure.
	  *
	  * @param node the tree node to process
	  * @param level the level parameter
	  * @return the computed integer result
	  */
	 private static int getWidth(Node node, int level) {
		 // Check for null/base case
		 if(node==null)
			 return 0;
		 if(level==1)
			 return 1;
		 else if(level>1)
			 // Recursively process left and right subtrees
			 return getWidth(node.left,level-1)+getWidth(node.right,level-1);
		 else
			 return 0;
	 }

 }

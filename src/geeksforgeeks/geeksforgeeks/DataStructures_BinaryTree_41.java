package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

import java.util.Stack;


/*
 * http://www.geeksforgeeks.org/reverse-level-order-traversal/
 * Reverse Level Order Traversal
 */;
/**
 * Implementation of Data Structures_ Binary Tree_41 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_41 {
	 static Stack<Integer> stack=new Stack<Integer>();
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
		 binaryTree1.insert(3,"right",6);
		 binaryTree1.insert(6,"left",7);
		 binaryTree1.preOrder();
		 reverseLevelOrder(binaryTree1);
	 }
	 private static void reverseLevelOrder(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 int h=height(binaryTree1.rootNode);
		 for (int i = h; i >=0; i--) {
			 reverseLevelOrder(binaryTree1.rootNode,i);
		 }

	 }
	 /**
	  * Performs reverseLevelOrder operation.
	  *
	  * @param node the tree node to process
	  * @param level the level parameter
	  */
	 private static void reverseLevelOrder(Node node,int level) {
		 // Check for null/base case
		 if(node==null)
			 return;
		 if(level==1)
			 System.out.print(node.data+",");
		 else{
			 reverseLevelOrder(node.left,level-1);
			 reverseLevelOrder(node.right,level-1);
		 }

	 }
	 /**
	  * Performs height operation.
	  *
	  * @param node the tree node to process
	  * @return the computed integer result
	  */
	 private static int height(Node node) {
		 // Check for null/base case
		 if(node!=null){
			 int leftHeight=height(node.left);
			 int rightHeight=height(node.right);
			 return 1+((leftHeight>rightHeight)?leftHeight:rightHeight);
		 }
		 return 0;
	 }



 }

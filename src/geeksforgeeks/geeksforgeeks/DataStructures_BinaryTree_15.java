package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

import java.util.Stack;





/*
 * http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
 * Inorder Tree Traversal without Recursion
 */;
/**
 * Implementation of Data Structures_ Binary Tree_15 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_15 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,50);
		 binaryTree1.insert(50,"left",7);
		 binaryTree1.insert(50,"right",2);
		 binaryTree1.insert(7,"left",3);
		 binaryTree1.insert(7,"right",5);
		 binaryTree1.insert(2,"left",1);
		 binaryTree1.insert(2,"right",30);
		 binaryTree1.insert(30,"right",32);
		 binaryTree1.insert(32,"right",34);
		 binaryTree1.preOrder();
		 binaryTree1.inOrder();
		 inOrderStack(binaryTree1);
	 }

	 private static void inOrderStack(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 inOrderStack(binaryTree1.rootNode);
	 }

	 /**
	  * Performs inOrderStack operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void inOrderStack(Node node) {
		 Stack<Node> stack=new Stack<Node>();
		 Node current=node;
		 while(true){
			 // Check for null/base case
			 if(current!=null){
				 stack.push(current);
				 current=current.left;
			 }
			 // Check for null/base case
			 else if(current==null && !stack.isEmpty()){
				 current=stack.pop();
				 System.out.print(current.data+",");
				 current=current.right;
			 }
			 else {
				 System.exit(1);
				 break;
			 }
		 }
	 }




 }
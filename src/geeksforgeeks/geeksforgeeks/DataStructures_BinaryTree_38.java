package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

import java.util.Stack;


/*
 * http://www.geeksforgeeks.org/iterative-preorder-traversal/
 * Iterative Preorder Traversal
 */;
/**
 * Implementation of Data Structures_ Binary Tree_38 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_38 {
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
		 binaryTree1.insert(20,"right",22);
		 binaryTree1.insert(8,"left",4);
		 binaryTree1.insert(8,"right",12);
		 binaryTree1.insert(12,"left",10);
		 binaryTree1.insert(12,"right",14);
		 binaryTree1.insert(22,"right",25);
		 binaryTree1.preOrder();
		 preOrderIterator(binaryTree1);
	 }
	 private static void preOrderIterator(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 preOrderIterator(binaryTree1.rootNode);
	 }

	 /**
	  * Performs preOrderIterator operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void preOrderIterator(Node node) {
		 Stack<Node> stack=new Stack<Node>();
		 stack.push(node);
		 while(!stack.isEmpty()){
			 Node n=stack.pop();
			 System.out.print(n.data+",");
			 // Check for null/base case
			 if(n.right!=null)
				 stack.push(n.right);
			 // Check for null/base case
			 if(n.left!=null)
				 stack.push(n.left);
		 }

	 }


 }

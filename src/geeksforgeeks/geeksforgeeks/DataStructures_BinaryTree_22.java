package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/foldable-binary-trees/
 * Foldable Binary Trees
 */;
/**
 * Implementation of Data Structures_ Binary Tree_22 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_22 {
	 static _01DataStructures_BinaryTree_00 tree=new _01DataStructures_BinaryTree_00();

	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,10);
		 binaryTree1.insert(10,"left",7);
		 binaryTree1.insert(7,"right",9);
		 binaryTree1.insert(10,"right",15);
		 binaryTree1.insert(15,"left",11);
		 binaryTree1.preOrder();
		 System.out.println(checkTreeFold(binaryTree1));
	 }

	 private static boolean checkTreeFold(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 return checkTreeFold(binaryTree1.rootNode);
	 }

	 /**
	  * Performs checkTreeFold operation.
	  *
	  * @param node the tree node to process
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean checkTreeFold(Node node) {
		 // Check for null/base case
		 if(node==null)
			 return true;
		 mirror(node.left);
		 boolean result=isStructureSame(node.left,node.right);
		 mirror(node.left);
		 return result;
	 }

	 /**
	  * Checks if structure same.
	  *
	  * @param left the left parameter
	  * @param right the right parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean isStructureSame(Node left, Node right) {
		 // Check if node is a leaf (no children)
		 if(left==null && right==null)
			 return true;
		 // Check if node is a leaf (no children)
		 else if(left!=null && right!=null 
				 && isStructureSame(left.left,right.left)
				 && isStructureSame(left.right,right.right))
			 return true;
		 else		 
			 return false;
	 }

	 /**
	  * Performs mirror operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void mirror(Node node) {
		 // Check for null/base case
		 if(node!=null){
			 mirror(node.left);
			 mirror(node.right);
			 Node temp=node.left;
			 node.left=node.right;
			 node.right=temp;
		 }
	 }


 }

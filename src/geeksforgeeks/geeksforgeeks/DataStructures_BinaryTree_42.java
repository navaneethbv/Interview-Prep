package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

import java.util.Stack;

/*
 * http://www.geeksforgeeks.org/tree-isomorphism-problem/
 * Tree Isomorphism Problem
 */;
/**
 * Implementation of Data Structures_ Binary Tree_42 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_42 {
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
		 binaryTree1.insert(5,"left",7);
		 binaryTree1.insert(5,"right",8);
		 binaryTree1.insert(3,"left",6);
		 binaryTree1.preOrder();
		 _01DataStructures_BinaryTree_00 binaryTree2=new _01DataStructures_BinaryTree_00();
		 binaryTree2.insert(null,null,1);
		 binaryTree2.insert(1,"right",2);
		 binaryTree2.insert(1,"left",3);
		 binaryTree2.insert(2,"right",4);
		 binaryTree2.insert(2,"left",5);
		 binaryTree2.insert(5,"right",7);
		 binaryTree2.insert(5,"left",8);
		 binaryTree2.insert(3,"right",6);
		 binaryTree2.preOrder();
		 System.out.println(checkIsoMorphism(binaryTree1,binaryTree2));

	 }
	 private static boolean checkIsoMorphism(
			 _01DataStructures_BinaryTree_00 binaryTree1,
			 _01DataStructures_BinaryTree_00 binaryTree2) {
		 mirror(binaryTree1);
		 boolean output= checkIsoMorphism(binaryTree1.rootNode,binaryTree2.rootNode);
		 mirror(binaryTree1);
		 return output;
	 }
	 /**
	  * Performs checkIsoMorphism operation.
	  *
	  * @param node1 the node1 parameter
	  * @param node2 the node2 parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean checkIsoMorphism(Node node1, Node node2) {
		 // Check for null/base case
		 if(node1!=null && node2!=null){
			 if(node1.data==node2.data 
					 && checkIsoMorphism(node1.left,node2.left) 
					 && checkIsoMorphism(node1.right,node2.right))
				 return true;
			 else
				 return false;
		 }
		 // Check for null/base case
		 if(node1!=null && node2==null || node1==null&& node2!=null)
			 return false;
		 else
			 return true;

	 }
	 /**
	  * Performs mirror operation.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  */
	 private static void mirror(_01DataStructures_BinaryTree_00 binaryTree1) {
		 mirror(binaryTree1.rootNode);
	 }
	 /**
	  * Performs mirror operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void mirror(Node node) {
		 // Check for null/base case
		 if(node!=null)
		 {
			 mirror(node.left);
			 mirror(node.right);
			 Node temp=node.left;
			 node.left=node.right;
			 node.right=temp;
		 }

	 }

 }

package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

import java.util.Stack;


/*
 * http://www.geeksforgeeks.org/iterative-method-to-find-height-of-binary-tree/
 * Iterative Method to find Height of Binary Tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_43 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_43 {
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
		 System.out.println(getHeight(binaryTree1));

	 }
	 /**
	  * Retrieves height from the data structure.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  * @return the computed integer result
	  */
	 private static int getHeight(_01DataStructures_BinaryTree_00 binaryTree1) {
		 // Recursively process left and right subtrees
		 return getHeight(binaryTree1.rootNode);
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
		 else{
			 tempQueue queue=new tempQueue();
			 queue.add(node);
			 int height=0;

			 while(true){
				 // Check for null/base case
				 if(queue.size()==0)
					 return height;
				 height++;
				 int size=queue.size();
				 while(size>0)
				 {
					 Node n=queue.poll();
					 // Check for null/base case
					 if(n.left!=null)
						 queue.add(n.left);
					 // Check for null/base case
					 if(n.right!=null)
						 queue.add(n.right);
					 size--;
				 }
			 }

		 }
	 }

 }

package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;






/*
 * http://www.geeksforgeeks.org/print-left-view-binary-tree/
 * Print Left View of a Binary Tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_48 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_48 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,12);
		 binaryTree1.insert(12,"left",10);
		 binaryTree1.insert(12,"right",30);
		 binaryTree1.insert(30,"left",25);
		 binaryTree1.insert(30,"right",40);
		 binaryTree1.preOrder();
		 printLeftViewRecursive(binaryTree1);

	 }

	 private static void printLeftViewRecursive(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 printLeftViewRecursive(binaryTree1.rootNode);
	 }

	 /**
	  * Performs printLeftViewRecursive operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void printLeftViewRecursive(Node node) {
		 // Check for null/base case
		 if(node==null)
			 return;
		 tempQueue queue=new tempQueue();
		 queue.add(node);
		 int depth=0;
		 while(!queue.isEmpty()){
			 Node n=queue.poll();
			 int h=getDepth(node,n,1);
			 if(h>depth){
				 System.out.print(n.data+",");
				 depth=h;
			 }
			 // Check for null/base case
			 if(n.left!=null)
				 queue.add(n.left);
			 // Check for null/base case
			 if(n.right!=null)
				 queue.add(n.right); 
		 }

	 }

	 /**
	  * Retrieves depth from the data structure.
	  *
	  * @param node the tree node to process
	  * @param n the size or count parameter
	  * @param i the i parameter
	  * @return the computed integer result
	  */
	 private static int getDepth(Node node, Node n, int i) {

		 // Check for null/base case
		 if(node!=null){
			 if(node.data==n.data)
				 return i;
			 else
			 {
				 int downLevel=getDepth(node.left,n,i+1);
				 if(downLevel!=0)
					 return downLevel;
				 downLevel=getDepth(node.right,n,i+1);
				 return downLevel;
			 }

		 }
		 return 0;
	 }




 }

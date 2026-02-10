package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/find-next-right-node-of-a-given-key/
 * Find next right node of a given key
 */;
/**
 * Implementation of Data Structures_ Binary Tree_45 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_45 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,10);
		 binaryTree1.insert(10,"left",2);
		 binaryTree1.insert(10,"right",6);
		 binaryTree1.insert(2,"left",8);
		 binaryTree1.insert(2,"right",4);
		 binaryTree1.insert(6,"right",5);
		 System.out.println(findNextRight(binaryTree1,2));
	 }

	 private static int findNextRight(
			 _01DataStructures_BinaryTree_00 binaryTree1, int data) {
		 return findNextRight(binaryTree1.rootNode,data);
	 }

	 /**
	  * Finds next right in the data structure.
	  *
	  * @param node the tree node to process
	  * @param data the data parameter
	  * @return the computed integer result
	  */
	 private static int findNextRight(Node node, int data) {
		 tempQueue queue=new tempQueue();
		 queue.add(node);
		 // Check for null/base case
		 if(node!=null){
			 boolean next=false;
			 while(!queue.isEmpty()){
				 Node n=queue.poll();
				 if(next==true)
					 return n.data;
				 if(n.data==(int)data)
					 next=true;
				 //System.out.println(n.data+",");
				 // Check for null/base case
				 if(n.left!=null)
					 queue.add(n.left);
				 // Check for null/base case
				 if(n.right!=null)
					 queue.add(n.right);					
			 }
		 }
		 return -1;
	 }

 }

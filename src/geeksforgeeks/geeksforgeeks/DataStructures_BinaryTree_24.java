package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/get-level-of-a-node-in-a-binary-tree/
 * Get Level of a node in a Binary Tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_24 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_24 {
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
		 binaryTree1.insert(2,"right",5);
		 binaryTree1.insert(2,"left",4);
		 binaryTree1.insert(3,"left",8);
		 binaryTree1.preOrder();
		 System.out.println(getLevel(binaryTree1,8));
	 }

	 private static int getLevel(_01DataStructures_BinaryTree_00 binaryTree1,
			 int data) {
		 return getLevel(binaryTree1.rootNode,data,1);
	 }

	 /**
	  * Retrieves level from the data structure.
	  *
	  * @param node the tree node to process
	  * @param data the data parameter
	  * @param level the level parameter
	  * @return the computed integer result
	  */
	 private static int getLevel(Node node, int data,int level) {
		 // Check for null/base case
		 if(node==null)
			 return 0;
		 if(node.data==data)
			 return level;
		 else
		 {

			 int downLevel= getLevel(node.left,data,level+1);
			 if(downLevel!=0)
				 return downLevel;
			 // Recursively process left and right subtrees
			 return getLevel(node.right,data,level+1);
		 }
	 }
 }

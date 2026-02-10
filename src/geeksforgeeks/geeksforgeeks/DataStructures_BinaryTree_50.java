package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;







/*
 * http://www.geeksforgeeks.org/find-depth-of-the-deepest-odd-level-node/
 * Find depth of the deepest odd level leaf node
 */;
/**
 * Implementation of Data Structures_ Binary Tree_50 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_50 {
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
		 binaryTree1.insert(3,"left",5);
		 binaryTree1.insert(3,"right",6);
		 binaryTree1.insert(5,"right",7);
		 binaryTree1.insert(7,"left",9);
		 binaryTree1.insert(6,"right",8);
		 binaryTree1.insert(8,"right",10);
		 binaryTree1.insert(10,"left",11);
		 binaryTree1.preOrder();
		 System.out.println(findDeepestOddLevelLeaf(binaryTree1));
	 }

	 private static int findDeepestOddLevelLeaf(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 return findDeepestOddLevelLeaf(binaryTree1.rootNode);
	 }

	 /**
	  * Finds deepest odd level leaf in the data structure.
	  *
	  * @param node the tree node to process
	  * @return the computed integer result
	  */
	 private static int findDeepestOddLevelLeaf(Node node) {
		 int level=0;
		 // Check for null/base case
		 if(node!=null){
			 tempQueue queue=new tempQueue();
			 queue.add(node);
			 level=0;
			 while(!queue.isEmpty())
			 {
				 Node n=queue.poll();
				 int nodeLevel=-1;
				 // Check if node is a leaf (no children)
				 if(n.left==null && n.right==null && (nodeLevel=getLevel(node,n,1))%2!=0)
				 {
					 if(nodeLevel>level){
						 level=nodeLevel;
					 }
				 }
				 // Check for null/base case
				 if(n.left!=null)
					 queue.add(n.left);
				 // Check for null/base case
				 if(n.right!=null)
					 queue.add(n.right);
			 }
		 }
		 return level;
	 }

	 /**
	  * Retrieves level from the data structure.
	  *
	  * @param node the tree node to process
	  * @param n the size or count parameter
	  * @param i the i parameter
	  * @return the computed integer result
	  */
	 private static int getLevel(Node node, Node n, int i) {
		 // Check for null/base case
		 if(node==null)
			 return 0;
		 if(node.data==n.data)
			 return i;
		 int level=0;
		 if((level=getLevel(node.left,n,i+1))!=0)
			 return level;
		 // Recursively process left and right subtrees
		 return getLevel(node.right,n,i+1);
	 }



 }
